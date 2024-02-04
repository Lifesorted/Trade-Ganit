Feature: Manage users operation for various actions

@SmokeTest
  Scenario: Validate add superadmin user and verify
   Given TradeAdmin is on Home page of application and login
   And Navigate to respective screen
   When attempts to add new user with details as
   | UserType    | FirstName   | LastName   | EmailId | PhoneNumber | UserName | Password |
   | SUPER ADMIN | SAFirstName | SALastName |         |             |          | Asdf2345 |
   Then Verify Added user on list screen
   
   