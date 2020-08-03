@wait
Feature: Explicit wait
  Scenario: Explicit wait example
    Given user is on the demo page
    And user clicks on start button
    And user wait until the page loads
    Then verify the Hello World! text is visible
