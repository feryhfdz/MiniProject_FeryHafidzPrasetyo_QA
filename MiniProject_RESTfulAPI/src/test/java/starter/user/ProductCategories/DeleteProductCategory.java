package starter.user.ProductCategories;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class DeleteProductCategory {

    private static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set categories API endpoint for delete product category with valid ID")
    public String setApiDeleteCategoryEndpoint() {
        return url + "categories/1";
    }

    @Step("I send DELETE request endpoint")
    public void sendDeleteCategoryRequest() {
        SerenityRest.given().delete(setApiDeleteCategoryEndpoint());
    }

    @Step("I receive response body")
    public void receiveResponseBody() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.DELETE_CATEGORY_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
