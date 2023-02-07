@login
Feature: 
  To validate login functionality in FB

  Background: 
    Given user have to enter in login page

  @smoke
  Scenario: 
    To validate valid email and invalid password

    When user have to enter valid email and invalid password
    And user have to click login button
    Then ensure user has to be in incorrect page

  @smoke
  Scenario: 
    To validate invaid email and vaid password

    When user have to enter invalid email and valid password
    And user have to click login button
    Then ensure user has to be in incorrect page

  @sanity
  Scenario: 
    To validate invalid email and invaid password

    When user have to enter invalid email and invalid valid password
    And user have to click login button
    Then ensure user has to be in incorrect page
