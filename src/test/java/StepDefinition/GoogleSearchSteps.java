package StepDefinition;

import PageFactory.GoogleSearch;
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
public class GoogleSearchSteps {
    private WebDriver driver;
    private GoogleSearch googleSearch;


    @Before
    public void before(){
        String driverPath = System.getProperty("user.dir") + "/Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        googleSearch = PageFactory.initElements(driver,GoogleSearch.class);
    }

    @After
    public void after(){
        driver.quit();
    }

    @Given("^user navigates to url \"([^\"]*)\"$")
    public void userNavigatesToUrl(String arg0) throws Throwable {
        driver.get(arg0);
    }

    @When("^user search for text \"([^\"]*)\"$")
    public void userSearchForText(String arg0) throws Throwable {
        googleSearch.search(arg0);
    }


    @And("^user wait for link \"([^\"]*)\" to be visible and click$")
    public void userWaitForLinkToBeVisibleAndClick(String arg0) throws Throwable {
       googleSearch.clickLink(arg0);
    }

    @And("^user verifies the link \"([^\"]*)\"$")
    public void userVerifiesTheLink(String arg0) throws Throwable {
        googleSearch.verifyLinkPresent(arg0);
    }


}
