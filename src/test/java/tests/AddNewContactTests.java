package tests;

import manager.ProviderData;
import models.Contact;
import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewContactTests extends TestBase{

    @BeforeMethod(alwaysRun = true)
    public void precondition(){
        if(!app.getHelperUser().isLogged()) app.getHelperUser().login(
//                (User.builder()
//                        .email("edpunk@bk.com")
//                        .password("Nikonddddddddd12345!!!!!")
//                        .build());
        app.getEmail(), app.getPassword());

    }

    @Test(invocationCount = 3, groups = {"positive", "smoke",})
    public void addNewContactPositive(){

        int i = (int)(System.currentTimeMillis()/1000%3600);
        Contact contact = Contact.builder()
                .name("Eduardo")
                .lastName("Rio")
                .phone("123456789" + i)
                .email("john_" + i + "@mail.com")
                .address("Rehovot")
                .description("Pirate")
                .build();

        app.getHelperContact().openContactForm();
        app.getHelperContact().fillContactForm(contact);
        app.getHelperContact().submitContactForm();
        Assert.assertTrue(app.getHelperContact().isContactCreated(contact));
    }
    @Test(groups = {"positive", "smoke",}, dataProvider = "ContactDTO", dataProviderClass = ProviderData.class)
    public void addNewContactPositiveDTO(Contact contact){

        app.getHelperContact().openContactForm();
        app.getHelperContact().fillContactForm(contact);
        app.getHelperContact().submitContactForm();
        Assert.assertTrue(app.getHelperContact().isContactCreated(contact));

    }


}
