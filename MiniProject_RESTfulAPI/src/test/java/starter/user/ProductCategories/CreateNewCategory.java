package starter.user.ProductCategories;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class CreateNewCategory {
    private static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set categories API endpoint for create new category")
    public String setApiNewCategory() {
        return url + "categories";
    }

    @Step("I send POST request endpoint with valid input")
    public void sendCreateCategoryRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "work");
        requestBody.put("description", "for work purposess");

        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IlBlcmkgUHJhc2V0eW8iLCJFbWFpbCI6InBlcmkxMkBtYWlsLmNvbSJ9.YtIcNKhdCRK4D26U56gfEkz2HUcpEwIbnkFE5dxsiww";
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(setApiNewCategory());
    }

    @Step("I receive request body input data added successfully")
    public void receiveValidDataForCreateNewCategory() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.CREATE_NEW_CATEGORY_SCHEMA);
        restAssuredThat(response -> response.body("'data'.'ID'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Name'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Description'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}