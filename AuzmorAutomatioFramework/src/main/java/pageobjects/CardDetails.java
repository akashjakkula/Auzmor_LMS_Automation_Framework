package pageobjects;

import Basetest.BaseClass;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CardDetails extends BaseClass {

    @FindBy(xpath = "//*[@id='line1']")
    WebElement address1;

    @FindBy(xpath = "//*[@id='city']")
    WebElement city1;

    @FindBy(xpath = "//*[@id='state']")
    WebElement state1;

    @FindBy(xpath = "//*[@id='postal_code']")
    WebElement zipcode1;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[3]/div/div/div/div/form/fieldset[2]/div/div/div/iframe")
    WebElement iFrame;
    @FindBy(xpath = "//*[@placeholder='Card number']")
    WebElement cardno1;

    @FindBy(xpath = "//*[@placeholder='MM / YY']")
    WebElement expiry1;

    @FindBy(xpath = "//*[@placeholder='CVC']")
    WebElement cvv1;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[3]/div/div/div/div/form/button")
    WebElement finalsubmit;

    public CardDetails(){
        PageFactory.initElements(driver,this);
    }

    public void fill_details(){
        address1.sendKeys("20A St.Lawrence Toronto");
        city1.sendKeys("Toronto");
        state1.sendKeys("MD");
        zipcode1.sendKeys("21201");
        driver.switchTo().frame(iFrame);
        cardno1.sendKeys("4242 4242 4242 4242");
        expiry1.sendKeys("02 / 24");
        cvv1.sendKeys("422");
        driver.switchTo().defaultContent();
        finalsubmit.click();

    }


}
