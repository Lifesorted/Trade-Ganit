Feature: Manage login and logout session for admin

@SmokeTest
  Scenario: Validate admin login and logout from application
    Given TradeAdmin is on Home page of application and login
    When TradeAdmin clicks on logout option
    Then TradeAdmin should logout from application and navigate to login screen