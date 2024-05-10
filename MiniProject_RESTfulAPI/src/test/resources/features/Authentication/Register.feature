@RegisterUser
Feature: Register
  As an admin
  I want to Register
  So that i can get my account for login

  Scenario: As a user i want to register using valid credential
    Given I set register API endpoint
    When I send request to register and input valid credentials
    Then I receive status code 200 OK response
    And I receive my registered account data