Feature: Admin/User Management Page

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully

    And Navigate to Admin Page

  Scenario Outline: Creating new ESS User
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
      | submitButton     |

    Then  Successfully containing message should be displayed

    Examples:
      | name | username  | pass       |
      | k    | Ugur12345 | Tc>1245785 |

  Scenario Outline: Created User Control

    And User send keys in Dialog Content
      | sysUserName | <username> |

    And Click on the element in Dialog Content
      | submitButton |

    Then Elements should be displayed
      | savedUsername |

    Examples:
      | username  |
      | Ugur12345 |