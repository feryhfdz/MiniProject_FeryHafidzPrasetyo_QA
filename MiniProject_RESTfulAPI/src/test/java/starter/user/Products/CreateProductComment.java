package starter.user.Products;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;

public class CreateProductComment {

    private static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set comments API endpoint for create product comment")
    public String setApiNewComment() {
        return url + "products/88967/comments";
    }

    @Step("I send POST request endpoint for create a comment product")
    public void sendCreateComment() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("content", "GTA5 is the best game ever");

        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IlBlcmkgUHJhc2V0eW8iLCJFbWFpbCI6InBlcmkxMkBtYWlsLmNvbSJ9.YtIcNKhdCRK4D26U56gfEkz2HUcpEwIbnkFE5dxsiww";
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(setApiNewComment());
    }

    @Step("I receive detail information comment product has been created")
    public void receiveValidDataForCreateNewComment() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.CREATE_COMMENT_SCHEMA);

        restAssuredThat(response -> response.body("'data'.'ID'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Content'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'User'", nullValue()));
        restAssuredThat(response -> response.body("'data'.'Product'", nullValue()));
        restAssuredThat(response -> response.body("'data'.'Comment'", nullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}