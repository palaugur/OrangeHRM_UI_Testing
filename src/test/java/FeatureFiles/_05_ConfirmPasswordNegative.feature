Feature: Admin/User Management Page

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Admin Page

  Scenario Outline: Password Confirmation Negative

    When Click on the element in Dialog Content
      | addButton |

    And User send keys in Dialog Content
      | passwordAP    | <password1> |
      | conPasswordAP | <password2> |

    Then Notification message should be displayed
      | notificationMsg | <text> |
    Examples:
      | password1   | password2    |  | text     |
      | Truepass111 | Wrongpass111 |  | Passwords do not match |

