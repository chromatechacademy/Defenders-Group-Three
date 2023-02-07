Feature: Agents Add and delete features
    @Agents @Regression
    Scenario Outline: Verify add agents and then delete the agents
        Given Login to admin site "https://chroma-tech-academy.mexil.it/chroma_real_estate/project_files/admin/login.php" is successful with "<user_email>" and "<user_pwd>"
        Then Add agent "<firstname>" "<lastname>" "<email>" "<phone>" "<pwd>"
        Then Verify added agent "<firstname>" "<lastname>" "<email>" "<phone>" "<pwd>"
        Then Delete added agent "<firstname>" "<lastname>" "<email>" "<phone>" "<pwd>"

        Examples:
            | user_email     | user_pwd | firstname  | lastname  | email             | phone      | pwd            |
            | admin@mexil.it | 123456   | firstname1 | lastname1 | email111@mexil.it | 1111111111 | fn1@123456@ln1 |
            | admin@mexil.it | 123456   | firstname2 | lastname2 | email222@mexil.it | 2222222222 | fn2@123456@ln2 |
            | admin@mexil.it | 123456   | firstname3 | lastname1 | email333@mexil.it | 2222222222 | fn3@123456@ln3 |

