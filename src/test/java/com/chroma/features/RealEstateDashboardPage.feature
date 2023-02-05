Feature: Dashboard Page Elements

    @RERegression @CHRIS @USID-42
    Scenario: Verify Dashboard Page Elements
        And admin clicks the homework dropdown on dashboard page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/index.php"
        Then the following elements should be displayed "Dashboard", "Hello, Admin", "Overview", "Agents Graph", "Properties Overview", "Properties", 
        "Agents", "Dashboard", "Projects"
