package pageobjects;

import Basetest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class Homepage extends BaseClass {

    @FindBy(xpath="//*[@data-testid='filter-by-company']")
    WebElement comapnytag;

    @FindBy(xpath = "//*[@data-testid='peoples-menu']")
    WebElement peopletag;


    @FindBy(xpath = "//*[@data-testid='trainings-menu']")
    WebElement training;

    public Homepage()
    {
        PageFactory.initElements(driver,this);
    }

    public  void Homepage_overview() throws InterruptedException {
        Actions a=new Actions(driver);
        Thread.sleep(5000);
        a.moveToElement(comapnytag).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        peopletag.click();
    }

    public void Training(){
        training.click();
    }
}
