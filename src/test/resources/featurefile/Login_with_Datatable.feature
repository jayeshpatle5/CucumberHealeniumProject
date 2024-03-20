@tag
Feature: This is Login feature
  
   This is Ebanking login page

  @tag1
  Scenario: Login Page
    Given I have given a "https://demo.guru99.com/V4/"
    And Provided username and password
      | username   | password |
      | mngr559940 | UpypAqY  |
    When I click the login button
    Then I should able to see User dashBoard
    When I click on logout button
    Then I should see login page

  @tag2
  Scenario: Login Page
    Given I have given a "https://demo.guru99.com/V4/"
    And Provided username and password as "row"
      | mngr559940 | UpypAqY |
    When I click the login button
    Then I should able to see User dashBoard
    When I click on logout button
    Then I should see login page

  @tag3
  Scenario: Login Page
    Given I have given a "https://demo.guru99.com/V4/"
    And Provided username and password as "column"
      | mngr559940 |
      | UpypAqY    |
    When I click the login button
    Then I should able to see User dashBoard
    When I click on quit button
    When I click on logout button
    Then I should see login page
