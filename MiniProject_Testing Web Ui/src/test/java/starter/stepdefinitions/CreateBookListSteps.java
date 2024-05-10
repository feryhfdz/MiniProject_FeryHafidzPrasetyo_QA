package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.CreatePage;
import starter.pages.HomePage;

public class CreateBookListSteps {
    @Steps
    HomePage homePage;

    @Steps
    CreatePage createPage;

    @Given("I am on the landing page")
    public void onTheLandingPage(){
        homePage.openUrl("https://mini-book-store-fe.vercel.app/");
        Assertions.assertTrue(homePage.validateOnLandingPage());
    }
    @When("I click the add icon")
    public void ClickAddIcon(){
        homePage.clickAddNewButton();
    }
    @And("I see create book page")
    public void SeeCreateBookPage(){
        Assertions.assertTrue(createPage.OnCreateBookPage());
    }

    @And("I input Title with valid input")
    public void InputTitleCreate(){
        createPage.ValidInputTitle("Menanam Jagung");
    }

    @And("I input Author with valid input")
    public void InputAuthorCreate(){
        createPage.ValidInputAuthor("RendiOrton");
    }

    @And("I input Publish Year with valid input")
    public void InputPublishYearCreate(){
        createPage.ValidInputPublishYear("2023");
    }

    @And("I click Save Book button")
    public void SaveButtonCreate(){
        createPage.clickSaveBookButton();
    }

    @And("I back to landing page")
    public void BackToLandingPage(){
        Assertions.assertTrue(homePage.backToLandingPage());
    }

    @Then("I saw a message Book Created Successfully")
    public void MessageBookCreatedSuccessfully(){
        Assertions.assertTrue(homePage.successCreatedMessageDisplayed());
    }
    @And("I input Title with empty input")
    public void InputTitleWithEmptyInput(){
        createPage.inputEmptyTitleField();
    }
    @And("I input Author with empty input")
    public void InputAuthorWithEmptyInput(){
        createPage.inputEmptyAuthorField();
    }

    @And("I input Publish Year with empty input")
    public void InputPublishYearWithEmptyInput(){
        createPage.inputEmptyPublishYearField();
    }

    @Then("I see error message Book Failed to Created")
    public void ErrorMessageBookFailedCreate(){
        Assertions.assertTrue(createPage.errorMessageDisplay());
    }
}
