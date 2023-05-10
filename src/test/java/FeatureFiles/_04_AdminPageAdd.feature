Feature: Admin/User Management Page

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Admin Page

  Scenario Outline: User creating without Required elements (Negative)
    When Click on the element in Dialog Content
      | addButton  |
      | submitButton |
    Then Notification message should be displayed
      | notificationMsg | <text> |
    Examples:
      | text     |
      | Required |



