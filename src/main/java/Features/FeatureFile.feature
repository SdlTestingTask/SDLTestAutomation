Feature: Create SDL Test automation

Scenario: SDL Login

Given user is open login page
When user enter username and password
Then user open projects page
Then user click on the New Project button
Then select general details
Then select the translate engine
Then select the pricing model
Then select the workflow
And user stop the test

