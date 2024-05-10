@GetProductByID
Feature: Get Data Product by ID
  As an admin
  I want to get Data Product by valid ID
  So that i can get 200 OK response and product info by ID request

  Scenario: As an admin i want to get data product by valid ID request
    Given I set product API endpoint with the desired id
    When I send GET request endpoint for get products info by ID
    Then I receive status code 200 OK response
    And I receive a product details by ID request