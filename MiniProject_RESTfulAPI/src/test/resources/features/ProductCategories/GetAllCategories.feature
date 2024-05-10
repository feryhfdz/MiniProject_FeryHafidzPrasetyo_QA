@GetAllProductCategories
Feature: Get All a Product Categories
  As an admin
  I want to get all product categories
  So That i can get 200 OK response and data for all categories

  Scenario: As an admin i want to get all product categories
    Given I set category API endpoint for get all product categories
    When I send GET request endpoint for get all product categories
    Then I receive status code 200 OK response
    And I receive data for all of product categories