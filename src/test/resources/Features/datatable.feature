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
Feature: Amazon login functionality with datatable

  @tag1
  Scenario: Amazon login scenario with datatable
    Given User successfully navigate to url
    |https://amazon.in|
    And  Title of the page should displayed
    When User search for the Product as productName at search text box
    |Peanut Butter|
    And  Click on the Search Button
    Then User can be able to Verify the result
    And User successfully close browser
