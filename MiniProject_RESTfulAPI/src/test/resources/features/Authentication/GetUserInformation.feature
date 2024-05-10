@GetUserInformation
Feature: Get User Information
  As an admin
  I want to get user information
  So That i can get 200 OK response and detail user information

  Scenario: As an admin i want to get user information
    Given I set info API endpoint to get user information
    When I send GET request to get user information
    Then I receive status code 200 OK response
    And I receive all of user information