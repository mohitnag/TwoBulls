Feature: Google Search for text QA

  Scenario: Go to www.google.com, search for the term “QA”
    Given user navigates to url "https://www.google.com"
    When user search for text "QA"
    And user wait for link "QA - Wikipedia" to be visible and click
    And user verifies the link "Quality assurance"
