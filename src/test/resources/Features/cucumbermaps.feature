#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Amazon login functionality with datatable Map

  @tag1
  Scenario: Amazon login scenario with datatable Map
    Given User successfully navigate to amazon url
    |UrlName|
    |https://amazon.in|
    And  Amazon page title should displayed
    When User looking for the Product as productName at search txt box
    |ProductName|
    |Peanut Butter|
    And  User click on the Search button
    Then User should navigate to the result page
    And  Browser closed successfully 
