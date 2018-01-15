package PageFactory;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static PageFactory.Utility.*;

/**
 * Created by mohitnag on 14/1/18.
 */
public class Login extends BaseScreen{

    public Login(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "MY ACCOUNT")
    private WebElement myAccount;

    @FindBy(name = "login[username]")
    private WebElement userName;

    @FindBy(id = "pass")
    private WebElement password;

    @FindBy(id = "send2")
    private WebElement submit;

    @FindBy(css = "li.error-msg")
    private WebElement err;

    public void login(String usrid, String pwd){
        waitForElementVisible(myAccount,driver);
        click(myAccount);
        waitForElementVisible(userName,driver);
        enterText(userName,usrid);
        enterText(password,pwd);
        click(submit);

    }

    public void errorMsg(){
        waitForElementVisible(err,driver);
        Assert.assertTrue(driver.findElements(By.cssSelector("li.error-msg")).size()>0);
    }

}
