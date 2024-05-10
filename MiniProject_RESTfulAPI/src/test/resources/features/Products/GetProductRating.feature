@GetProductRating
Feature: Get Product Ratings
  As an admin
  I want to get product ratings
  So that I can receive "200" response and detail information product ratings

  Scenario: As an admin i want to get product ratings
    Given I set ratings API endpoint with ID products
    When I send GET request for get product ratings
    Then I receive status code 200 OK response
    And I receive all of product ratings using valid ID