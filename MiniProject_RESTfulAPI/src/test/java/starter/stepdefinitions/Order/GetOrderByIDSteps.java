package starter.stepdefinitions.Order;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Order.GetOrderByID;

public class GetOrderByIDSteps {
    @Steps
    GetOrderByID getOrderByID;

    @Given("I set order API endpoint by ID")
    public void setApiMyOrder(){
        getOrderByID.setApiMyOrderById();
    }

    @When("I send GET request to get order information by ID")
    public void sendOrderRequest(){
        getOrderByID.sendRequestMyOrderById();
    }

    @And("I receive detail order information by ID")
    public void receiveMyOrder(){
        getOrderByID.receiveValidOrderById();
    }
}