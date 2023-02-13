Feature: Disabling a Student Module Scenario

  @CTSMSRegression @Geraldine @DFNDRS-15
  Scenario: Disabling Student Module
    Given a Chroma Tech Academy teacher or admin is on login page "https://chroma.mexil.it/site/login"
    When user logs in with valid credentials username "general@teacher.com" and password "123456"
    And navigates to Student Information Module
    And navigates to Student Details Sub Module
    And Selects Class "SDET" and Section "Testing Fundamentals"
    And clicks search button
    And clicks on student name "Kevin Test"
    And clicks the red thumbs down icon in the upper right corner
    And clicks OK on the pop up alert
    And selects "TestDisableReason" in the Reason drop down menu
    And user clicks save button
    Then user should see the name of the student in the Disabled Students Page
