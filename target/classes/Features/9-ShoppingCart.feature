@SmokeTest
Feature: User could add items to Shopping Cart
  Scenario: user could add HTC ONE M8 phone to Shopping Cart
    When user navigates to website url
    And clicks on ADD TO CART under HTC ONE M8 phone
    Then Notification success message for adding should be displayed
    And Notification success message for adding color is green
    And HTC ONE M8 phone should be added to Shopping Cart Page
    And when add more of the same item to shopping cart, the count increased