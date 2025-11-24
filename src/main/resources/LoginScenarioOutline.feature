
Feature: Login function test

@SB-14
Scenario Outline:  
Given open any browser
And go to application
When enter user "<User>"
And enter pass "<Pass>"
And click login button
Then login fails and no logout button

Examples:

|User |Pass |
|Batch44 |student123@ |
|sarower |sarower@ |
|Batch44 |sarower@ |
|sarower |student123@ |
|  |  |
|  |student123@ |
|Batch44 |  |