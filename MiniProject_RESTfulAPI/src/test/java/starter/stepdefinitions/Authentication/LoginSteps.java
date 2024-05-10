package starter.stepdefinitions.Authentication;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Authentication.Login;

public class LoginSteps {
    @Steps
    Login login;

    @Given("I set API endpoint to Login")
    public void setApiEndLogin(){
        login.setApiLogin();
    }

    @When("I send request to login and fill valid credential\\(email, password)")
    public void sendLoginRequest() {
        login.sendLoginValid();
    }

    @And("I receive my logged in account data")
    public void receiveValidToken(){
        login.receiveValidLogin();
    }

    @When("I send request to login and fill blank credentials")
    public void sendLoginBlankCredential() {
        login.sendLoginBlank();
    }

    @And("I receive error message with empty field")
    public void receiveErrorMessageEmptyField(){
        login.receiveErrorMessageEmptyField();
    }

}