Feature: Admin/User Management Page

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Admin Page

  Scenario: Add button functionality
    Then Add button should be displayed
    ### You can write specific step like this.
    ### These may vary according to requirements.
    ### But the next ones will be more automated.