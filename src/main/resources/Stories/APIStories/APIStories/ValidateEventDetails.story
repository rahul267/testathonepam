Meta:

Narrative:
As a user When I invoke GetEventDetails API then status code should be 200 and validate the response

Scenario: Validate all page details
When I make a get request to get Eventpage details for eventId<eventId>
Then validate the status code is <statusCode>
And validate the response having type<type>,title<title>,eventTitle<eventTitle>,eventUrl<eventUrl>,eventDate<eventDate>,isPast<isPast>
Examples:
|eventId|statusCode|type|title|eventTitle|eventUrl|eventDate|isPast|
|73175|200|Main|title|0qmR6CuvKaCBb u39pjE9vqeXyz HA6zf7nTp7IM|https://autorqa.events.epam.com/events/0qmr6cuvkacbbu39pje9vqexyzha6zf7ntp7im|10 - 20 Jul 2019|false|


Scenario: To validate the response of event proposed talks
When I make a get request to get Event proposed talks for eventId<eventId>
Then validate the status code is <statusCode>
And validate the proposed talks response having type<type>,title<title>,eventTitle<eventTitle>,eventUrl<eventUrl>,eventDate<eventDate>,isPast<isPast>
Examples:
|eventId|statusCode|type|title|eventTitle|eventUrl|eventDate|isPast|
|73175|200|ProposedTalks|title|0qmR6CuvKaCBb u39pjE9vqeXyz HA6zf7nTp7IM|https://autorqa.events.epam.com/events/0qmr6cuvkacbbu39pje9vqexyzha6zf7ntp7im|10 - 20 Jul 2019|false|

Scenario: To validate the response of event agenda properties
When I make a get request to get Event agenda properties for eventId<eventId>
Then validate the status code is <statusCode>
And validate the agenda properties response having type<type>,textType<textType>,textText<textText>
Examples:
|eventId|statusCode|type|textType|textText|
|73175|200|Agenda|main|Agenda|

Scenario: To validate the response of event Speaksers details
When I make a get request to get Event speakers details for eventId<eventId>
Then validate the status code is <statusCode>
And validate the speakers deatils response having type<type>,textType<textType>,textText<textText>
Examples:
|eventId|statusCode|type|textType|textText|
|73175|200|Speakers|main|Speakers|