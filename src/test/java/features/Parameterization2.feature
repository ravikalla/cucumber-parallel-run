Feature: GoogleSearch
@web
  Scenario: Validate Search feature
    Given I open a browser
    When I navigate to google page
    And I enter "Ram" in search keyword
    Then I validate searched text
