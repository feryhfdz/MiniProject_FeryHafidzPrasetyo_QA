@AssignProductRating
Feature: Assign a Product Rating
  As an admin
  I want to assign a product rating
  So that the product rating is saved

  Scenario: As an admin I can assign a product rating
    Given I set ratings API endpoint
    When I send POST request body for assign a product rating
    Then I receive status code 200 OK response
    And I receive detailed products with ratings that have been entered in the request body