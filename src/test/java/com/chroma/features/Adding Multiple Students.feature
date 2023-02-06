Feature: Adding Multiple Students Scenario

  @CTSMSRegression @Geraldine @DFNDRS-19
  Scenario Outline: Adding multiple students
    Given a Chroma Tech Academy teacher or admin is on login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When user logs in with valid credentials username "general@teacher.com" and password "123456"
    Then user is on dashboard page "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
    When user navigates to Student Information Module
    And navigates to Student Admission Submodule
    Then user enters unique Student Admission Number "<ADMISSION NUMBER>"
    And enters Students first name "<FIRST NAME>"
    And enters last name "<LAST NAME>"
    And selects class "<CLASS>"
    And selects section "<SECTION>"
    Then user selects gender "<GENDER>"
    And user enters DOB "<DOB>"
    And on the field If Guardian Is clicks on mother radio button
    And for Parent Guardian Details user enters mothers name "<MOTHERS NAME>"
    And user enters "<GUARDIAN PHONE NUMBER>"
    And user clicks on save button

    Examples: 
      | ADMISSION NUMBER | CLASS | SECTION              | FIRST NAME | LAST NAME | GENDER | DOB        | MOTHERS NAME | GUARDIAN PHONE NUMBER |
      |         76538959 | SDET  | Testing Fundamentals | Test       | Test      | Female | 11/02/1995 | MOM          |            2023369795 |
      |         51233445 | SDET  | Testing Fundamentals | Rob        | Test      | Male   | 03/10/1990 | MOM          |            7036871234 |
      |         12356745 | SDET  | Testing Fundamentals | Name       | Test      | Male   | 03/10/1995 | MOM          |            7036871234 |
