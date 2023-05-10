Feature: Admin/User Management Page

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Admin Page
    When Click on the element in Dialog Content
      | addButton |

  Scenario Outline: Write username less than five character
    Then User send keys in Dialog Content
      | usernameInAP | <username> |
    Then Notification message should be displayed
      | notificationMsg | Should be at least 5 characters |
    Examples:
      | username |
      | ABC      |