Feature: Add Addresses Functionality
  Background:
    Given Navigate to Magento
    When  Click to Sign in Button

    Scenario:
      Then Click on the My Account section
      And  Click on My Address Book


  Scenario Outline: Add new Addresses


    And User click on DialogButton
      |AddNewAddressButton  |

    And User send keys in Dialog
      | Telephone703 | <phone>  |
      | Street703    | <street> |
      | City703      | <city>   |
      | Zip703       | <zip>    |
    And User select state
    And User click on DialogButton
      | DefaultBilling703    |
      | DefaultShipping703   |
      | SaveAddressButton703 |
      | DeleteButton703      |
      | DeleteOk703          |



    Examples:
      | phone      | street  | city  | zip   |
      | 55555555 | zambak | istanbul | 52025 |
      | 52025777 | sumbul | izmir | 77744 |

