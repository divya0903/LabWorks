Feature: Login functionality Check
Using this feature user can login 

Background: user is trying to login
@login
Scenario: user trying to login without entering username

	Given user is in login page
	When user does not enter username
	Then please enter username message should be displayed
	
@login
Scenario: user trying to login without entering password
	
	Given user is in login page
	When user does not enter password
	Then please enter password message should be displayed

@login
Scenario: user trying to login using valid username and password

	Given user is in login page 
	When user gives valid username and password 
	Then user should login to the account successfully
@login
Scenario: user trying to login using invalid username and password

	Given user is in login page 
	When user gives invalid login credentials
	Then it gives an error message displaying invalid username and password

	
