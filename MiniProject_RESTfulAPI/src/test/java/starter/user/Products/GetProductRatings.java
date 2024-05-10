package starter.user.Products;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductRatings {
    private static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set ratings API endpoint with ID products")
    public String setApiGetEndRatings(){
        return url + "products/88701/ratings";
    }

    @Step("I send GET request for get product ratings")
    public void sendGetRequestRatingInvalidId(){
        SerenityRest.given().get(setApiGetEndRatings());
    }

    @Step("I receive all of product ratings using valid ID")
    public void receiveValidRatings(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_PRODUCT_RATINGS_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}