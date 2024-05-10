package starter.user.Products;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteProduct {

    private static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set product API endpoint for delete product")
    public String setApiDeleteProductEndpoint() {
        return url + "products/1";
    }

    @Step("I send Delete request to delete product with valid ID")
    public void sendDeleteProductRequest() {
        SerenityRest.given().delete(setApiDeleteProductEndpoint());
    }


}