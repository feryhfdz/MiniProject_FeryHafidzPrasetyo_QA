@GetOrderById
Feature: Get Order by ID
  As an Admin
  I want to get my order
  So That i can get 200 OK response detail order information by valid ID

  Scenario: As an admin i want to get my order
    Given I set order API endpoint by ID
    When I send GET request to get order information by ID
    Then I receive status code 200 OK response
    And I receive detail order information by ID