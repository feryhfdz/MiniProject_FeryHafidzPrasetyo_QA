package starter.stepdefinitions.ProductCategories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.ProductCategories.GetAllCategories;
import starter.user.StatusCode;

public class GetAllCategoriesSteps {
    @Steps
    GetAllCategories getAllProductCategory;

    @Steps
    StatusCode statusCode;

    @Given("I set category API endpoint for get all product categories")
    public void setApiEndProfile(){
        getAllProductCategory.setApiEndGetAllProductCategory();
    }

    @When("I send GET request endpoint for get all product categories")
    public void sendUserRequest(){
        getAllProductCategory.sendRequestProductCategory();
    }

    @And("I receive data for all of product categories")
    public void receiveValidProfile(){
        getAllProductCategory.receiveValidProductCategory();
    }
}