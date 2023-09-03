import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationTests {

    WebDriver wd;

    @BeforeMethod
    public void init() {
        wd = new ChromeDriver();
        wd.navigate().to("https://telranedu.web.app/home");
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    public void registrationPositiveTest(){
        //open login form
        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
        //fill login form
        int i = (int)(System.currentTimeMillis()/1000)%3600;
        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys("edpunk_" + i + "@bk.com");

        WebElement passlInput = wd.findElement(By.xpath("//input[2]"));
        passlInput.click();
        passlInput.clear();
        passlInput.sendKeys("Nikonddddddddd12345!!!!!");

        //click on button registration
        wd.findElement(By.xpath("//button[2]")).click();

        //assert
//      pause(3000);
        Assert.assertTrue(wd.findElements(By.tagName("button")).size()>0);


    }


    @Test
    public void registrationNegativeTestWrongLogin_Space(){
        //open login form
        wd.findElement(By.xpath("//*[.='LOGIN']")).click();

        //fill login form
        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys(" ");

        WebElement passlInput = wd.findElement(By.xpath("//input[2]"));
        passlInput.click();
        passlInput.clear();
        passlInput.sendKeys("Nikonddddddddd12345!!!!!");

        //click on button registration
        wd.findElement(By.xpath("//button[2]")).click();

        //assert


    }






    @AfterMethod
    public void tearDown(){
        pause(3000);
        wd.quit();
    }

    public void pause(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
