Feature: Verify agency operation like transfer, terminate and level change

@SmokeTest
  Scenario: Validate Business Licensed Producer transfer
    Given AgencyAdmin is on Home page of DM application
    And attempts to search Licensed Producer with details as
      | EntityCode  | EntityValue | EntityType | State   |
      | Entity Code |             | LBDT       | Alabama |
    * Navigates to Profile tab at master level and select mentioned option
      | Action   |
      | Transfer |
    When AgencyAdmin verifies the producer details at master level
    Then verification status should be 'Verified'
    
@SmokeTest
  Scenario: Validate Business Licensed Producer level change
    Given AgencyAdmin is on Home page of DM application
    And attempts to search Licensed Producer with details as
      | EntityCode  | EntityValue | EntityType | State   |
      | Entity Code |             | LBDLC      | Alabama |
    * Navigates to Profile tab at master level and select mentioned option
      | Action       |
      | Level Change |
    When AgencyAdmin verifies the producer details at master level
    Then verification status should be 'Verified'
    
@SmokeTest
  Scenario: Validate Business Licensed Producer terminate
    Given AgencyAdmin is on Home page of DM application
    And attempts to search Licensed Producer with details as
      | EntityCode  | EntityValue | EntityType | State   |
      | Entity Code |             | LBDTC      | Alabama |
    * Navigates to Profile tab at master level and select mentioned option
      | Action             |
      | Terminate Contract |
    When AgencyAdmin verifies the producer details at master level
    Then verification status should be 'Verified'