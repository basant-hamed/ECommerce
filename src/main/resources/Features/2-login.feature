@SmokeTest
Feature: Login
  Scenario: Valid Login
    When user navigates to website url
    And clicks on Login tab
    And user enters "Passant@Hamed.com" as an email and "123456" as a password
    And clicks on Login
    Then user could successfully logged in