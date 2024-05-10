@CreateNewProduct
Feature: Create a New Product
  As an admin
  I want to create a new product
  So that i can get "200 OK" response

  Scenario: As an admin i want to create a new product
    Given I set product API endpoint for create new product
    When I send POST request for create a new product with valid credentials
    Then I receive status code 200 OK response
    And I receive The product that has been created has been successfully added with a customized ID number