Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: To validate the response of GET API Request
When I make a get Request to get all events
Then validate the response having <eventTitle>,<eventId>,<eventDate>,<eventTime>
Examples:
|eventTitle|eventId|eventDate|eventTime|
|ApiTests|123|1234|123|