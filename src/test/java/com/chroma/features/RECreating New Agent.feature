Feature: Creating a New Agent Scenario

  @Geraldine @CTSMSProgression @DFNDRS-45
  Scenario Outline: Creating New Agent with Unique Name
    Given an admin or student user is on login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
    When admin or student user logs in with valid credentials email "admin@mexil.it" and password "123456"
    Then admin or student user should be on dashboard page "<DASHBOARD URL>"
    And admin clicks on Agent Button
    Then admin will land on the Agents page with the text "All Agents"
    And admin will click on the Add Now Button
    Then admin enters Agent "<FIRST NAME>" and "<LAST NAME>"
    Then admin enters Agent "<EMAIL>" "<CONTACTNUMBER>" "<PASSWORD>"
    And admin will click Save Button
    #Then admin goes to active members list
    #Then admin checks if agent with email "<EMAIL>" was succesfully added
    #And admin logs out the admin site
    #Then admin should be logged out and "Welcome" message should be displayed

    Examples: 
      | FIRSTNAME | LASTNAME | EMAIL          | CONTACTNUMBER | PASSWORD |
      | Name      | Test     |  |  888-111-0000 |   123456 |
