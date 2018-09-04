Feature: Naukri registration functinality check
Using this feature user can create new Naukris account

@naukri
Scenario: user wants to register for naukri with valid information
	
		Given user will be on home page of 'naukri.com'
		When user clicks on 'register with us' 
		And selects iam a fresher
		Then user will be redirected to registration page for fresher

		When user enters valid basic details
		Then user should be registered successfully
		