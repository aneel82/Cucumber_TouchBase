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
Feature: With this feature we are going to use cucumber hooks

  @tag1
  Scenario: With this scenario we are using hooks of the cucumber
    Given User launch the browser and navigate to the "https://amazon.in"
    When User enter "Hp Laptops" into a search text box
    And  User click on the search button
    And User verify that system should navigate to the result page
    Then User verify the page title 
    And User quit the browser