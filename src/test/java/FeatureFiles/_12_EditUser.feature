Feature: Admin/User Management Page

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Admin Page

  Scenario Outline: Edit exist User

    And User send keys in Dialog Content
      | sysUserName | <username> |

    And Click on the element in Dialog Content
      | submitButton |
      | editButton   |

    And Clear Input with Keys
    |usernameInAP|

    And User send keys in Dialog Content
      | usernameInAP | <usernameNew> |

    When Click on the element in Dialog Content
      | submitButton |

    Then Successfully containing message should be displayed
    Examples:
      | username  | usernameNew |
      | Ugur12345 | Ugur54321   |

  Scenario Outline: Find Edited User

    And User send keys in Dialog Content
      | sysUserName | <username> |

    And Click on the element in Dialog Content
      | submitButton |

    Then Elements should be displayed
      | savedUsername |

    Examples:
      | username  |
      | Ugur54321 |