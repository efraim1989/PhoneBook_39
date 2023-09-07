package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{


    @Test
    public void registrationPositiveTest(){
        //open login form
//        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
        app.getHelperUser().openLoginRegistrationForm();

        //fill login form
        app.getHelperUser().fillRegistrationForm("edpunk@bk.com", "Nikonddddddddd12345!!!!!");

//        int i = (int)(System.currentTimeMillis()/1000)%3600;
//        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys("edpunk_" + i + "@bk.com");
//
//        WebElement passlInput = wd.findElement(By.xpath("//input[2]"));
//        passlInput.click();
//        passlInput.clear();
//        passlInput.sendKeys("Nikonddddddddd12345!!!!!");

        //click on button registration
        app.getHelperUser().submitRegistration();
//        wd.findElement(By.xpath("//button[2]")).click();
//
//        //assert
//        pause(3000);
        app.getHelperUser().pause(3000);
//        Assert.assertTrue(wd.findElements(By.tagName("button")).size()>0);
        Assert.assertTrue(app.getHelperUser().isElementPresent(By.tagName("button")));

    }


    @Test
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
