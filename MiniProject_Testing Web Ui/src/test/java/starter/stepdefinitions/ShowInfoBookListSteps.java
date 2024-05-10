package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.HomePage;
import starter.pages.InfoPage;

public class ShowInfoBookListSteps {
    @Steps
    HomePage homePage;

    @Steps
    InfoPage infoPage;

    @When("I click info icon for see details book list")
    public void ClickInfoIcon(){
        homePage.clickinfoBookButton();
    }
    @Then("I was redirected to the show book page")
    public void ShowBookPage(){
        Assertions.assertTrue(infoPage.showBookPageDisplayed());
    }
}
