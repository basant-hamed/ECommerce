@SmokeTest
Feature: User should open followsUs links
  Scenario: user opens Facebook link
    When user navigates to website url
    And  user opens Facebook link
    Then Facebook Page is opened in new tab

  Scenario: user opens Twitter link
    When user navigates to website url
    And  user opens Twitter link
    Then Twitter Page is opened in new tab

  Scenario: user opens RSS link
    When user navigates to website url
    And  user opens rss link
    Then News RSS is opened

  Scenario: user opens YouTube link
    When user navigates to website url
    And  user opens YouTube link
    Then YouTube Channel is opened in new tab