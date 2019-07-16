// Google Story
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
!-- "To Verify:
!-- 1. Title
!-- 2. Suggested URL
!-- 3. Start and End dates
!-- 4. Privacy setting
!-- 5. Unlisted (should be unselected)"
!-- Left-bottom angle
!-- "TODO:
!-- 1. Expand Pages section
!-- 2. Click Add Page
!-- 3. Select Proposed Talks
!-- 4. Click Add button"
!-- "TODO:
!-- 1. Click 'Publish Event' button
!-- 2. Click 'Publish' button in the event"
!--

@platform : Desktop/Mobile @Browser : Chrome /App @env : dev/stg/prod @type : smoke/integration/regression  @
Scenario :
Given i  Click 'New Event' button in
