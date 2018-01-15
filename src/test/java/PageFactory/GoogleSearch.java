package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static PageFactory.Utility.*;

/**
 * Created by mohitnag on 14/1/18.
 */
public class GoogleSearch extends BaseScreen{

    public GoogleSearch(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "lst-ib")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private WebElement searchButton;

//    public void googleQA(){
//        driver.get("http://www.google.com");
//    }

    public void search(String text){
        waitForElementVisible(searchBox,driver);
        enterText(searchBox,text);
        click(searchButton);
    }

    public void clickLink(String linkText){
        WebElement link = driver.findElement(By.linkText(linkText));
        waitForElementVisible(link,driver);
        click(link);
    }

    public void verifyLinkPresent(String linkText ){
        WebElement link = driver.findElement(By.linkText(linkText));
        waitForElementVisible(link,driver);
    }



}
