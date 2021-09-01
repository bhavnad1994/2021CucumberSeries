$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginfeature.feature");
formatter.feature({
  "line": 1,
  "name": "herokuapp App Add/Remove Elements functionality",
  "description": "",
  "id": "herokuapp-app-add/remove-elements-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 14,
  "name": "Add/Remove Elements functionality1 testing scenario",
  "description": "",
  "id": "herokuapp-app-add/remove-elements-functionality;add/remove-elements-functionality1-testing-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@Smoke"
    },
    {
      "line": 13,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User already on landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user clicks on Add/Remove Elements link",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user lands on Add/Remove Elements page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user click two times on Add element button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "two Delete buttons are displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user clicks on one Delete button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "one Delete button is un-displayed and another Delete button is still displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user again click on delete button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "All delete button is un-displayed",
  "keyword": "And "
});
formatter.match({
  "location": "AddRemoveElement.user_already_on_landing_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddRemoveElement.user_clicks_on_Add_Remove_Elements_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddRemoveElement.user_lands_on_Add_Remove_Elements_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddRemoveElement.user_click_two_times_on_Add_element_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddRemoveElement.two_Delete_buttons_are_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddRemoveElement.user_clicks_on_one_Delete_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddRemoveElement.one_Delete_button_is_un_displayed_and_another_Delete_button_is_still_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddRemoveElement.user_again_click_on_delete_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddRemoveElement.all_delete_button_is_un_displayed()"
});
formatter.result({
  "status": "skipped"
});
});