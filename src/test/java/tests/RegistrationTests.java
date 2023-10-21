package tests;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{

    @BeforeMethod(alwaysRun = true)
    public void precondition(){
        if (app.getHelperUser().isLogged()) {
            app.getHelperUser().logout();
        }
    }




    @Test(groups = {"positive"})
    public void registrationPositiveTest(){

        String email = "edpunk@bk.com";
        String password = "Nikonddddddddd12345!!!!!";


        //open login form
        app.getHelperUser().openLoginRegistrationForm();

        //fill login form
        app.getHelperUser().fillRegistrationForm(email, password);


        //click on button registration
        app.getHelperUser().submitRegistration();

        //assert
        app.getHelperUser().pause(3000);
        logger.info("registrationPositiveTest starts with:" + email + " & " + password);
        Assert.assertTrue(app.getHelperUser().isElementPresent(By.tagName("button")));

    }
    @Test(groups = {"positive"})
    public void registrationPositiveTestModel(){

        int i = (int)(System.currentTimeMillis()/1000)%3600;



        User user = User.builder()
                .email("edpunk_" + i + "@bk.com")
                .password("Nikonddddddddd12345!!!!!").build();

        //open login form
        app.getHelperUser().openLoginRegistrationForm();

        //fill login form
        app.getHelperUser().fillRegistrationForm(user);


        //click on button registration
        app.getHelperUser().submitRegistration();

        //assert
        app.getHelperUser().pause(3000);
        Assert.assertTrue(app.getHelperUser().isElementPresent(By.tagName("button")));

    }


    @Test(groups = {"negative"})
    public void registrationNegativeTestWrongLogin_Space(){
        //open login form
        app.getHelperUser().openLoginRegistrationForm();

//        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
//
//        //fill login form
        app.getHelperUser().fillLoginRegistrationForm(" ", "Nikonddddddddd12345!!!!!");

//        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys(" ");
//
//        WebElement passlInput = wd.findElement(By.xpath("//input[2]"));
//        passlInput.click();
//        passlInput.clear();
//        passlInput.sendKeys("Nikonddddddddd12345!!!!!");
//
//        //click on button registration
        app.getHelperUser().submitRegistration();

//        wd.findElement(By.xpath("//button[2]")).click();
//
//        //assert
        app.getHelperUser().pause(3000);
//        Assert.assertTrue(isAlertPresent());
        Assert.assertTrue(app.getHelperUser().isAlertPresent());

//
//
    }


}
