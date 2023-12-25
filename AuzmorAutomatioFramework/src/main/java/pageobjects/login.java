package pageobjects;

import Basetest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class login extends BaseClass {
    @FindBy(xpath = "//*[@type='text']")
    WebElement username;
    @FindBy(xpath = "//*[@type='password']")
    WebElement password;

    @FindBy(xpath = "//*[@data-testid='login-submit-btn']")
    WebElement signinButoon;

    public login()
    {
        PageFactory.initElements(driver,this);
    }


    public void login_page()
    {
        username.sendKeys("utaorg1ad1@mailinator.com");
        password.sendKeys("Test@123");
        signinButoon.click();

    }
    public void mylogin(){
        username.sendKeys("akashjakkula88@gmail.com");
        password.sendKeys("Akash@8897430788");
        signinButoon.click();
    }
}
