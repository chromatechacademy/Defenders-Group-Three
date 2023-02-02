Feature: Navigation Modules Test Scenarios

  @Progression @Angelica
  Scenario: Navigation Modules Test
    Given a Chroma Tech Academy teacher or admin is on login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When user logs in with valid credentials username "general@teacher.com" and password "123456"
    Then user is on dashboard page "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
    Then Student Information Module with the text "Student Information" is displayed
    And Fees Collection Module with the text "Fees Collection" is displayed
    And Income Module with the text "Income" is displayed
    And Expenses Module with the text "Expenses" is displayed
    And Academics Module with the text "Academics" is displayed
    And Human Resource Module with the text "Human Resource" is displayed
    And Homework Module with the text "Homework" is displayed
    And Reports Module with the text "Reports" is displayed
