Feature: Login Feature
This feature includes scenario that would validate the following logins
1.Admin login
2.linda.anderson
3.Negative login

Background:	
Given I am able to navigate to login

#Scenario: Admin Login
#Given I am able to navigate to login
#When i update username as "Admin"
#And i update the password as "admin123"
#And i click on the login button
#Then i should see the user name as "Welcome Linda"

#Scenario: linda.anderson Login
#Given I am able to navigate to login
#When i update username as "linda.anderson"
#And i update the password as "linda.anderson"
#And i click on the login button
#Then i should see the user name as "Welcome Rushikesh"

Scenario Outline: Login with different users
When i update username as "<user>"
And i update the password as "<password>"
And i click on the login button
Then i should see the user name as "<name>"

Examples:
|user					 |password			|name							|
|linda.anderson|linda.anderson|Welcome Rushikesh|
|linda.anderson|linda.anderson|Welcome Rushikesh|

@negative
Scenario: negative Login
Given I am able to navigate to login
When i update username as "kaustub"
And i update the password as "kaustub"
And i click on the login button
Then i should see the error message as "Invalid credentials"
