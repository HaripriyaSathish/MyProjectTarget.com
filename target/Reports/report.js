$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/SignUpFunctionality.feature");
formatter.feature({
  "name": "To Validate the SignUp functionality in Webapplication",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the signup functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To Launch the Application",
  "keyword": "When "
});
formatter.match({
  "location": "SignupMap.to_Launch_the_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the signin icon present in homepage",
  "keyword": "And "
});
formatter.match({
  "location": "SignupMap.to_click_the_signin_icon_present_in_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click Create Account link",
  "keyword": "And "
});
formatter.match({
  "location": "SignupMap.to_click_Create_Account_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the values in first name field",
  "rows": [
    {
      "cells": [
        "First one",
        "Dheeva"
      ]
    },
    {
      "cells": [
        "First two",
        "Ramu"
      ]
    },
    {
      "cells": [
        "First three",
        "Seetha"
      ]
    },
    {
      "cells": [
        "First four",
        "Geetha"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SignupMap.to_pass_the_values_in_first_name_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the values in last name field",
  "rows": [
    {
      "cells": [
        "Last one",
        "Last two",
        "Last three",
        "Last four",
        "Last five"
      ]
    },
    {
      "cells": [
        "Jack",
        "Ken",
        "Sathish",
        "Y",
        "N"
      ]
    },
    {
      "cells": [
        "Kamal",
        "Hari",
        "P",
        "Gopal",
        "Mani"
      ]
    },
    {
      "cells": [
        "Kiran",
        "Charan",
        "D",
        "T",
        "Ram"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SignupMap.to_pass_the_values_in_last_name_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To validate the values create account",
  "keyword": "Then "
});
formatter.match({
  "location": "SignupMap.to_validate_the_values_create_account()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.SignupMap.to_validate_the_values_create_account(SignupMap.java:54)\r\n\tat ✽.To validate the values create account(file:src/test/resources/Features/SignUpFunctionality.feature:43)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});