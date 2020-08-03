@datatable00
Feature: scenario outline example
  Scenario: testing the data tables web page
    Given User is on the datatables homepage
    When User clicks on new button
    And User enters first name
    And User enters last name
    And User enters position
    And User enters office
    And User enters extension
    And User enters start date
    And User enters salary
    And User clicks Create button
    And User enters first name to the searchbox
    Then verify that user see the first name in the searchbox