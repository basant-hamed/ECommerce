@SmokeTest
Feature: Switch Currency
  Scenario: Valid Switch
    When user navigates to website url
    And switch to Euro
    Then Euro should be selected