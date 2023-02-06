Feature: Fees Collecton Submodules Test Scenarios

  @CTSMSRegression @Angelica @DFNDRS-5
  Scenario: Fees Colection Submodules Test
    Given a Chroma Tech Academy teacher or admin is on login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When user logs in with valid credentials username "general@teacher.com" and password "123456"
    Then user is on dashboard page "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
    When user clicks on "Fees Collection" Module
    Then Collect Fees Submodule is displayed with the text "Collect Fees"
    And Search Fees Payment Submodule is displayed with the text "Search Fees Payment"
    And Search Due Fees Submodule is displayed with the text "Search Due Fees"
    And Fees Master Submodule is displayed with the text "Fees Master"
    And Fees Group Submodule is displayed with the text "Fees Group"
    And Fees Type Submodule is displayed with the text "Fees Type"
    And Fees Discount Submodule is displayed with the text "Fees Discount"
    And Fees Carry Forward Submodule is displayed with the text "Fees Carry Forward"
    And Fees Reminder Submodule is displayed with the text "Fees Reminder"
