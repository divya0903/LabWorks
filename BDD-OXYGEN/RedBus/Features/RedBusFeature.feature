Feature: redBus Application
Using this application user can search availability of buses from one location to another location 

@redbus
Scenario: user tries to search bus between different locations

			Given user is given with redbus application on their desktop
			When  user enters valid source, destination, onward date and return date(optional) 
			Then  display the page showing all the details of available buses on that particular day
			
