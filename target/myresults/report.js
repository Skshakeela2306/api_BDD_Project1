$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/feature1.feature");
formatter.feature({
  "name": "get employees details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "get all posts information",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "register end point like \"https://jsonplaceholder.typicode.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "glue.Stepdefs1.method1(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "define HTTP request",
  "keyword": "And "
});
formatter.match({
  "location": "glue.Stepdefs1.method2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "submit request via get method to Restfull service",
  "keyword": "When "
});
formatter.match({
  "location": "glue.Stepdefs2.method3()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "status code is \"201\" and content type is \"application/json\"",
  "keyword": "Then "
});
formatter.match({
  "location": "glue.Stepdefs2.method4(java.lang.String,java.lang.String)"
});
formatter.write("Test failed because 200 application/json; charset\u003dutf-8");
formatter.result({
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:97)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:969)\r\n\tat org.testng.Assert.assertTrue(Assert.java:43)\r\n\tat org.testng.Assert.assertTrue(Assert.java:53)\r\n\tat glue.Stepdefs2.method4(Stepdefs2.java:37)\r\n\tat ✽.status code is \"201\" and content type is \"application/json\"(file:///E:/apibatch2/org.magnitia11.restapibddpicotestng/src/test/resources/features/feature1.feature:7)\r\n",
  "status": "failed"
});
});