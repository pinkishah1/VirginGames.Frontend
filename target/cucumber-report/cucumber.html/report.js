$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Virgin Games",
  "description": "",
  "id": "virgin-games",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12504554100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": ": User is able to register details",
  "description": "",
  "id": "virgin-games;:-user-is-able-to-register-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User accepts cookies",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User verifies the Welcome text",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 207500600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.userAcceptsCookies()"
});
formatter.result({
  "duration": 207561400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.userVerifiesTheWelcomeText()"
});
formatter.result({
  "duration": 108458800,
  "status": "passed"
});
formatter.after({
  "duration": 1114096300,
  "status": "passed"
});
});