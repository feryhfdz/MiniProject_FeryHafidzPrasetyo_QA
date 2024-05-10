package starter.stepdefinitions.Products;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Products.AssignProductRating;

public class AssignProductRatingSteps {

    @Steps
    AssignProductRating assignProductRating;

    @Given("I set ratings API endpoint")
    public void setApiNewRate() {
        assignProductRating.setApiRating();
    }

    @When("I send POST request body for assign a product rating")
    public void sendRating() {
        assignProductRating.sendAssignProductRating();
    }

    @And("I receive detailed products with ratings that have been entered in the request body")
    public void receiveRating() {
        assignProductRating.receiveValidDataForAssignRating();
    }
}