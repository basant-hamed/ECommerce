@SmokeTest
Feature: User could add items to wishlist
  Scenario: user could add HTC ONE M8 phone to wishlist
    When user navigates to website url
    And clicks on wishlist icon under HTC ONE M8 phone
    Then Notification success message should be displayed
    And Notification success message color is green
    And HTC ONE M8 phone should be added to WishList Page
    And when add more of the item, the count increased