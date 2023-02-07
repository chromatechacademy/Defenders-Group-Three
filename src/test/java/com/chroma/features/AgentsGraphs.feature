Feature: Agents Graphs feature

    @Agents @Regression
    Scenario: Verify graph header text
        Given Login to admin site "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php" is successful with "admin@mexil.it" and "123456"
        When Go to Agents Graph
        Then Header text is "Reserved by Agents"
        When Go to Overview Graph
        Then Header text is "Properties Overview"
