package pageobjects;

import Basetest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LearnerView extends BaseClass {

    @FindBy(xpath = "//*[@data-testid='price-tag']")
    WebElement pricetag;

    @FindBy(xpath = "//button[@data-testid='buy-now']")
    WebElement buynowbutton;

    @FindBy(xpath = "//button[@data-testid='checkout-btn']")
    WebElement checkoutbutton;

    public LearnerView(){
        PageFactory.initElements(driver,this);
    }

    public void Learner_view(){
        pricetag.click();
        buynowbutton.click();
        checkoutbutton.click();
    }
}
