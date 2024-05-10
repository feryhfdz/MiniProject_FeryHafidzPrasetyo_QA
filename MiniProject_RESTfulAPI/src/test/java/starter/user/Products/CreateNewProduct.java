package starter.user.Products;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class CreateNewProduct {
    private static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set product API endpoint for create new product")
    public String setApiNewProduct() {
        return url + "products";
    }

    @Step("I send POST request for create a new product with valid credentials")
    public void sendCreateProductRequest() {
        JSONObject requestBody = new JSONObject();


        requestBody.put("name", "Sony PS7");
        requestBody.put("description", "FULL POWER");
        requestBody.put("price", 239);

        int [] categoryBody =  {31968};
        requestBody.put("categories", categoryBody);


        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(setApiNewProduct());
    }

    @Step("I receive The product that has been created has been successfully added with a customized ID number")
    public void receiveValidDataForCreateNewProduct() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.CREATE_NEW_PRODUCT_SCHEMA);
        restAssuredThat(response -> response.body("'data'.'ID'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Name'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Description'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Price'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Ratings'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'Categories'", notNullValue()));

       // restAssuredThat(response -> response.body("'data'.'Categories[0]'.'ID'", notNullValue()));
       // restAssuredThat(response -> response.body("'data'.'Categories[0]'.'Name'", notNullValue()));
       // restAssuredThat(response -> response.body("'data'.'Categories[0]'.'Description'", notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}