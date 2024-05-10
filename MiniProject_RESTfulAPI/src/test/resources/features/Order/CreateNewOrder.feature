@CreateNewOrder
Feature: Create a New Order
  As an admin
  I want to create a new order
  So that my order was successfully created

  Scenario: As an admin I can create a new order category
    Given I set order API endpoint
    When I send POST request endpoint for create new order with valid input
    Then I receive status code 200 OK response
    And I receive valid data for my order