@tag
Feature: Student Information Module

@studentinformation
Scenario: Inspection Of Student Information Module Links
Given a user is on the login page "https://mexil.it/chroma_tech_academy/test/site/login"
When user logs in with valid credentials username "general@teacher.com" and password "123456"
And user clicks the student information dropdown on dashboard page "https://mexil.it/chroma_tech_academy/test/admin/admin/dashboard"
Then The following modules should be displayed "Student Details", "Student Admission", "Disabled Students", "Bulk Delete", "Student Catagories", "Student House", "Disable Reason"

