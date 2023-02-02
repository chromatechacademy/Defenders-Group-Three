@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @studentinformation
Scenario: Inspection Of Student Information Module Links
Given a user is on the login page "https://mexil.it/chroma_tech_academy/test/site/login"
When user logs in with valid credentials username "general@teacher.com" and password "123456"
And user clicks the student information dropdown 
Then The following modules should be displayed "Student Details", "Student Admission", "Disabled Students", "Bulk Delete", "Student Catagories", "Student House", "Disable Reason"

