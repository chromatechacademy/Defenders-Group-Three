Feature: Edit Student Records Test Scenarios

  @CTSMSRegression @Angelica @DFNDRS-14 @smoke
  Scenario: Ability To Edit Student Records Test
    Given a Chroma Tech Academy teacher or admin is on login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When user logs in with valid credentials username "general@teacher.com" and password "123456"
    And user navigates to Student Information Module
    And user clicks on Student Details Submodule
    And user selects "SDET" from Class dropdown and clicks search button
    And user clicks edit button
    And user selects section "Testing Fundamentals" from Section dropdown and blood group "O+" from Blood Group dropdown
    And clicks save button
    Then "Record Update Successfully" message should be displayed