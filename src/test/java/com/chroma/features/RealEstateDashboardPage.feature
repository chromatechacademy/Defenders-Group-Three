Feature: Dashboard Page Elements

    @RERegression @CHRIS @USID-42
    Scenario Outline: Verify Dashboard Page Elements
        Given an admin or student user is on login page "<URL>"
        When admin or student user logs in with valid credentials email "<EMAIL>" and password "<PASSWORD>"
        Then admin or student user should be on dashboard page "<DASHBOARD URL>"
        Then the following elements should be displayed "Dashboard", "Hello, Admin", "Overview", "Agents Graph", "Properties Overview", "Properties", "Agents", "Dashboard", "Projects"

        Examples:
            | URL                                                                                   | EMAIL          | PASSWORD | DASHBOARD URL                                                                         |
            | https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php | admin@mexil.it | 123456   | https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/index.php |
