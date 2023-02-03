Feature: Add Homework Module

    @CTSMSProgression @CHRIS @USID-10
    Scenario: Inspection Of Add Homework Module Link
        Given a Chroma Tech Academy teacher or admin is on login page "https://mexil.it/chroma_tech_academy/dev/site/login"
        When user logs in with valid credentials username "general@teacher.com" and password "123456"
        And user clicks the homework dropdown on dashboard page "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
        Then The following modules should be displayed "Add Homework"