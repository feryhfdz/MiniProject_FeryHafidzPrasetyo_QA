package starter.user.Authentication;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetUserInformation {

    private static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set info API endpoint to get user information")
    public String setApiUserInformation(){
        return url + "auth/info";
    }

    @Step("I send GET request to get user information")
    public void sendRequestUserInformation(){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IlBlcmkgUHJhc2V0eW8iLCJFbWFpbCI6InBlcmkxMkBtYWlsLmNvbSJ9.YtIcNKhdCRK4D26U56gfEkz2HUcpEwIbnkFE5dxsiww";
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .get(setApiUserInformation());
    }

    @Step("I receive all of user information")
    public void receiveValidInfo(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_USER_INFO_SCHEMA);

        restAssuredThat(response -> response.body("'data'.'ID'",notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Fullname'",notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Email'",notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Password'",notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));

    }
}