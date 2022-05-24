@SmokeTest
Feature: SliderWrapper is Clickable
  Scenario: user could click on Nokia on slider
    When user navigates to website url
    And Nokia Slide is clicked on
    Then Nokia page should be opened


  Scenario: user could click on Iphone on slider
    When user navigates to website url
    And Iphone Slide is clicked on
    Then Iphone page should be opened