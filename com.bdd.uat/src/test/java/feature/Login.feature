Feature: Login Functionality 
@Test
Scenario Outline: Verify Login
Given user in login page
Then user enters "<username>" and "<password>"
Then clicks on sign in button
Then sucessfully signs in to homepage 

Examples:
|username|password|  
|techfiosdemo@gmail.com|abc123|