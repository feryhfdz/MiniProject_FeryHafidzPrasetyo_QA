package starter.stepdefinitions.ProductCategories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.ProductCategories.GetCategoryByInvalidID;


public class GetCategoryByInvalidIDSteps {

    @Steps
    GetCategoryByInvalidID getProductCategoryByInvalidID;

    @Given("I set category API endpoint with an invalid ID")
    public void setApiGetEndInvalidIdProfile(){
        getProductCategoryByInvalidID.setApiGetEndInvalidIdCategory();
    }

    @When("I send GET request to get product category using invalid ID")
    public void sendGetRequestInvalidIdProfile(){
        getProductCategoryByInvalidID.sendGetRequestCategoryInvalidId();
    }

    @And("I receive error message")
    public void ReceiveMessageErrorInv(){
        getProductCategoryByInvalidID.receiveErrorMessage();
    }
}