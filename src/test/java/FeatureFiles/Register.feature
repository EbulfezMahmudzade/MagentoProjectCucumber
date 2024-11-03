Feature: Login Functionality

  Scenario: Create Multiple Accounts

    Given Navigate to Magento
    When Click to Create an Account
    And Enter Personel Information that as "First Name" and "Last Name"
    And Enter Sign in Information that as "Email Address" and "Password" and "confirm Password"
    Then Click to Create an Account button
    And Verify message should be displayed

  Scenario Outline: Fill in the required information completely
    When User sending name,lastname,emailAddress,password and confirmPassword in DialogContent
      |FirstName              |
      |LastName               |
      |EmailAdress            |
      |password               |
      |ConfirmPassword        |

    Then User click element in DialogContent
      |CreateAnAccountButton  |


    Examples:
      |FirstName  |LastName|EmailAddress  |password|ConfirmPassword  |







