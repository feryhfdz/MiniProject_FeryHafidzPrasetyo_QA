package starter.user.Order;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class GetOrderByInvalidID {
    private static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set order API endpoint with invalid ID")
    public String setApiGetEndInvalidIdOrder(){
        return url + "products/1";
    }

    @Step("I send GET request to get order information by invalid ID")
    public void sendGetRequestInvalidIdOrder(){
        SerenityRest.given().get(setApiGetEndInvalidIdOrder());
    }

}
