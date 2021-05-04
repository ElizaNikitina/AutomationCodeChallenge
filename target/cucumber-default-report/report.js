$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/User.feature");
formatter.feature({
  "name": "Automate As an Engr. Candidate I need to automate http://www.way2automation.com/angularjs-protractor/webtables/",
  "description": " So I can show my automation capabilities",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Add a user and validate the user has been added to the table",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@codeChallenge"
    }
  ]
});
formatter.step({
  "name": "user click on Add User button",
  "keyword": "Given "
});
formatter.step({
  "name": "user add \"\u003cFirst Name\u003e\", \"\u003cLast Name\u003e\", \"\u003cUser Name\u003e\",\"\u003cPassword\u003e\",\"\u003cCustomer\u003e\",\"\u003cRole\u003e\",\"\u003cE-mail\u003e\",\"\u003cCell Phone\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "And "
});
formatter.step({
  "name": "verify \"\u003cFirst Name\u003e\" has been added",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "User Name",
        "Password",
        "Customer",
        "Role",
        "E-mail",
        "Cell Phone"
      ]
    },
    {
      "cells": [
        "Eliza",
        "Nikitina",
        "eliza_nikitina",
        "password123",
        "15",
        "Customer",
        "eliza.nikitina@gmail.com",
        "123456789"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Add a user and validate the user has been added to the table",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@codeChallenge"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user click on Add User button",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.User.user_click_on_add_user_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user add \"Eliza\", \"Nikitina\", \"eliza_nikitina\",\"password123\",\"15\",\"Customer\",\"eliza.nikitina@gmail.com\",\"123456789\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.User.user_add(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.User.user_clicks_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify \"Eliza\" has been added",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.User.verify_eliza_has_been_added(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Add a user and validate the user has been added to the table");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Add a user data from excel and validate the user has been added to the table",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@codeChallenge"
    }
  ]
});
formatter.step({
  "name": "user click on Add User button",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters employee data from \"User_Info\" excel sheet",
  "keyword": "When "
});
formatter.step({
  "name": "verify \"\u003cFirst Name\u003e\" has been added",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "First Name"
      ]
    },
    {
      "cells": [
        "Eliza"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Add a user data from excel and validate the user has been added to the table",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@codeChallenge"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user click on Add User button",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.User.user_click_on_add_user_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters employee data from \"User_Info\" excel sheet",
  "keyword": "When "
});
formatter.match({
  "location": "steps.User.user_enters_employee_data_from_excel_sheet(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify \"Eliza\" has been added",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.User.verify_eliza_has_been_added(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "Add a user data from excel and validate the user has been added to the table");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete user User Name: novak and validate user has been deleted",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@codeChallenge"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "find User name \"novak\" in data table and delete user",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.User.findUserNameInDataTableAndDeleteUser(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user \"novak\" has been deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.User.verify_user_has_been_deleted(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", "Delete user User Name: novak and validate user has been deleted");
formatter.after({
  "status": "passed"
});
});