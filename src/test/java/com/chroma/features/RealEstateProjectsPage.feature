Feature: Projects Page Elements

    @REProgression @CHRIS @USID-48
    Scenario: Verify Projects Page Elements
        And admin clicks the projects dropdown on dashboard page "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/index.php"
        Then the following elements should be displayed "Add New Project", "Projects", "Active", "Archived"