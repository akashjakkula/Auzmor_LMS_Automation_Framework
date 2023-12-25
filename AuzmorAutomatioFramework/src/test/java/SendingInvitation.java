import Basetest.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.Homepage;
import pageobjects.Invitation;
import pageobjects.PeoplePage;
import pageobjects.login;

public class SendingInvitation extends BaseClass {

    @BeforeMethod
    public void sending() throws Exception {
        launchBrowser();
        login lo=new login();
        lo.login_page();
    }
    @Test
    public void SendInvitation() throws Exception {

        Homepage hp=new Homepage();
        hp.Homepage_overview();
        PeoplePage cp=new PeoplePage();
        cp.people_page();
        Invitation invite=new Invitation();
        invite.details_form();
    }
    @AfterMethod
    public void Sended() throws Throwable
    {
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(7000);
        driver.close();
    }

}
