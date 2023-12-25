package pageobjects;

import Basetest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmPayment extends BaseClass {

    @FindBy(xpath = "//*[@name='Contact Number']")
    WebElement phno;
    @FindBy(xpath = "//button[@data-testid='confirm-payment-btn']")
    WebElement proceed;

    @FindBy(xpath = "//*[@placeholder='Add zip code']")
    WebElement zipcode;

    @FindBy(xpath = "//*[@placeholder='Add country']")
    WebElement country;

    @FindBy(xpath = "//*[@placeholder='Add city']")
    WebElement city;

    @FindBy(xpath = "//*[@placeholder='Add state']")
    WebElement state;

    @FindBy(xpath = "//*[@placeholder='20A St.Lawrence Toronto']")
    WebElement address;

    @FindBy(xpath = "//button[@data-testid='confirm-payment-btn']")
    WebElement confirmpayment;


    public ConfirmPayment(){
        PageFactory.initElements(driver,this);
    }

    public void confirm_payment() throws Exception{
        phno.clear();
        phno.sendKeys("+918897430788");
        proceed.click();
        Thread.sleep(2000);
        zipcode.clear();
        zipcode.sendKeys("533101");
        country.clear();
        country.sendKeys("India");
        city.clear();
        city.sendKeys("Rajahmundry");
        state.clear();
        state.sendKeys("Andhra pradesh");
        address.clear();
        address.sendKeys("Arryapuram, Rajahmundry, India.");
        Thread.sleep(3000);
        confirmpayment.click();
    }
}
