@SmokeTest
Feature: Category Selection
  Scenario: Valid Category Selection
    When user navigates to website url
    And user hovers on Computers category
    And clicks on Notebooks
    Then user should be directed to Notebooks page