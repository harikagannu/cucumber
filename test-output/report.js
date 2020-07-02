$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/harika/workspace/CucumberFramework/src/test/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "E Commerce Login Feature",
  "description": "",
  "id": "e-commerce-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login Test Scenario",
  "description": "",
  "id": "e-commerce-login-feature;login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enter User name and Password",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 9397696300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enter_User_name_and_Password()"
});
formatter.result({
  "duration": 1056270800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 536573400,
  "status": "passed"
});
});