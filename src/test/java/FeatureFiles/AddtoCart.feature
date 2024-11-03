Feature: Add to Cart Functionality
  Background:
    Given Navigate to Magento
    When Click to Sign in Button
    Then User Filled required informations
    And Click to sign in
  Scenario: Add  selected product to cart
    When User add  selected product to cart
    Then The user can increase and multiply the number of products
    And User remove products to cart



