package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.DeletePage;
import starter.pages.HomePage;

public class DeleteBookListSteps {
    @Steps
    HomePage homePage;

    @Steps
    DeletePage deletePage;

    @When("I click trash icon for delete book list")
    public void ClickTrashIconDelete(){
        homePage.clickDeleteBookButton();
    }
    @And("I was redirected to the display to confirm")
    public void ConfirmationDisplay(){
        Assertions.assertTrue(deletePage.confirmationDeletePageDisplayed());
    }
    @Then("I click Yes button")
    public void ClickYes(){
        deletePage.clickYesButton();
    }
    @And("I see the message that the book list was successfully deleted")
    public void SuccessCreatedMessage(){
        Assertions.assertTrue(homePage.successDeletedMessageDisplayed());
    }
}
