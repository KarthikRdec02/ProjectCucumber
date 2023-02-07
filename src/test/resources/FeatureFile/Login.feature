@fblogin
Feature: 
  To validate fb login functionality

  @reg
  Scenario Outline: 
    To validate login using valid email amd invalid password

    Given Have to enter fb login page
    When Have to enter "<email>" and "<password>"
    And Have to click login button
    Then Ensure User have to be in incorrect page

    Examples: 
      | email       | password   |
      | Tam@123     | karthik159 |
      | karthik@123 | TAmil      |
      | java        | Sel        |
      | Selenium    | pass157    |
      | python      | checl890   |
