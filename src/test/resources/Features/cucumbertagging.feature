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
Feature: This is the feature for validating the home page title

  @tag1 @SmokeTest
  Scenario: Logged in with amazon website
    Given User Successfully logged in with "https://amazon.in"
    Then User is validate the title of the page
    And User successfully close the browser

  @tag2 @RegressionTest
  Scenario Outline: Amazon login scenario with Parameter
    Given User Successfully logged in with <url> 
    And  User is validate the title of the page 
    When User search for Product with <productName>
    And  Click on the search button verify that the result display
    Then User successfully close the browser

    Examples: 
      | url       						| productName          | 
      | "https://amazon.in"   | "Red Mi Mobile"      |  
      
   @tag3 @Smoke 
   Scenario:  Flipkart login 
      Given User Successfully logged in with "https://flipkart.com"
      Then User is validate the title of the page
      Then User successfully close the browser
     
     
   @tag2   
   Scenario: facebook login 
      Given User Successfully logged in with "https://facebook.com"
      Then User is validate the title of the page
      When User successfully close the browser
      
   @tag3 @Smoke
   Scenario: gaana login test
      Given User Successfully logged in with "https://gaana.com"
      Then User is validate the title of the page
      Given User successfully close the browser
      
   @tag3 @RegressionTest 
   Scenario: gmail login
      Given User Successfully logged in with "https://gmail.com"
      Then User is validate the title of the page
      And User successfully close the browser
      
      
   @tag2 @RegressionTest  
   Scenario:  stackoverflow login test
      Given User Successfully logged in with "https://stackoverflow.com"
      Then User is validate the title of the page
      And  User successfully close the browser
      
   @tag1 @SmokeTest  
   Scenario: youtube login test 
      Given User Successfully logged in with "https://youtube.com"
      Then User is validate the title of the page
      And User successfully close the browser
      
   
   @tag3   
   Scenario: Mahindra login test
      Given User Successfully logged in with "https://www.mahindra.com"
      Then  User is validate the title of the page
      And  User successfully close the browser
   
    