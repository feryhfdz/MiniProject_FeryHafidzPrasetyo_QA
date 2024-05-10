package starter.user.Products;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;
// import starter.utils.ProductGetter;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetProductComment {
    private static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set comments api endpoint for get product comments")
    public String setApiGetEndComment(){
       // int productId = ProductGetter.getProductID();
        return url + "products/88701/comments";
    }

    @Step("I send GET request to get product comment")
    public void sendGetRequestCommentInvalidID(){
        SerenityRest.given().get(setApiGetEndComment());
    }

    @Step("I receive detail information product comment")
    public void receiveValidComment(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_PRODUCT_COMMENTS_SCHEMA);
        restAssuredThat(response -> response.body("'data'.'ID'",notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Content'",notNullValue()));
        restAssuredThat(response -> response.body("'data'.'User'",notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Product'",notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Comment'",notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}