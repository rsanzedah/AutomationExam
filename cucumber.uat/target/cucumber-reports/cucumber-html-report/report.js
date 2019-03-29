$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Color.feature");
formatter.feature({
  "name": "Color Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify blue",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user in page",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on Set SkyBlue background",
  "keyword": "Then "
});
formatter.step({
  "name": "users page turns blue",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "color",
        "pass"
      ]
    },
    {
      "cells": [
        "techfiosdemo@gmail.com",
        "abc123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify blue",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user in page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefintion.user_in_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Set SkyBlue background",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefintion.user_clicks_on_Set_SkyBlue_background()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users page turns blue",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefintion.users_page_turns_blue()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify white",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "users in page",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on Set white background",
  "keyword": "Then "
});
formatter.step({
  "name": "users page turns white",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "white",
        "yes"
      ]
    },
    {
      "cells": [
        "white",
        "yes"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify white",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "users in page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefintion.users_in_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Set white background",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefintion.user_clicks_on_Set_white_background()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users page turns white",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefintion.users_page_turns_white()"
});
formatter.result({
  "status": "passed"
});
});