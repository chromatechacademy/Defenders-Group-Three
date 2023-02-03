@tag
Feature: Student Information Module

@studentinformation
Scenario: Inspection Of Student Information Module Links
Given a user is on the login page "https://mexil.it/chroma_tech_academy/dev/site/login"
When user logs in with valid credentials username "general@teacher.com" and password "123456"
And user clicks the student information dropdown on dashboard page "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
Then The following modules should be displayed "Student Details", "Student Admission", "Disabled Students", "Bulk Delete", "Student Categories", "Student House", "Disable Reason"
