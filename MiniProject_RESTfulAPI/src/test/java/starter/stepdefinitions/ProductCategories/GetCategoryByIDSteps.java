package starter.stepdefinitions.ProductCategories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.ProductCategories.GetCategoryByID;


public class GetCategoryByIDSteps {

    @Steps
    GetCategoryByID getProductCategoryByID;

    @Given("I set category API endpoint with an valid ID to get product category by ID")
    public void setApiGetEndInvalidIdProfile(){
        getProductCategoryByID.setApiGetEndValidIdCategory();
    }

    @When("I send GET request endpoint for get category product by ID")
    public void sendGetRequestInvalidIdProfile(){
        getProductCategoryByID.sendGetRequestValidIdCategory();
    }

    @And("I receive detail a product category by ID")
    public void receiveAProductCategory(){
        getProductCategoryByID.receiveProductCategory();
    }



}