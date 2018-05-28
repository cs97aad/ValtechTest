package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import util.driverManager;

public class homePom extends driverManager {

    String baseUrl = "https://www.valtech.com/";


    public void launchUrl(){
        driver.get(baseUrl);
    }

    public void confirmLatestnewssection(){
        driver.findElement(By.id("CybotCookiebotDialogBodyButtonAccept")).click();
        String confirmLatesnewstext = driver.findElement(By.tagName("h2")).getText();
        String expectedText = "LATEST NEWS";
        Assert.assertEquals(confirmLatesnewstext, expectedText);
    }
    public void navMenu(){
        driver.findElement(By.className("icons glyph")).click();
    }
public void clickAbouttab(){
        driver.findElement(By.id("")).click();
}

    public void clickServicestab(){
        driver.findElement(By.id("")).click();
    }
    public void clickWorktab(){
        driver.findElement(By.id("")).click();
    }
}
