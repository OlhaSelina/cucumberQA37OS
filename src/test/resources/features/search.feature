Feature: Search

  @searchWithValidData
    Background:
    Given User launches Chrome browser
    And User opens ilCarro HomePage

    Scenario: Search for a car for a future date
      When User click ilCarro Search
      And User enters valid city
      And User click stert and end date
      And User click on YallaSearch button
      Then A list of cars is displayed

