$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Page",
  "description": "As a valid user I want a login page sothat only authentic user have access",
  "id": "login-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Valid users should be able to login",
  "description": "",
  "id": "login-page;valid-users-should-be-able-to-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "a valid user goes to techfios site",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "techfios site should display",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user logs in with valid credentials UserName \"\u003cusername\u003e\" and Password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Dashboard page should display",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "login-page;valid-users-should-be-able-to-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "login-page;valid-users-should-be-able-to-login;;1"
    },
    {
      "cells": [
        "techfiosdemo@gmail.com",
        "abc123"
      ],
      "line": 14,
      "id": "login-page;valid-users-should-be-able-to-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7552802400,
  "status": "passed"
});
formatter.before({
  "duration": 955800,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Valid users should be able to login",
  "description": "",
  "id": "login-page;valid-users-should-be-able-to-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "a valid user goes to techfios site",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "techfios site should display",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user logs in with valid credentials UserName \"techfiosdemo@gmail.com\" and Password \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Dashboard page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.a_valid_user_goes_to_techfios_site()"
});
formatter.result({
  "duration": 6784101600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.techfios_site_should_display()"
});
formatter.result({
  "duration": 3011451500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "techfiosdemo@gmail.com",
      "offset": 46
    },
    {
      "val": "abc123",
      "offset": 84
    }
  ],
  "location": "LoginSteps.user_logs_in_with_valid_credentials_UserName_and_Password(String,String)"
});
formatter.result({
  "duration": 1919526300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.dashboard_page_should_display()"
});
formatter.result({
  "duration": 3653425500,
  "status": "passed"
});
formatter.uri("new_account.feature");
formatter.feature({
  "line": 2,
  "name": "New Account Page",
  "description": "As a user I want a new account page sothat users can create new accounts",
  "id": "new-account-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User should be able to create new account",
  "description": "",
  "id": "new-account-page;user-should-be-able-to-create-new-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "a user with username \"\u003cusername\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user goes to new account page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "create new account with title \"\u003ctitle\u003e\" description \"\u003cdescription\u003e\" balance \"\u003cbalance\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "new account should be created",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "new-account-page;user-should-be-able-to-create-new-account;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "title",
        "description",
        "balance"
      ],
      "line": 13,
      "id": "new-account-page;user-should-be-able-to-create-new-account;;1"
    },
    {
      "cells": [
        "techfiosdemo@gmail.com",
        "abc123",
        "checking",
        "rent",
        "1200"
      ],
      "line": 14,
      "id": "new-account-page;user-should-be-able-to-create-new-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6851671800,
  "status": "passed"
});
formatter.before({
  "duration": 200200,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User should be able to create new account",
  "description": "",
  "id": "new-account-page;user-should-be-able-to-create-new-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "a user with username \"techfiosdemo@gmail.com\" and password \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user goes to new account page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "create new account with title \"checking\" description \"rent\" balance \"1200\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "new account should be created",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "techfiosdemo@gmail.com",
      "offset": 22
    },
    {
      "val": "abc123",
      "offset": 60
    }
  ],
  "location": "NewAccountSteps.a_user_with_username_and_password(String,String)"
});
formatter.result({
  "duration": 4812082300,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountSteps.user_goes_to_new_account_page()"
});
formatter.result({
  "duration": 9764912300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "checking",
      "offset": 31
    },
    {
      "val": "rent",
      "offset": 54
    },
    {
      "val": "1200",
      "offset": 69
    }
  ],
  "location": "NewAccountSteps.create_new_account_with_title_description_balance(String,String,String)"
});
formatter.result({
  "duration": 4326991500,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountSteps.new_account_should_be_created()"
});
formatter.result({
  "duration": 641009300,
  "status": "passed"
});
});