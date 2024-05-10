@CreateCategory
Feature: Create a New Product Category
  As an admin
  I want to create a new product category
  So that the product category was successfully created

  Scenario: As an admin I can create a product category
    Given I set categories API endpoint for create new category
    When I send POST request endpoint with valid input
    Then I receive status code 200 OK response
    And I receive request body input data added successfully