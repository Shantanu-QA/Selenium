package testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

@Test
public class MyntraHomePageTest {

    public static void initialization() {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
            WebDriver driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.navigate().to("https://www.myntra.com");
            //dismissAlert(driver);
            //driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception is:" + e);
        }
    }

    /*public static void dismissAlert(WebDriver driver)
    {
        this.driver=driver;
        Alert alert = new Alert();
        alert.dismiss();
    }*/
}