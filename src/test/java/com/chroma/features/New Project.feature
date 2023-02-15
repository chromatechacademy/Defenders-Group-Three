Feature: Create a New Project Scenarios

    @RERegression @Yuliana @DFNDRS-49 @smoke
    Scenario: Create a New Project
        Given an admin user is on login page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php"
        When an admin user logs in with valid credentials email "admin@mexil.it" and password "123456"
        And navigates to the Projects page
        And clicks on Add New Project button
        And enters title "The Residence of Arlington Heights"
        And enters street number "2143"
        And enters street name "Holly Ln"
        And enters suburb name "Arlington Heights"
        And clicks next button
        And click save button
        Then project is added and confirmation message is displaying "New Project has been added!"