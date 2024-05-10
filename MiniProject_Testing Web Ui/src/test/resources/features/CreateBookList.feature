Feature: Create a Book List
  As a user
  I want to Create New Book List
  So that I can access products page

  Scenario: As a user I can create New Book List
    Given I am on the landing page
    When I click the add icon
    And I see create book page
    And I input Title with valid input
    And I input Author with valid input
    And I input Publish Year with valid input
    And I click Save Book button
    And I back to landing page
    Then I saw a message Book Created Successfully

  Scenario: As a user I cant create new book list with invalid input
    Given I am on the landing page
    When I click the add icon
    And I see create book page
    And I input Title with empty input
    And I input Author with empty input
    And I input Publish Year with empty input
    And I click Save Book button
    Then I see error message Book Failed to Created