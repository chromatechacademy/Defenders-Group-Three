Feature: Student Admission Test Scenarios

@CTSMSRegression @Yuliana @DFNDRS-12 @CTSMSSmoke
  Scenario Outline: Student Admission
    Given a Chroma Tech Academy teacher or admin is on login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When user logs in with valid credentials username "general@teacher.com" and password "123456"
    Then user is on dashboard page "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
    When user navigates to Student Information Module
    And navigates to Student Admission Submodule
    And enters unique Student Admission Number "14092004"
    And enters Students first name "Yuliana" and last name "Kuziv"
    And selects class "SDET" and section "Testing Fundamentals"
    And selects gender "Female"
    And enters DOB "09.14.2004"
    And on field If Guardian Is clicks on mother radio button 
    And for Parent Guardian Details enters mothers name "Maria"
    And for Guardian Phone enters "9296528807"
    And clicks on save button
    Then student is succesfully saved and confirmation message is displaying "Record Saved Successfully"

    