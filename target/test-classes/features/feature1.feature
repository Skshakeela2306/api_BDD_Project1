Feature: get user posts

  # common steps for all scenarios
  Background: 
    * uri of rest api in "DEV" environment
    And define HTTP request

  @smoketest @realtest
  Scenario: get all posts
    When submit request via HTTP GET method
    Then status code is 200 and content type is "application/json"

  @smoketest @realtest
  Scenario: get specific post
    When submit request for id "10" via GET method
    Then status code is "200" and id is "10" in json response body
