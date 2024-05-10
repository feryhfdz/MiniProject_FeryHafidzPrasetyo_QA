@GetOrderById
Feature: Get Order by Invalid ID
  As an Admin
  I want to get my order by invalid ID
  So That i can get 404 Not Found response

  Scenario: As an admin i want to get my order
    Given I set order API endpoint with invalid ID
    When I send GET request to get order information by invalid ID
    Then I receive status code 404 Not Found response
    And I receive error message