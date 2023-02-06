Feature: Disabling a Student Module Scenario

   @Geraldine @CTSMSProgression  @DFNDRS-15
  Scenario: Disabling Student Module
    Given a Chroma Tech Academy teacher or admin is on login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When user logs in with valid credentials username "general@teacher.com" and password "123456"
    Then user is on dashboard page "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
    And navigates to Student Information Module
    And navigates to Student Details Sub Module
    Then user is directed to Student Details page with the text "Select Criteria"
    And Selects Class "SDET" and Section "Testing Fundamentals"
    And clicks search button
    Then user is directed to Student Details page with the text "Select Criteria"
    And clicks on student name "Yuliana Kuziv" 
    And clicks the red thumbs down icon in the upper right corner
    And clicks OK on the pop up alert

   
   
