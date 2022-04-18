Feature: Google Search

  Scenario: Search for Cucumber in Google
    When Hit Google on your browser
    When Enter the Username and Password
    Then Click login
    Then Reset the credential