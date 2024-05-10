@GetProductComment
Feature: Get Product Comment
  As an admin
  I want to get product comments
  So that I can receive 200 OK response and detail information product comment

  Scenario: As an admin i want to get product comments
    Given I set comments api endpoint for get product comments
    When I send GET request to get product comment
    Then I receive status code 200 OK response
    And I receive detail information product comment