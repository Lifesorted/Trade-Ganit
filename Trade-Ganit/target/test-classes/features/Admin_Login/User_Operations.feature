Feature: Manage users operation for various actions

@SmokeTest
  Scenario: Validate add superadmin user and verify
   Given TradeAdmin is on Home page of application and login
   And Navigate to respective screen
   When attempts to add new user with details as
   | UserType    | FirstName   | LastName   | EmailId | PhoneNumber | UserName | Password |
   | SUPER ADMIN | SAFirstName | SALastName |         |             |          | Asdf2345 |
   Then Verify Added user on list screen
   
@SmokeTest
  Scenario: Validate add accounts for a user
   Given TradeAdmin is on Home page of application and login
   And Navigate to account screen
   When attempts to add new account with details as
   | UserName | Category | AccountType | Name  | UCC    | BrokerCode | Address | PanNumber  | PortfolioSize |
   | Yogish   | NRI      | SIMULATED   | Admin | UC7634 | DOLAT      |         | CIYPK4284R | 10            |
   Then Verify Added account on list screen
   
   	