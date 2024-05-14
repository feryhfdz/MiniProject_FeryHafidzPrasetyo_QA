package starter.user.Order;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;

public class GetOrderByID {

    private static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set order API endpoint by ID")
    public String setApiMyOrderById(){
        return url + "orders/14009";
    }

    @Step("I send GET request to get order information by ID")
    public void sendRequestMyOrderById(){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IlBlcmkgUHJhc2V0eW8iLCJFbWFpbCI6InBlcmkxMkBtYWlsLmNvbSJ9.YtIcNKhdCRK4D26U56gfEkz2HUcpEwIbnkFE5dxsiww";
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .get(setApiMyOrderById());
    }

    @Step("I receive detail order information by ID")
    public void receiveValidOrderById(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ORDER_BY_ID_SCHEMA);

        restAssuredThat(response -> response.body("'data'.'ID'", notNullValue()));

        restAssuredThat(response -> response.body("'data'.'User'.'ID'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'User'.'Fullname'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'User'.'Email'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'User'.'Password'", notNullValue()));

        restAssuredThat(response -> response.body("'data'.'Product'.'ID'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Product'.'Name'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Product'.'Description'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Product'.'Price'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Product'.'Ratings'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Product'.'Categories'", notNullValue()));

        restAssuredThat(response -> response.body("'data'.'Quantity'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));

    }

}