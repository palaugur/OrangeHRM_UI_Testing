Feature: Admin/User Management Page

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Admin Page
    When Click on the element in Dialog Content
      | addButton |

  Scenario: Is elements seen in web page
    Then Elements should be displayed
      | userRole      |
      | employeeName  |
      | status        |
      | usernameInAP  |
      | passwordAP    |
      | conPasswordAP |
      | cancelBtn     |
      | saveBtnInAP   |
