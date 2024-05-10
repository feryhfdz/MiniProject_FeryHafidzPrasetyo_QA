Feature: Update Book List
  As a user
  I want to update my book list
  So that my book list was successfully updated

  Scenario: As a user I want to update my book list
    Given I am on the landing page
    When I click Pencil icon for Update book list
    And I am on edit page
    And I input Title with valid input for update
    And I input Author with valid input for update
    And I input Publish Year with valid input for update
    Then I click Edit Book button
    And I was directed to the show book view
    And I see message Book Edited Successfully

  Scenario: As a user I cant create new book list with invalid input
    Given I am on the landing page
    When I click Pencil icon for Update book list
    And I am on edit page
    And I input Title with invalid input for update
    And I input Author with invalid input for update
    And I input Publish Year with invalid input for update
    And I click Edit Book button
    Then I see error message Book Edit Failed