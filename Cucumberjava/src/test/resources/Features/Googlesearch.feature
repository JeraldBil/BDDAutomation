Feature: Validate to test Google Search Functionality

Scenario: Validate Google Search is working 

Given browser is open
And user is on google search page
When user enters the test in search box
And hits enter
Then user is navigated to search results.
