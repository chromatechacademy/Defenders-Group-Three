Feature: Student Information Feature

    @Categories @Bilbo @DCG3 @Regression
    Scenario: Ability to add and delete student categories
        Given a user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
        When a user logins with valid credentials username "general@teacher.com" and password "123456"
        Then the user lands on the home page "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
        And the user clicks on "Student Information" module
        And user selects Student Categories
        Then user is directed to Category page "Create Category"
        When user selects Category and enters "New Area"
        And user clicks on the Category Save button
        Then Category is succesfully saved and confirmation message displays "Record Saved Successfully"
        And user clicks on the Category "New Area" Delete button
        Then Category is deleted

    @admission @Regression
    Scenario: Ability to handle duplicate student admission
        Given a user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
        When a user logins with valid credentials username "general@teacher.com" and password "123456"
        Then the user lands on the home page "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
        And the user clicks on "Student Information" module
        And user selects Student admission
        Then user is directed to Student admission page "Student Admission"
        Then user inputs admission number "xyz"
        Then user selects class "SDET"
        Then user selects section "Selenium Test Automation"
        Then user inputs firstname "TestFn"
        Then user selects gender "Female"
        Then user inputs DOB "01/01/1996"
        Then user selects guardian "Father"
        Then user inputs guardian name "Father Fisrtname"
        Then user inputs guardian phone "1234567890"
        And user clicks on the Category Save button
        Then Error message is displayed "The Admission No field must contain a unique value."

