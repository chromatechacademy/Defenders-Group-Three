Feature: Verify add, search and expense head feature

    @expense @Categories @Bilbo @DCG3 @Regression
    Scenario: Ability to add expense
        Given a user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
        When a user logins with valid credentials username "general@teacher.com" and password "123456"
        Then the user lands on the home page "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
        And the user clicks on Expense module
        And user selects Add Expense
        Then user is directed to the expense category page "Add Expense"
        When user selects expense head "ground"
        And user enters name "Test Expense Name"
        And user enters amount 1000
        Then Click save and confirmation message displays "Record Saved Successfully"

    @expense @Regression
    Scenario: Ability to search expense
        Given a user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
        When a user logins with valid credentials username "general@teacher.com" and password "123456"
        Then the user lands on the home page "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
        And the user clicks on Expense module
        And user selects Search Expense
        Then user is directed to Category page "https://mexil.it/chroma_tech_academy/dev/admin/expense/expensesearch"
        When user selects Search Type "Today"
        And user enters search "Test Expense Name"
        And user clicks search button
        Then Search result displays "Test Expense Name"

    @expense @Regression
    Scenario: Ability to add expense head
        Given a user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
        When a user logins with valid credentials username "general@teacher.com" and password "123456"
        Then the user lands on the home page "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
        And the user clicks on Expense module
        And user selects Expense head
        Then user is directed to Category page "https://mexil.it/chroma_tech_academy/dev/admin/expensehead#"
        When user selects "New Expense Head"
        And user clicks save button
        Then Message displays "Record Saved Successfully"
