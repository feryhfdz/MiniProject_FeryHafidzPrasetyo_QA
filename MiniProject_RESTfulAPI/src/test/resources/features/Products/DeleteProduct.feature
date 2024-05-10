@DeleteProduct
Feature: Delete the Product
  As an admin
  i want to delete product with valid ID
  So that the product was successfully deleted

  Scenario: As an admin i can delete product
    Given I set product API endpoint for delete product
    When I send Delete request to delete product with valid ID
    Then I receive status code 200 OK response
    And I receive response body
