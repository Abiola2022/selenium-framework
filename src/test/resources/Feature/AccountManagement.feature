@accountManagement
Feature: Account Management

  @createAccount
  Scenario Outline: Create Account Using Valid Email
    Given User is on create an account page
    When User enter "<firstname>", "<lastname>", "<email>", "<password>" and "<confirmpassword>"
    And User click on create an account
    Then My account page should be displayed

    Examples:
      | firstname | lastname | email         | password   | confirmpassword |
      | Akin      | Ola      | xyz1@yahoo.com | London2022 | London2022      |

  @accountLogin
  Scenario Outline: Account Login
    Given User is on sign in page
    When User enter "<email>" and "<password>"
    And User click on sign in
    Then My account page should displayed

    Examples:
      | email         | password   |
      | xyz1@yahoo.com | London2022 |


  @unregisteredCustomer
  Scenario Outline: Unregistered Customer Cannot Login
    Given User is on sign in page and not registered
    When User enter unknown"<email>" and unknown "<password>"
    And User click on sign in button
    Then Error message should displayed

    Examples:
      | email         | password    |
      | abc@yahoo.com | Nigeria2022 |

  @duplicateAccount
  Scenario Outline: Duplicate Account Is Not Allowed
    Given User already exit and is on create an account page
    When User enter details "<firstname>", "<lastname>", "<email>", "<password>" and "<confirmpassword>"
    And User click on create an account button
    Then Account already exist should displayed

    Examples:
      | firstname | lastname | email         | password   | confirmpassword |
      | Akin      | Ola      | xyz1@yahoo.com | London2022 | London2022      |






