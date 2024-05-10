@GetProductCategoryInvalidID
Feature: Get Product Category by Invalid ID
  As an admin
  I want to get product category by invalid ID
  So that I can receive 404 Not Found response and error message

  Scenario: As an admin i want to get product category by invalid ID
    Given I set category API endpoint with an invalid ID
    When I send GET request to get product category using invalid ID
    Then I receive status code 404 Not Found response
    And I receive error message