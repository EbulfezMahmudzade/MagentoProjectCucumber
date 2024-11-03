Feature: Search Functionality
  Background:
    Given Navigate to Magento
    When Click to Sign in Button
    Then User Filled required informations
    And Click to sign in

  Scenario: Wish list

    And Click on the element in dialog box
      | homePage    |
      | arcProduct1 |
      |wishAddButton|
    Then The text "Wishlist added" should appear
    Then Verify the wishlist should not be empty
    And Navigate to product and click the remove button
    Then Wish List has been removed should appear
