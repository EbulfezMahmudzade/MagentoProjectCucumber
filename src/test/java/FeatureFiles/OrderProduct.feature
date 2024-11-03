Feature: Order Product Functionality
  Background:
    Given Navigate to Magento
    When Click to Sign in Button
    Then User Filled required informations
    And Click to sign in
    And User add  selected product to cart
    Scenario: Order Product
      Given User should address form
      When User should choose shipping Methods
      And Success message should be displayed