@functional
Feature: Sample Registration page Automation

  @smoke
  Scenario: Fill the registration form
    Given Navigate to the given url "C:/Users/SPURGE/Desktop/signup.html"
    When I enter all the user details userDetails
    |Name|Email|Password|Age|Userbio|Jobtype|Interests|
    |Jayesh|jay@gmail.com|jay123|15|this is my bio|Python Developer|Development&Design|
       
    Then validate the submit button
    
