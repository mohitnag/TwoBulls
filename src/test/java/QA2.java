import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


/**
 * Created by mohitnag on 13/1/18.
 */
public class QA2 {
    @Test
    public void magentoTrial(){
        String driverPath = System.getProperty("user.dir") + "/Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.get("http://enterprise-demo.user.magentotrial.com");
        driver.manage().window().fullscreen();
        WebElement myAccount = driver.findElement(By.linkText("MY ACCOUNT"));
        FluentWait fWait = new FluentWait(driver);
        fWait.withTimeout(10, TimeUnit.SECONDS)
                .pollingEvery(1,TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        fWait.until(ExpectedConditions.elementToBeClickable(myAccount));
        myAccount.click();
        fWait.withTimeout(10, TimeUnit.SECONDS)
                .pollingEvery(1,TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        fWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("login[username]"))));
        WebElement username= driver.findElement(By.name("login[username]"));
        username.click();
        username.sendKeys("test@pixafy.com");
        WebElement password= driver.findElement(By.id("pass"));
        password.click();
        password.sendKeys("123456");
        WebElement submit = driver.findElement(By.id("send2"));
        submit.click();
        WebDriverWait wait= new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.error-msg")));
        Assert.assertTrue(driver.findElements(By.cssSelector("li.error-msg")).size()>0);
        driver.quit();




    }
}
