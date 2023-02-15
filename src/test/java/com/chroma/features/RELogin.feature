Feature: Real Estate Page Login Test Scenarios

 @RERegression @Angelica @DFNDRS-41 @smoke
  Scenario Outline: Real Estate Login Test
    Given an admin or student user is on login page "<URL>"
    When admin or student user logs in with valid credentials email "<EMAIL>" and password "<PASSWORD>"
    Then admin or student user should be on dashboard page "<DASHBOARD URL>"

    Examples: 
      | URL                                                                                   | EMAIL                 | PASSWORD | DASHBOARD URL                                                                         |
      | https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php | admin@mexil.it        |   123456 | https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/index.php |
      | https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/login.php       | chroma@chromatech.com |   123456 | https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/index.php       |
