Feature: Income Module Scenarios

   @CTSMSRegression @Geraldine @DFNDRS-6
  Scenario: Income Module
    Given a Chroma Tech Academy teacher or admin is on login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When user logs in with valid credentials username "general@teacher.com" and password "123456"
    And clicks on Income Module 
    Then Sub Modules "Add Income", "Search Income", and "Income Head" display
