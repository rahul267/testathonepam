Meta:

Narrative:
As a user When I invoke GetAll Events API then status code should be 200 and validate the response

Scenario: To validate the response of GET API Request
When I make a get Request to get all events
Then validate the getEvents status code is <statusCode>
And validate the success response having <eventTitle>,<eventId>,<eventDate>,<eventisPast>
Examples:
|statusCode|eventTitle|eventId|eventDate|eventisPast|
|200|ApiTests|123|1234|false|


