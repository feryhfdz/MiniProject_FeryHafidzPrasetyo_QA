package starter.user.Products;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class AssignProductRating {
    private static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set ratings API endpoint")
    public String setApiRating() {
        return url + "products/88701/ratings";
    }

    @Step("I send POST request body for assign a product rating")
    public void sendAssignProductRating() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("count", 4);

        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IlBlcmkgUHJhc2V0eW8iLCJFbWFpbCI6InBlcmkxMkBtYWlsLmNvbSJ9.YtIcNKhdCRK4D26U56gfEkz2HUcpEwIbnkFE5dxsiww";
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(setApiRating());
    }

    @Step("I receive detailed products with ratings that have been entered in the request body")
    public void receiveValidDataForAssignRating() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.ASSIGN_RATING_SCHEMA);
        restAssuredThat(response -> response.body("'data'.'ID'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Name'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Description'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Price'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Ratings'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Categories'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}