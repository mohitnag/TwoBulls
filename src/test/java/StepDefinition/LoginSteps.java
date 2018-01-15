package StepDefinition;

import cucumber.api.PendingException;
import PageFactory.Login;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by mohitnag on 14/1/18.
 */
public class LoginSteps {

    private WebDriver driver;
    private Login log;


    @Before
    public void before(){
        String driverPath = System.getProperty("user.dir") + "/Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.manage().window().maximize();
        log = PageFactory.initElements(driver,Login.class);
    }

    @After
    public void after(){
        driver.quit();
    }

    @When("^user sign in with the userid \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_sign_in_with_the_userid_and_password(String arg1, String arg2) throws Throwable {

       log.login(arg1,arg2);
    }

    @And("^user see an error message$")
    public void userSeeAnErrorMessage() throws Throwable {
       log.errorMsg();
    }

    @Given("^user go to url \"([^\"]*)\"$")
    public void userGoToUrl(String arg0) throws Throwable {
       driver.get(arg0);
    }
}
