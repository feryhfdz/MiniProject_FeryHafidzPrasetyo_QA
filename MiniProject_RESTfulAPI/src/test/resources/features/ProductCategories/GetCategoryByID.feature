@GetProductCategoryByID
Feature: Get Product Category By Valid ID
  As an admin
  I want to get category by ID
  So that I can receive 200 OK response and detail category product by ID

  Scenario: As an admin i want to get category by valid ID
    Given I set category API endpoint with an valid ID to get product category by ID
    When I send GET request endpoint for get category product by ID
    Then I receive status code 200 OK response
    And I receive detail a product category by ID