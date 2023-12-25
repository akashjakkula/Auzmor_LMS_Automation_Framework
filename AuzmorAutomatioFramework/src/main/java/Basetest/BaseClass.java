package Basetest;
//import java.lang.String;
import java.time.Duration;

import Utilities.ReadPropertyFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
    public static WebDriver driver;
    public static void launchBrowser() throws Exception{

        String browser = ReadPropertyFile.getProperty1("browser");
        //String url = ReadPropertyFile.getProperty1("url");
        String url = ReadPropertyFile.getProperty1("url");

        if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.manage().window().maximize();
        //System.out.println("this is url : "+url);
        driver.get(url);
    }
}

