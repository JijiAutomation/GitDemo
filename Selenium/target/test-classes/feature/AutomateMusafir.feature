Feature: Find flights using Musafir website

@Selenium
Scenario Outline: Find flights flying between source and destination
Given User has navigated to Flipkart website and closes alert window
When User enters <Search> in search box
And User clicks Search button
Then User has navigated to search result page
Examples:
| Search  | 
| Mobiles | 

