@SmokeTest
Feature: Searching
  Scenario: Search by Product Name
    When user navigates to website url
    And inputs "Lumia" as a product Name on search field
    And hits Enter
    Then product should be displayed


  Scenario: Search by Product SKU
    When user navigates to website url
    And inputs "N_1020_LU" as a product SKU on search field
    And hits Enter
    Then product should be displayed