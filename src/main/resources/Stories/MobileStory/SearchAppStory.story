// Mobile Story
Scenario: Google Search Functionality

Given I Open app com.chrome
And I Open Googl.com in Browser
When I type query as "BrowserStack"
Then I submit
Then I should see title "BrowserStack - Google Search"