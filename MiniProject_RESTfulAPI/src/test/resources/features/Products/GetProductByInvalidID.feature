@GetProductInvalidID
Feature: Get Product by Invalid ID
  As an admin
  I want to get product by invalid ID
  So that I can receive 404 Not Found response and error message

  Scenario: As an admin i want get product by Invalid ID
    Given I set product API endpoint with invalid ID
    When I send GET request to get product by invalid ID
    Then I receive status code 404 Not Found response
    And I receive error message