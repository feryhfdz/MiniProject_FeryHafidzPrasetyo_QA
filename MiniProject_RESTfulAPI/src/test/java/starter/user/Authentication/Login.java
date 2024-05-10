package starter.user.Authentication;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class Login {

    private static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set API endpoint to Login")
    public String setApiLogin() {
        return url + "auth/login";
    }

    @Step("I send request to login and fill valid credential(email, password)")
    public void sendLoginValid() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "peri12@mail.com");
        requestBody.put("password", "12121212");

        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IlBlcmkgUHJhc2V0eW8iLCJFbWFpbCI6InBlcmkxMkBtYWlsLmNvbSJ9.YtIcNKhdCRK4D26U56gfEkz2HUcpEwIbnkFE5dxsiww";
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(setApiLogin());
    }

    @Step("I receive my logged in account data")
    public void receiveValidLogin() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.LOGIN_SCHEMA);

        restAssuredThat(response -> response.body("data", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }


    @Step("I send request to login and fill blank credentials")
    public void sendLoginBlank() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "");
        requestBody.put("password", "12121212");

        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IlBlcmkgUHJhc2V0eW8iLCJFbWFpbCI6InBlcmkxMkBtYWlsLmNvbSJ9.YtIcNKhdCRK4D26U56gfEkz2HUcpEwIbnkFE5dxsiww";
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
              //  .header("User-Agent", "PostmanRuntime/7.34.0")
              //  .header("Accept", "*/*")
              //  .header("Accept-Encoding", "gzip, deflate, br")
              //  .header("Connection", "keep-alive")
                .body(requestBody.toString())
                .post(setApiLogin());
    }

    @Step("I receive error message with empty field")
    public void receiveErrorMessageEmptyField(){
        restAssuredThat(response -> response.body("error", Matchers.equalTo("email is required")));
    }

}