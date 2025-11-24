@Smoke @Function @Regression
Feature: Login function test 
Background: 
Given open chrome
And go to app link

@Positive @SB-11
Scenario Outline: check login function with valid credentials 
When enter valid user "<User>"
And enter valid password "<Pass>"
And click login button
Then login should pass and there should be logout button visible

@Negative @SB-19
Scenario: check login function with invalid credentials 
When enter invalid user "<User>"
And enter invalid password "<Pass>"
And click login button
Then login fails and no logout button

@Negative @SB-13
Scenario: check login function with empty credentials 
When click login button
Then login fails and no logout button

@Negative @SB-17
Scenario: check login function with invalid username and valid password 
When enter invalid user "<User>"
And enter valid password "<Pass>"
And click login button
Then login fails and no logout button

@Negative @SB-15
Scenario: check login function with empty username and valid password 
When enter valid password "<Pass>"
And click login button
Then login fails and no logout button
 
@Negative @SB-16
Scenario: check login function with valid username and invalid password 
When enter valid user "<User>"
And enter invalid password "<Pass>"
And click login button
Then login fails and no logout button
 

