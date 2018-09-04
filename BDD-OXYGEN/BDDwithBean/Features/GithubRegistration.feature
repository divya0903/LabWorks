Feature: Github registration functinality check
Using this feature user can create new git github account

#@register
Scenario: user wants to register for github account with valid information
		Given user is on github sign up page
		When user enters valid username, email and password
		Then account should be created successfully for the user

@register		
Scenario: user wants to register for github account with invalid username
		Given user is on github sign up page
		When user enters invalid username
		Then Invalid UserName message should be displayed

@register		
Scenario: user wants to register for github account with invalid email
		Given user is on github sign up page
		When user enters invalid email
		Then Invalid email message should be displayed
		
@register
Scenario: user wants to register for github account with invalid password
		Given user is on github sign up page
		When user enters passowrd less than 7 characters
		Then Password should be greater than 7 characters will be displayed
@register
Scenario: user wants to register for github account with no numbers in password
		Given user is on github sign up page
		When user enters passowrd without numbers
		Then Password needs atleast one number message will be displayed
		
		