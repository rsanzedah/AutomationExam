$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:trial.feature");
formatter.feature({
  "name": "Trial BETA application test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate Beta Login Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.match({
  "location": "loginsteps.user_opens_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginsteps.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks signin",
  "keyword": "Then "
});
formatter.match({
  "location": "loginsteps.user_clicks_signin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user closes the pop up",
  "keyword": "Then "
});
formatter.match({
  "location": "loginsteps.user_closes_the_pop_up()"
});
formatter.result({
  "status": "passed"
});
});