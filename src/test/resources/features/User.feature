 #Author: Eliza Nikitina nikitina.eliza20@gmail.com

 Feature: Automate As an Engr. Candidate I need to automate http://www.way2automation.com/angularjs-protractor/webtables/
 So I can show my automation capabilities

  @codeChallenge
  Scenario Outline: Add a user and validate the user has been added to the table
  Given user click on Add User button
  When user add "<First Name>", "<Last Name>", "<User Name>","<Password>","<Customer>","<Role>","<E-mail>","<Cell Phone>"
  And user clicks save button
  Then verify "<First Name>" has been added

   Examples:
    | First Name | Last Name | User Name      |Password    | Customer   | Role     | E-mail                   |Cell Phone|
    | Eliza     | Nikitina   | eliza_nikitina | password123| 15         | Customer | eliza.nikitina@gmail.com | 123456789|


  @codeChallenge
  Scenario Outline: Add a user data from excel and validate the user has been added to the table
   When user enters employee data from "User_Info" excel sheet
   Then verify "<First Name>" has been added
   Examples:
    | First Name |
    | Eliza     |


  @codeChallenge
 Scenario: Delete user User Name: novak and validate user has been deleted
  Given find User name "novak" in data table and delete user
  Then verify user "novak" has been deleted



