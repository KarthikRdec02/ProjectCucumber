Feature: 
  To Generate Order ID in Adactin Hotel booking

  Scenario: 
    To validate the user all credentials

    Given to enter the adactin hotel booking login page
    When have to login by valid email and password
      | Karthi12390 | Tamil@123 |
    And ensure user has to be in search hotel page
    And have to enter the details of hotel room
      | 10/01/2023 | 14/01/2023 |
    And have to click search button
    And ensure have to in correct page and click radio button
    And have to click continue button
    And have to enter valid personal details of user
      | KARTHIK | RAVI | TAMBARAM,CHENNAI | 1234567893698521 | 587 |
    And have to enter book now button
    And have to scrol down confirm correct page and take screenshot
    And have to generate order ID
