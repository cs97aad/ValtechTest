package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverManager {

    public static WebDriver driver;

    public void setdriver(String browser){

        if(driver == null){
            if (browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", "/Users/IOdunlami/Downloads/chromedriver");
                driver = new ChromeDriver();
            }
        }
    }
    public void tearDown(){
        driver.quit();
        driver = null;
    }


}
