package starter.stepdefinitions.Products;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Products.DeleteProduct;

public class DeleteProductSteps {
    @Steps
    DeleteProduct deleteProductSteps;

    @Given("I set product API endpoint for delete product")
    public void setDeleteValidUserSteps(){
        deleteProductSteps.setApiDeleteProductEndpoint();
    }

    @When("I send Delete request to delete product with valid ID")
    public void sendDeleteUserRequest(){
        deleteProductSteps.sendDeleteProductRequest();
    }

}