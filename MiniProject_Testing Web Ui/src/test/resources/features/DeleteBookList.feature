Feature: Delete a Book List
  As a user
  I want to delete my book list
  So that my book list was successfully deleted

  Scenario: As a user I want to delete my book list
    Given I am on the landing page
    When I click trash icon for delete book list
    And I was redirected to the display to confirm
    Then I click Yes button
    And I see the message that the book list was successfully deleted
    And I back to landing page