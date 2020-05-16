Feature: Application Login
Scenario: Home page default login

Given User is on the Netbanking landing page
When User login to the application with username and password
Then Home page is populated
And Cards are displayed
