import com.jayway.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by mohitnag on 14/1/18.
 */
public class QAPI2 {
    @Test
    public void QAPI2() {
       Response response= given().header("app_id", "!no1me2digas!").header("app_key", "0clave42").
                when().get("https://od-api-demo.oxforddictionaries.com:443/api/v1/domains/es/es");
        Assert.assertEquals(response.statusCode(),200);
    }
}
