package starter.stepdefinitions.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Products.GetProductByID;


public class GetProductByIDSteps {

    @Steps
    GetProductByID getProductByID;

    @Given("I set product API endpoint with the desired id")
    public void setApiGetEndInvalidIdProduct(){

        getProductByID.setApiGetEndValidIdProduct();
    }

    @When("I send GET request endpoint for get products info by ID")
    public void sendGetRequestInvalidIdProduct(){
        getProductByID.sendGetRequestValidIdProduct();
    }

    @And("I receive a product details by ID request")
    public void getAProduct(){
        getProductByID.receiveProductDetail();
    }

}