Feature: Login feature

Scenario: Login and Navigate to Admin
Given i login to Login to events platform as Event Owner Internal
And Click on Profile photo at the top right corner with Admin

Scenario: Event
Given i  Click 'New Event' button
Then  Set any title
Then  Set both start and end dates in the future (start and end dates should be equal)
Then Set Public privacy setting
Then Click Next
Then Set Empty Template
Then Click Create Event"
