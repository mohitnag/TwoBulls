package StepDefinition;

import com.sun.tools.javac.util.Convert;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.response.Response;
import org.junit.*;


/**
 * Created by mohitnag on 15/1/18.
 */
public class ApiSteps {
    Response response;

    @Given("^user post the request to the EndPoint \"([^\"]*)\" with userId \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_post_the_request_to_the_EndPoint_with_userId_and_password(String arg1, String arg2, String arg3) throws Throwable {
        response= given().param("user_id",arg2).param("password",arg3).
                when().post(arg1);
    }

    @Given("^user do Get request to the EndPoint \"([^\"]*)\" with appId \"([^\"]*)\" and appKey \"([^\"]*)\"$")
    public void userDoGetRequestToTheEndPointWithAppIdAndAppKey(String arg0, String arg1, String arg2) throws Throwable {
        response= given().header("app_id", arg1).header("app_key", arg2).
                when().get(arg0);
    }

    @Then("^I verify the status code (\\d+)$")
    public void iVerifyTheStatusCode(int arg0) throws Throwable {
        Assert.assertEquals(response.statusCode(), arg0);
    }
}
