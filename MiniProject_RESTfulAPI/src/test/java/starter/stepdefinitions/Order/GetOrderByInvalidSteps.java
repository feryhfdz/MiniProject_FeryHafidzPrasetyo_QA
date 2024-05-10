package starter.stepdefinitions.Order;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Order.GetOrderByInvalidID;

public class GetOrderByInvalidSteps {
    @Steps
    GetOrderByInvalidID getOrderByInvalidID;

    @Given("I set order API endpoint with invalid ID")
    public void setApiGetEndInvalidIdProfile(){

        getOrderByInvalidID.setApiGetEndInvalidIdOrder();
    }

    @When("I send GET request to get order information by invalid ID")
    public void sendGetRequestInvIdOrder(){
        getOrderByInvalidID.sendGetRequestInvalidIdOrder();
    }

}
