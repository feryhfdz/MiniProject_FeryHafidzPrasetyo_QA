package starter.stepdefinitions.ProductCategories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.ProductCategories.DeleteProductCategory;

public class DeleteProductCategorySteps {
    @Steps
    DeleteProductCategory deleteProductCategoryByID;

    @Given("I set categories API endpoint for delete product category with valid ID")
    public void setDeleteValidCategorySteps(){
        deleteProductCategoryByID.setApiDeleteCategoryEndpoint();
    }

    @When("I send DELETE request endpoint")
    public void sendDeleteProductCategoryRequest(){
        deleteProductCategoryByID.sendDeleteCategoryRequest();
    }

    @And("I receive response body")
    public void receiveDeleteResponse(){
        deleteProductCategoryByID.receiveResponseBody();
    }
}