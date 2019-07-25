Feature: Login feature

Scenario: Login and Navigate to Admin
Given i login to Login to events platform as Event Owner Internal
And Click on Profile photo at the top right corner with Admin

Scenario: Event Creation
Given i  Click 'New Event' button
Then  Set any title <title>
Then  Set both start and end dates in the future (start and end dates should be equal)
Then  Set any title
Then Set Public privacy setting
Then Click Next
Then Set Empty Template and create event
Examples:
|title|
|abc7|

Scenario: Event Verification
Then verify that title  <title> , SuggestedURL <suggestedURL> , StartEndDate <StartEndDate> and PrivacySettings<PrivacySettings> are found
Examples:
|title|suggestedURL|StartEndDate|PrivacySettings|
|abc|abc|07252019|public|

Scenario: Add Page and Publish
Then Add proposed talk page
Then Publish the event


