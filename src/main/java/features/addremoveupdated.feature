Feature: herokuapp App Add/Remove Elements functionality

Background:
Given User already on landing Page
When user clicks on Add/Remove Elements link
Then user lands on Add/Remove Elements page

Scenario: verify Single Add/Remove Elements functionality 
And user click one time on Add element button
Then one Delete button is displayed
And user click on Delete button
Then Delete button is un-displayed

Scenario: verify multiple Add/Remove Elements functionality
And user click two times on Add element button
Then two Delete buttons are displayed
And user clicks on one Delete button
Then one Delete button is un-displayed and another Delete button is still displayed
And user again click on delete button
And All delete button is un-displayed