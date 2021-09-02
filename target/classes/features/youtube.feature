Feature: Youtube channel name validation
Scenario Outline: Youtube channel name validations
	Given Open Chrome browser with URL
	When Search selenium tutorial "<SearchString>"
	And Click enter
	
Examples:
	|SearchString|
	|selenium by bakkappa n|
	|selenium webdriver by bakkappa n|