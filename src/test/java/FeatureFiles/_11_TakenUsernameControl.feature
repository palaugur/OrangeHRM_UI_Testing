Feature: Admin/User Management Page

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully

    And Navigate to Admin Page

  Scenario Outline: Already Taken Username Control
    When Click on the element in Dialog Content
      | addButton |
      | userRole  |
    And Scroll Down "2" times

    And Click on the element in Dialog Content
      | status |
    And Scroll Down "2" times

    And User send keys in Dialog Content
      | usernameInAP  | <username> |
      | passwordAP    | <pass>     |
      | conPasswordAP | <pass>     |

    And User send keys in Dialog Content
      | employeeName | <name> |

    And Click on the element in Dialog Content
      | employeeInside |

    Then Notification message should be displayed
      | notificationMsg | Already exists |

    Examples:
      | name | username  | pass       |
      | k    | Ugur12345 | Tc>1245785 |