// Mobile Story

Scenario: Open Event App
Given I setup Mobile Evironment to open com.epam.events.app.debug com.epam.events.app.MainActivity on http://127.1.1.1:4723
Then I Skip LogIn and goto event Page
Then I Open Some Event

