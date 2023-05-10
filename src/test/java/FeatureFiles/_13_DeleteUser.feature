Feature: Admin/User Management Page

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Admin Page

  Scenario Outline: Delete User

    And User send keys in Dialog Content
      | sysUserName | <username> |

    When Click on the element in Dialog Content
      | submitButton |
      | deleteButton |
      | deleteDialog |

    Then Successfully containing message should be displayed

    Examples:
      | username  |
      | Ugur54321 |

  Scenario Outline: Found Deleted User Negative
    And User send keys in Dialog Content
      | sysUserName | <username> |

    When Click on the element in Dialog Content
      | submitButton |
    Then Text should be displayed
      | noRecords | No Records Found |
    Examples:
      | username  |
      | Ugur54321 |