Feature: Validate Agent Module Text Scenarios

    @CTSMSRegression @Yuliana @DFNDRS-44
    Scenario: Validate Agent Module Text
        Given an admin user is on login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
        When an admin user logs in with valid credentials email "admin@mexil.it" and password "123456"
        And navigates to the Agents page
        Then user is able to see following text "Members List", "Active", "Inactive", "All Agents", "Add Now", "Name", "Mail", "Contact Number", "Actions"