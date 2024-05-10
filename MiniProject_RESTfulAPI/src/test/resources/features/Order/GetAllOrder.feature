@GetAllOrder
Feature: Get All Order
  As an admin
  I want to get all my order
  So That i can get 200 OK response

  Scenario: As an admin i want to get all my order
    Given I set orders API endpoint
    When I send GET request to get all my order
    Then I receive status code 200 OK response
    And I receive all of my order