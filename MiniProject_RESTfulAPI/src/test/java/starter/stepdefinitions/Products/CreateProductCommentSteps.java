package starter.stepdefinitions.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Products.CreateProductComment;

public class CreateProductCommentSteps {

    @Steps
    CreateProductComment createProductComment;

    @Given("I set comments API endpoint for create product comment")
    public void setApiNewUser() {
        createProductComment.setApiNewComment();
    }

    @When("I send POST request endpoint for create a comment product")
    public void receiveValidDataForCreateNewUser() {
        createProductComment.sendCreateComment();
    }

    @And("I receive detail information comment product has been created")
    public void sendCreateUserRequest() {
        createProductComment.receiveValidDataForCreateNewComment();
    }
}