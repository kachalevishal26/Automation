Feature: Verify the login with different inputs

Scenario: Positive test login
Given Initialize the browser and navigate to the "http://automationpractice.com/index.php" site
When Click on Login button and enter "sunny+25@sunnny.com" & "123456" and logs in
Then Verify that the user is Successfully logged in