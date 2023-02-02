Feature: Login functionality
   User will be able to log in to the website using credentials.

  @Smoke
  Scenario Outline: Login with invalid credentials
    Given a user navigate to the login page "https://mexil.it/chroma_tech_academy/test/site/login"
    Then user enters invalid Username "<username>" and Password "<password>"
    And user click on the Sign In button
    Then user should see an error message indicating that the login was not successful

    Examples: 
      | username | password |
      | test     | test     |
