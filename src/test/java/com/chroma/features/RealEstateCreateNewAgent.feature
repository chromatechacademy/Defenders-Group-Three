Feature: Creating New Agent

  @RERegression @Geraldine @DFNDRS-45
  Scenario: Creating a new agent
    Given an admin user is on the Real Estate login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When user logs in with username and password "admin@mexil.it" "123456"
    And verifies a unique agent has been added wih "Name123", "Doe", "0000110000", "majd6u4e@gmailw.com", "password1"
    Then admin goes to Active Members list
    Then admin checks if agent with email "majd6u453e@gmailw.com" was succesfully added
    And admin logs out the admin site
    Given an admin user is on the Real Estate login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/login.php"
    When user logs in with valid username and password "majd6u4e@gmailw.com" "password1"
    Then the admin is landed on a Agent home page with text "Hello, Name123"
