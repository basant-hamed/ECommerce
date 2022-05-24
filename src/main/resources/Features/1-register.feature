@SmokeTest
  Feature: Register
    Scenario: Valid Registration
      When user navigates to website url
      And Click on Register Tab
      And select gender option
      And user enters "Passant" as a first name, "Hamed" as a last name, "Passant@Hamed.com" as an email
      And Select Day, Month and Year
      And fill "Google" as company name
      And fill "123456" as a password and "123456" as a confirm password
      And clicks on Register
      Then user could successfully register