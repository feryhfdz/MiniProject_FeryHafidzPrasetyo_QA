package starter.stepdefinitions.Products;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Products.GetProductByInvalidID;


public class GetProductByInvalidIDSteps {

    @Steps
    GetProductByInvalidID getProfileInvalidID;

    @Given("I set product API endpoint with invalid ID")
    public void setApiGetEndInvalidIdProfile(){

        getProfileInvalidID.setApiGetEndInvalidIdProduct();
    }

    @When("I send GET request to get product by invalid ID")
    public void sendGetRequestInvalidIdProfile(){
        getProfileInvalidID.sendGetRequestInvalidId();
    }

}