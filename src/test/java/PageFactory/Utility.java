package PageFactory;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by mohitnag on 14/1/18.
 */
public class Utility {

    public static void click(WebElement element){
        element.click();
    }

    public static void enterText(WebElement element, String text){
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    public static void waitForElementVisible(WebElement element,WebDriver driver){
        FluentWait fluentWait = new FluentWait(driver);
        fluentWait.withTimeout(10, TimeUnit.SECONDS)
                    .pollingEvery(1,TimeUnit.SECONDS)
                    .ignoring(NoSuchElementException.class);
        fluentWait.until(ExpectedConditions.visibilityOf(element));

    }
}
