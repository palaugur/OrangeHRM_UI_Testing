Feature: Admin/User Management Page

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Admin Page

  Scenario Outline: Write password without number
    When Click on the element in Dialog Content
      | addButton |

    And User send keys in Dialog Content
      | passwordAP | <pass> |

    Then Notification message should be displayed
      | notificationMsg | Your password must contain minimum 1 number |

    Examples:
      | pass     |
      | asdeqwer |