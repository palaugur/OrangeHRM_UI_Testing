Feature: Admin/User Management Page

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Admin Page
    When Click on the element in Dialog Content
      | addButton |

  Scenario Outline: Write password less than seven character
    When User send keys in Dialog Content
      | passwordAP | <password> |
    Then Notification message should be displayed
      | notificationMsg | Should have at least 7 characters |
    Examples:
      | password |
      | Hey01t   |