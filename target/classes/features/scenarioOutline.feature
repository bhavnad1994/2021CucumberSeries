Feature: form data entry feature testing


Background:
Given User already on landing Page
When user clicks on Form Authentication link
Then user lands on Form Authentication page

Scenario Outline: verify data entry with scenario outline functionality 
When user enter "<username>" and "<password>"
And user clicks on login button
Then user lands on landing page

Examples:    
 |username|password|
 |tomsmith|SuperSecretPassword!|
 |tom|SuperSecret|
              

