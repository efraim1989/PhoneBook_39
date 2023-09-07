package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

//    WebDriver wd;

//    @BeforeMethod
//    public void init() {
//        wd = new ChromeDriver();
//        wd.navigate().to("https://telranedu.web.app/home");
//        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//    }


    @Test
    public void loginPositiveTest(){



        //open login form
//        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
        app.getHelperUser().openLoginRegistrationForm();

        //fill login form
//        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys("edpunk@bk.com");
//
//        WebElement passlInput = wd.findElement(By.xpath("//input[2]"));
//        passlInput.click();
//        passlInput.clear();
//        passlInput.sendKeys("Nikonddddddddd12345!!!!!");

        app.getHelperUser().fillLoginRegistrationForm("edpunk@bk.com", "Nikonddddddddd12345!!!!!");

        //click on button login
     //   wd.findElement(By.xpath("//button[1]")).click();
        app.getHelperUser().submitLogin();

        //assert
        app.getHelperUser().pause(3000);
      //  Assert.assertTrue(wd.findElements(By.tagName("button")).size()>0);
        Assert.assertTrue(app.getHelperUser().isElementPresent(By.tagName("button")));



    }

    @Test
    public void loginNegativeTestWrongEmail_noAte(){
        //open login form
//        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
        app.getHelperUser().openLoginRegistrationForm();
        //fill login form
        app.getHelperUser().fillLoginRegistrationForm("edpunkbk.com", "Nikonddddddddd12345!!!!!");
//        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys("edpunkbk.com");
//
//        WebElement passlInput = wd.findElement(By.xpath("//input[2]"));
//        passlInput.click();
//        passlInput.clear();
//        passlInput.sendKeys("Nikonddddddddd12345!!!!!");
//
        //click on button login
//        wd.findElement(By.xpath("//button[1]")).click();
        app.getHelperUser().submitLogin();

//        //assert
//        pause(3000);
        app.getHelperUser().pause(3000);

//        Assert.assertTrue(isAlertPresent());
        Assert.assertTrue(app.getHelperUser().isAlertPresent());
    }

    @Test
    public void loginNegativeTestWrongPass_noLetters() {
        //open login form
//        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
        app.getHelperUser().openLoginRegistrationForm();
        //fill login form
        app.getHelperUser().fillLoginRegistrationForm("edpunk@bk.com", "12345!!!!!");
//        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys("edpunk@bk.com");
//
//        WebElement passlInput = wd.findElement(By.xpath("//input[2]"));
//        passlInput.click();
//        passlInput.clear();
//        passlInput.sendKeys("12345!!!!!");
//
//        //click on button login
//        wd.findElement(By.xpath("//button[1]")).click();
        app.getHelperUser().submitLogin();
//        //assert
//        pause(3000);
        app.getHelperUser().pause(3000);

//        Assert.assertTrue(isAlertPresent());
        Assert.assertTrue(app.getHelperUser().isAlertPresent());

    }

}



//    @AfterMethod
//    public void tearDown(){
//        pause(3000);
//        wd.quit();
//    }
//
//
//    public void pause(int millis){
//        try {
//            Thread.sleep(millis);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//
//    public boolean isAlertPresent(){
//        Alert alert = new WebDriverWait(wd, 5)
//                .until(ExpectedConditions.alertIsPresent());
//        if (alert == null) return false;
//        wd.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();
//
//        return true;
//    }


