package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class PeoplePage extends Homepage {
    @FindBy(xpath = "//*[@data-testid='fab-btn']")
    WebElement addbutton;
    @FindBy(xpath = "//*[@data-testid='invite-people-section']")
    WebElement invitepeople;
    @FindBy(xpath = "//*[@data-testid='invite-people-btn']")
    WebElement add_people;
    public PeoplePage()
    {
        PageFactory.initElements(driver,this);
    }
    public  void people_page() throws InterruptedException {
        addbutton.click();
        Actions a=new Actions(driver);
        Thread.sleep(3000);
        a.moveToElement(invitepeople).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        add_people.click();
    }

}

