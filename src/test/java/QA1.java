/**
 * Created by mohitnag on 13/1/18.
 */

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.System;


public class QA1 {

    @Test
    public void googleQA(){
        String driverPath = System.getProperty("user.dir") + "/Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        driver.manage().window().fullscreen();
        WebElement searchBox= driver.findElement(By.id("lst-ib"));
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(searchBox));
        searchBox.sendKeys("QA");
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();
        WebElement qaLink = driver.findElement(By.linkText("QA - Wikipedia"));
        wait.until(ExpectedConditions.elementToBeClickable(qaLink));
        qaLink.click();
        WebElement qualityAssurance= driver.findElement(By.linkText("Quality assurance"));
        wait.until(ExpectedConditions.visibilityOf(qualityAssurance));
        driver.quit();


    }

}
