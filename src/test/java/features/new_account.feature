@SmokeTest
Feature: New Account Page
As a user I want a new account page sothat users can create new accounts

Scenario Outline: User should be able to create new account
 
Given a user with username "<username>" and password "<password>"
When user goes to new account page
And create new account with title "<title>" description "<description>" balance "<balance>"
Then new account should be created

Examples: 
		|username               |password |title    |description |balance|
		|techfiosdemo@gmail.com |abc123   |checking |rent        |1200|