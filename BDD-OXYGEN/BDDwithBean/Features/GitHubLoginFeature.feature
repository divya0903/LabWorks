Feature: Github login functionality Check
Using this feature user can login into github account

Background: user is already having github account
@login
Scenario: user trying to sign in into GITHUB account using valid username and password

	Given user is in github login page 
	When user gives valid username and password 
	Then user should login to the account successfully
@login
Scenario: user trying to sign in Into GITHUB account using invalid username and password

	Given user is in github login page 
	When user gives invalid login credentials
	Then it gives an error message displaying invalid username and password

	