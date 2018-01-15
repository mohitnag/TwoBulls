/**
 * Created by mohitnag on 14/1/18.
 */
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import org.junit.*;
public class QAPI1 {
    @Test
    public void QAPI1()
    {
        Response response= RestAssured. given().param("user_id","70f3fc6beac4412b82db266b4796b").param("password","123456").
                when().post("http://passwordutility.net:80/api/password/generate");
        Assert.assertEquals(response.statusCode(),200);
    }

}
