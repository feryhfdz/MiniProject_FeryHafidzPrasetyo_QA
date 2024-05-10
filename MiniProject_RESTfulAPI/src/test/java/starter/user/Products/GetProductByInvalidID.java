package starter.user.Products;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class GetProductByInvalidID {
    private static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set product API endpoint with invalid ID")
    public String setApiGetEndInvalidIdProduct(){
        return url + "products/1";
    }

    @Step("I send GET request to get product by invalid ID")
    public void sendGetRequestInvalidId(){
        SerenityRest.given().get(setApiGetEndInvalidIdProduct());
    }
}