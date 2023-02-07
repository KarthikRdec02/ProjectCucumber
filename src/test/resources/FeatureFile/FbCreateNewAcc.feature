Feature: 
  to create new account in fb

  Scenario: 
    to create account

    Given to open chrome browser
    And to maximize window
    When to launch FB url
    And to pass username and password
    And to click create new account
    Then to close tab
