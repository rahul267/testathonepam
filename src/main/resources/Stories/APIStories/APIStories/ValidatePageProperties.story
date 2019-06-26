Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario Outline:Validate all page details
When make a get request to get page details
Then validate the response having <title>,<eventTitle>,<eventUrl>
Examples:
|title|eventTitle|eventUrl|
|ApiTest|ApiTest|/APiTest|