Feature: Student Admission

  @Geraldine
  Scenario: Adding multiple students in one session
    Given a Chroma Tech Faculty member is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When user logs in with valid credentials
    And navigates to Student Information Module
    And navigates to Student Admission Submodule
    Then user is directed to Student Admission page with text "Student Admission"
    And enters a unique Student Admission Number "4556"
    And selects Class "SDET" and Section "Selenium Test Automation"
    And enters first name "<FIRST NAME>" and last name "<LAST NAME>"
    And selects gender "<GENDER>"
    And enters Date of Birth "DOB"
    And for Parent Guardian Details enters mothers "<MOTHERS NAME>"
    And for If Guardian is field clicks Mother radio button
    And enters Guardian Phone number "<GUARDIAN PHONE NUMBER>"
    When user clicks on save button
    Then student is succusefully saved and confirmation message displays "Record Saved Successfully"

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | URL                                                 | USERNAME            | PASSWORD | ADMISSION NUMBER | CLASS          | SECTION                 | FIRST NAME | LAST NAME | GENDER | DOB        | MOTHERS NAME | GUARDIAN PHONE NUMBER |
      | https://mexil.it/chroma_tech_academy/dev/site/login | general@teacher.com |   123456 |           765359 | SDET           | Testing Fundamentals    | GERALDINE  | HOYOS     | Female | 11/02/1995 | BETH         |            2023369795 |
      | https://mexil.it/chroma_tech_academy/dev/site/login | general@teacher.com |   123456 |           123459 | Cyber Security | Networking Fundamentals | ROB        | HOYOS     | Male   | 03/10/1990 | BEST MOM     |            7036871234 |
      | https://mexil.it/chroma_tech_academy/dev/site/login | general@teacher.com |   123456 |           123453 | Cyber Security | Networking Fundamentals | ELIJAH     | HOYOS     | Male   | 03/10/1990 | COOL MOM     |            7036871235 |
