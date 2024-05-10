package starter.stepdefinitions.ProductCategories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.ProductCategories.CreateNewCategory;

public class CreateNewCategorySteps {

    @Steps
    CreateNewCategory createNewCategory;

    @Given("I set categories API endpoint for create new category")
    public void setApiNewProductCategory() {
        createNewCategory.setApiNewCategory();
    }


    @When("I send POST request endpoint with valid input")
    public void sendRequestNewProductCategory() {
        createNewCategory.sendCreateCategoryRequest();
    }

    @And("I receive request body input data added successfully")
    public void receiveValidProductCategory() {
        createNewCategory.receiveValidDataForCreateNewCategory();
    }
}