$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("QA1.feature");
formatter.feature({
  "line": 1,
  "name": "Google Search for text QA",
  "description": "",
  "id": "google-search-for-text-qa",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1785480175,
  "status": "passed"
});
formatter.before({
  "duration": 875826837,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Go to www.google.com, search for the term “QA”",
  "description": "",
  "id": "google-search-for-text-qa;go-to-www.google.com,-search-for-the-term-“qa”",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user navigates to url \"https://www.google.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user search for text \"QA\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user wait for link \"QA - Wikipedia\" to be visible and click",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user verifies the link \"Quality assurance\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.google.com",
      "offset": 23
    }
  ],
  "location": "GoogleSearchSteps.userNavigatesToUrl(String)"
});
formatter.result({
  "duration": 2693131097,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "QA",
      "offset": 22
    }
  ],
  "location": "GoogleSearchSteps.userSearchForText(String)"
});
formatter.result({
  "duration": 1632011975,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "QA - Wikipedia",
      "offset": 20
    }
  ],
  "location": "GoogleSearchSteps.userWaitForLinkToBeVisibleAndClick(String)"
});
formatter.result({
  "duration": 3155626510,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Quality assurance",
      "offset": 24
    }
  ],
  "location": "GoogleSearchSteps.userVerifiesTheLink(String)"
});
formatter.result({
  "duration": 52911304,
  "status": "passed"
});
formatter.after({
  "duration": 78143176,
  "status": "passed"
});
formatter.after({
  "duration": 135788776,
  "status": "passed"
});
formatter.uri("QA2.feature");
formatter.feature({
  "line": 1,
  "name": "Login to MagentoTrial.com",
  "description": "",
  "id": "login-to-magentotrial.com",
  "keyword": "Feature"
});
formatter.before({
  "duration": 835352617,
  "status": "passed"
});
formatter.before({
  "duration": 668317292,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "user navigate to Magento home page and login with invalid user name and password",
  "description": "",
  "id": "login-to-magentotrial.com;user-navigate-to-magento-home-page-and-login-with-invalid-user-name-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user go to url \"http://enterprise-demo.user.magentotrial.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user sign in with the userid \"test@pixafy.com\" and password \"123456\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user see an error message",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://enterprise-demo.user.magentotrial.com",
      "offset": 16
    }
  ],
  "location": "loginSteps.userGoToUrl(String)"
});
formatter.result({
  "duration": 17857002945,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@pixafy.com",
      "offset": 30
    },
    {
      "val": "123456",
      "offset": 61
    }
  ],
  "location": "loginSteps.user_sign_in_with_the_userid_and_password(String,String)"
});
formatter.result({
  "duration": 15032411033,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.userSeeAnErrorMessage()"
});
formatter.result({
  "duration": 5549997544,
  "status": "passed"
});
formatter.after({
  "duration": 116496667,
  "status": "passed"
});
formatter.after({
  "duration": 88752085,
  "status": "passed"
});
});