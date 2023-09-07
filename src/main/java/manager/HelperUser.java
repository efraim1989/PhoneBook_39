package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperUser extends HelperBase{

    public HelperUser(WebDriver wd){
        super(wd);
    }



    public boolean isLogged(){
        return isElementPresent(By.xpath("//*[.='Sign Out']"));
    }

    public void logout(){
        click(By.xpath("//*[.='Sign Out']"));

    }

    public void submitLogin(){

        wd.findElement(By.xpath("//button[1]")).click();

    }

    public void submitRegistration(){

        wd.findElement(By.xpath("//button[2]")).click();

    }

    public void fillLoginRegistrationForm(String email, String password){

//        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys(email);
//
//        WebElement passlInput = wd.findElement(By.xpath("//input[2]"));
//        passlInput.click();
//        passlInput.clear();
//        passlInput.sendKeys(password);

        type(By.xpath("//input[1]"), email);
        type(By.xpath("//input[2]"), password);

    }

    public void fillRegistrationForm(String email, String password) {
        int i = (int)(System.currentTimeMillis()/1000)%3600;

        String newEmail = email.substring(0, email.indexOf("@")) + i + email.substring(email.indexOf("@"));

        type(By.xpath("//input[1]"), newEmail);
        type(By.xpath("//input[2]"), password);
    }

    public void openLoginRegistrationForm(){
        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
    }


}
