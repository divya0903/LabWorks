Feature: Amazon aaplication to search mobile
Using this application user can search for mobile phones
 

@amazon
Scenario: when user searches for product in amazon with valid information

Given user is given amazon application into their desktop where they search for mobile
	When there is availability of mobile
	Then display all the details of the product

@amazon
Scenario: when user searches for product in amazon with in valid information

Given user is given amazon application into their desktop where they search for mobile
	When there is no availability of mobile
	Then display not matches found

	
