Feature: Test Google Search

  Scenario: To validate google search functionlaity
    Given I Open Google in the browser
    When I enter text in search box
    And i hit enter
    Then Valid Seach should display
