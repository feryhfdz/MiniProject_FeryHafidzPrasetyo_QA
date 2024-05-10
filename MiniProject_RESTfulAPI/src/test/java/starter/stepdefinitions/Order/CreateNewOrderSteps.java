package starter.stepdefinitions.Order;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Order.CreateNewOrder;

public class CreateNewOrderSteps {
    @Steps
    CreateNewOrder createNewOrder;

    @Given("I set order API endpoint")
    public void setApiOrder(){
        createNewOrder.setApiNewOrder();
    }

    @When("I send POST request endpoint for create new order with valid input")
    public void sendRequestOrder(){
        createNewOrder.sendCreateCategoryRequest();
    }

    @And("I receive valid data for my order")
    public void receiveOrderData(){
        createNewOrder.receiveValidDataForCreateNewCategory();
    }

}