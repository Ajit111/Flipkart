Feature: Search item

  @Test
  Scenario: Open Chrome browser
   # Given I Open the Chrome Browser
   Given Click on logo Button
   Then Enter Shoes for Men in search field
   Then Click on enter button
   Then Click on page 2
  