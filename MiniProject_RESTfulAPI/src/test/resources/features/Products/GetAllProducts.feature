@GetAllProducts
Feature: Get All Products
  As an admin
  I want to get all data products
  So that i can get 200 OK response and all the product details

  Scenario: As an admin i want to get all the product details
    Given I set product API endpoint to get all products
    When I send GET request endpoint for get all products
    Then I receive status code 200 OK response
    And I receive all products details