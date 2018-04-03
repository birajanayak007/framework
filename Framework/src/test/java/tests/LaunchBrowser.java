package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by anshuman on 03-04-2018.
 */
public class LaunchBrowser {
    WebDriver driver;

    @Test
    public void launchBrowser(){
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\anshuman\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe" );
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.gmail.com");

    }

}


