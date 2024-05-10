@CreateProductComment
Feature: Create a Comment for Product
  As an admin
  I want to create a comment for product
  So that the comment for product is created

  Scenario: As an user i want to create a comment for product
    Given I set comments API endpoint for create product comment
    When I send POST request endpoint for create a comment product
    Then I receive status code 200 OK response
    And I receive detail information comment product has been created