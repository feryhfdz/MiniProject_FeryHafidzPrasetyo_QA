package starter.stepdefinitions.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Products.GetProductComment;


public class GetProductCommentSteps {

    @Steps
    GetProductComment getProductCommentByValidID;

    @Given("I set comments api endpoint for get product comments")
    public void setApiGetEndInvalidIdProfile(){
        getProductCommentByValidID.setApiGetEndComment();
    }

    @When("I send GET request to get product comment")
    public void sendGetRequestInvalidIdProfile(){
        getProductCommentByValidID.sendGetRequestCommentInvalidID();
    }

    @And("I receive detail information product comment")
    public void receiveValidProfile(){
        getProductCommentByValidID.receiveValidComment();
    }

}