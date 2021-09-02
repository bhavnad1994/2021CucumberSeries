$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/2021CucumberSeleniumPractice/src/main/java/features/youtube.feature");
formatter.feature({
  "line": 1,
  "name": "Youtube channel name validation",
  "description": "",
  "id": "youtube-channel-name-validation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Youtube channel name validations",
  "description": "",
  "id": "youtube-channel-name-validation;youtube-channel-name-validations",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Open Chrome browser with URL",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Search selenium tutorial \"\u003cSearchString\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Click enter",
  "keyword": "And "
});
formatter.examples({
  "line": 7,
  "name": "",
  "description": "",
  "id": "youtube-channel-name-validation;youtube-channel-name-validations;",
  "rows": [
    {
      "cells": [
        "SearchString"
      ],
      "line": 8,
      "id": "youtube-channel-name-validation;youtube-channel-name-validations;;1"
    },
    {
      "cells": [
        "selenium by bakkappa n"
      ],
      "line": 9,
      "id": "youtube-channel-name-validation;youtube-channel-name-validations;;2"
    },
    {
      "cells": [
        "selenium webdriver by bakkappa n"
      ],
      "line": 10,
      "id": "youtube-channel-name-validation;youtube-channel-name-validations;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 9,
  "name": "Youtube channel name validations",
  "description": "",
  "id": "youtube-channel-name-validation;youtube-channel-name-validations;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Open Chrome browser with URL",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Search selenium tutorial \"selenium by bakkappa n\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Click enter",
  "keyword": "And "
});
formatter.match({
  "location": "Youtube.open_Chrome_browser_with_URL()"
});
formatter.result({
  "duration": 11041059100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selenium by bakkappa n",
      "offset": 26
    }
  ],
  "location": "Youtube.search_selenium_tutorial(String)"
});
formatter.result({
  "duration": 1133474900,
  "status": "passed"
});
formatter.match({
  "location": "Youtube.click_enter()"
});
formatter.result({
  "duration": 1803120700,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Youtube channel name validations",
  "description": "",
  "id": "youtube-channel-name-validation;youtube-channel-name-validations;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Open Chrome browser with URL",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Search selenium tutorial \"selenium webdriver by bakkappa n\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Click enter",
  "keyword": "And "
});
formatter.match({
  "location": "Youtube.open_Chrome_browser_with_URL()"
});
formatter.result({
  "duration": 13864934000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selenium webdriver by bakkappa n",
      "offset": 26
    }
  ],
  "location": "Youtube.search_selenium_tutorial(String)"
});
formatter.result({
  "duration": 1152486900,
  "status": "passed"
});
formatter.match({
  "location": "Youtube.click_enter()"
});
formatter.result({
  "duration": 1815181500,
  "status": "passed"
});
});