$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("UserRegistration.feature");
formatter.feature({
  "line": 1,
  "name": "User Registration",
  "description": "I want to check that the user can register in vezeeta",
  "id": "user-registration",
  "keyword": "Feature"
});
formatter.before({
  "duration": 128790,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "UserRegistrationByFillingMandatoryFieldsOnly",
  "description": "",
  "id": "user-registration;userregistrationbyfillingmandatoryfieldsonly",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on signUp link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I entered user data",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click join now",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "The registration page displayed successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User can log out and sign in again",
  "keyword": "Then "
});
formatter.match({
  "location": "UserRegistration.the_user_in_the_home_page()"
});
formatter.result({
  "duration": 688063852,
  "status": "passed"
});
formatter.match({
  "location": "UserRegistration.i_click_on_signUp_link()"
});
formatter.result({
  "duration": 1954637468,
  "status": "passed"
});
formatter.match({
  "location": "UserRegistration.i_entered_user_data()"
});
formatter.result({
  "duration": 643172232,
  "status": "passed"
});
formatter.match({
  "location": "UserRegistration.click_join_now()"
});
formatter.result({
  "duration": 96464517,
  "status": "passed"
});
formatter.match({
  "location": "UserRegistration.the_registration_page_displayed_successfully()"
});
formatter.result({
  "duration": 5082810009,
  "status": "passed"
});
formatter.match({
  "location": "UserRegistration.User_can_log_out_and_sign_in_again()"
});
formatter.result({
  "duration": 4945508783,
  "status": "passed"
});
formatter.after({
  "duration": 78222,
  "status": "passed"
});
});