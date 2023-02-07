Feature: 
  to validate ubuy App

  Scenario: 
    to validate ubuy home page

    Given to launch chrome
    And to launch ubuy url
    And to clear popup
    When to enter product in search box
    And to enter the search button
    And to ensure user in correct page
    When to click the first product
    And to switch next window
    And to ensure user is correct window
    When to click AddToCart button
    And to check view cart
    
