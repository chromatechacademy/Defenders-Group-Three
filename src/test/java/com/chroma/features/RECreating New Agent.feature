Feature: Creating a New Agent Scenario

  @Geraldine @Progression @DFNDRS-45
  Scenario Outline: Creating New Agent with Unique Name
    Given an admin or student user is on login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When admin or student user logs in with valid credentials email "admin@mexil.it" and password "123456"
    Then admin or student user should be on dashboard page "<DASHBOARD URL>"
    And admin clicks on the Agent Button
    

    Examples: 
      | FIRSTNAME | LASTNAME | EMAIL          | CONTACTNUMBER | PASSWORD |
      | Name      | Test     | name1@test.com |  888-111-0000 |   123456 |
