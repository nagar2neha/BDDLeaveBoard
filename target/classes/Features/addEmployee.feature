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

Feature: LeaveBoard adding an employee Feature
Scenario Outline: LeaveBoard adding an employee Test Scenario


Given user is already on Login Page
When title of login page is "LeaveBoard.com"
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user goes to Employee tab
Then clicks on Invite Employee
Then user enters employee details "<email>" and "<firstname>" and "<lastname>"
Then Close the browser


Examples: 
|     username       |    password  |         email      | firstname | lastname |
| nehan27@yahoo.com  |    Selenium1 |  mercedes@car.com  | Harry     | Rossen   |
| nehan27@yahoo.com  |    Selenium1 |  apple@fruit.com   | Mark      |  Taylor  |







