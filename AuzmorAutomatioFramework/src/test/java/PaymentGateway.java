import Basetest.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.*;

public class PaymentGateway extends BaseClass {

    @BeforeMethod
    public void payment() throws Exception{
        launchBrowser();
        login lo = new login();
        lo.mylogin();
        Homepage hp = new Homepage();
        hp.Training();
    }

    @Test
    public void coursepayment() throws Throwable {
        LearnerView learn = new LearnerView();
        learn.Learner_view();
        ConfirmPayment confirm = new ConfirmPayment();
        confirm.confirm_payment();
        Thread.sleep(5000);
        CardDetails cardDetails = new CardDetails();
        cardDetails.fill_details();
    }
    @AfterMethod
    public void paymnetdone() throws Throwable{
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(5000);
        driver.close();
    }
}
