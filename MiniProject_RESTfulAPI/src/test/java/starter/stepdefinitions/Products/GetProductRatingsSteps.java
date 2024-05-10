package starter.stepdefinitions.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Products.GetProductRatings;

public class GetProductRatingsSteps {

    @Steps
    GetProductRatings getProductRatingsByValidID;

    @Given("I set ratings API endpoint with ID products")
    public void setApiGetEndInvalidIdProfile(){
        getProductRatingsByValidID.setApiGetEndRatings();
    }

    @When("I send GET request for get product ratings")
    public void sendGetRequestInvalidIdProfile(){
        getProductRatingsByValidID.sendGetRequestRatingInvalidId();
    }

    @And("I receive all of product ratings using valid ID")
    public void receiveValidProfile(){
        getProductRatingsByValidID.receiveValidRatings();
    }

}