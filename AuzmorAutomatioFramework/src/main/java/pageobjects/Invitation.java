package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static Basetest.BaseClass.driver;

public class Invitation  {
    @FindBy(xpath="//input[@placeholder='Full Name']")
    WebElement name;

    @FindBy(xpath = "//input[@placeholder='name@example.com']")
    WebElement mail;


    @FindBy(xpath = "//*[@data-testid='normal-btn']")
    WebElement add;

    @FindBy(xpath = "//*[@data-testid='invite-people-send-btn']")
    WebElement sendinvitation;

    public Invitation()
    {
        PageFactory.initElements(driver,this );
    }

    public  void details_form()
    {
        name.sendKeys("Akash jakkula");
        mail.sendKeys("akashjakkula88@gmail.com");
        add.click();
        sendinvitation.click();
    }
}
