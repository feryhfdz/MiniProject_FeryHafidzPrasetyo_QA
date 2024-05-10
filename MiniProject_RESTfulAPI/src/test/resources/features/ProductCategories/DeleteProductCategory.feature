@DeleteProductCategoryByID
Feature: Delete a product category by ID
  As an admin
  I want to delete product category by valid ID
  So that the product category can be removed

  Scenario: As an admin I can delete product category
    Given I set categories API endpoint for delete product category with valid ID
    When I send DELETE request endpoint
    Then I receive status code 200 OK response
    And I receive response body