Feature: Admin/User Management Page

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Admin Page
    When Click on the element in Dialog Content
      | addButton |

  Scenario Outline: Write wrong Employee name
    When User send keys in Dialog Content
      | employeeName | <employeeName> |
    And Click on the element in Dialog Content
      | conPasswordAP |
    Then Notification message should be displayed
      | notificationMsg | Invalid |
    Examples:
      | employeeName   |
      | Superman128967 |