package starter.stepdefinitions.Authentication;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Authentication.Register;

public class RegisterSteps {

    @Steps
    Register register;

    @Given("I set register API endpoint")
    public void setApiEndUser(){
        register.setApiRegister();
    }

    @When("I send request to register and input valid credentials")
    public void sendRegisterRequest() {
        register.sendRegisterValid();
    }

    @And("I receive my registered account data")
    public void receiveValidProfile(){
        register.receiveValidRegistered();
    }

}