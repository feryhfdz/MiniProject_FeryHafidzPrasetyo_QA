package starter.user.ProductCategories;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetCategoryByInvalidID {
    private static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set category API endpoint with an invalid ID")
    public String setApiGetEndInvalidIdCategory(){
        return url + "categories/1";
    }

    @Step("I send GET request to get product category using invalid ID")
    public void sendGetRequestCategoryInvalidId(){
        SerenityRest.given().get(setApiGetEndInvalidIdCategory());
    }

    @Step("I receive error message")
    public void receiveErrorMessage(){
        restAssuredThat(response -> response.body("error", Matchers.equalTo("record not found")));
    }
}