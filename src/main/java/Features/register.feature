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

Feature: Register a company
Scenario: Register a company, email-id and password


Given user opens the Home Page
Then user clicks on Register Button
Then user enters companyname and other details
|  Toyota  |  Martin  |  Patrick  | corolla@toyota.com  | cars1234   |
Then he clicks on register company
Then Close the current browser




