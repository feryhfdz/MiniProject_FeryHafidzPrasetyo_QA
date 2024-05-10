package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.EditPage;
import starter.pages.HomePage;
import starter.pages.InfoPage;

public class UpdateBookListSteps {
    @Steps
    HomePage homePage;

    @Steps
    EditPage editPage;

    @Steps
    InfoPage infoPage;

    @When("I click Pencil icon for Update book list")
    public void ClickPencilIcon(){
        homePage.clickEditBookButton();
    }
    @And("I am on edit page")
    public void IamOnEditPage(){
        Assertions.assertTrue(editPage.onEditBookPage());
    }
    @And("I input Title with valid input for update")
    public void InputTitleUpdate(){
        editPage.inputTitleEdit("Masha&TheBear");
    }
    @And("I input Author with valid input for update")
    public void InputAuthorUpdate(){
        editPage.inputAuthorEdit("KKAJHE");
    }
    @And("I input Publish Year with valid input for update")
    public void inputPublishYear(){
        editPage.inputPublishYearEdit("2001");
    }
    @Then("I click Edit Book button")
    public void ClickEditButton(){
        editPage.clickEditButton();
    }
    @And("I was directed to the show book view")
    public void ToTheShowBookView(){
        Assertions.assertTrue(infoPage.showBookPageDisplayed());
    }
    @And("I see message Book Edited Successfully")
    public void MessageBookEdited(){
        Assertions.assertTrue(infoPage.successEditMessageDisplayed());
    }
    @And("I input Title with invalid input for update")
    public void InvalidInputTitleUpdate(){
        editPage.inputEmptyTitleFieldEdit("");
    }
    @And("I input Author with invalid input for update")
    public void InvalidInputAuthorUpdate(){
        editPage.inputEmptyAuthorFieldEdit("");
    }
    @And("I input Publish Year with invalid input for update")
    public void InvalidInputPublishYearUpdate(){
        editPage.inputEmptyPublishYearFieldEdit("XXX");
    }
    @Then("I see error message Book Edit Failed")
    public void ErrorMessageBookEdit(){
        Assertions.assertTrue(editPage.errorMessageEditDisplayed());
    }
}
