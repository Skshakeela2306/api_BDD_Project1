Feature: posts updation

  # User Acceptence test in Staging server
  Background: 
    Given uri of rest api in "STG" environment
    And define HTTP request

  @acceptencetest @realtest
  Scenario: update an existing post
    When submit request for id 100 via PUT method
      | data           |
      | hi, h r u?, 10 |
    Then status code is 200 and content type is "application/json"

  @acceptencetest @realtest
  Scenario: update posts
    When submit request via PUT to service by taking data from excel file
    Then validate response as per data in excel file
