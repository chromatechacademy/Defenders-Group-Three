@tag
Feature: Valid Credentials Login Test

  @Login @Yuliana
  Scenario: Valid Credentials Login
    Given a Chroma Tech Academy teacher or admin is on login page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When user logs in with valid credentials username "general@teacher.com" and password "123456"
    Then user is on dashboard page "https://mexil.it/chroma_tech_academy/dev/admin/admin/dashboard"
    


