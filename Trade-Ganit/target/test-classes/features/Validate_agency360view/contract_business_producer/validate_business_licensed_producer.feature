Feature: Validate Business Licensed Producer Information On agency360 view

@SmokeTest
  Scenario: Validate Business Licensed Direct Producer data on agency360 view for Alabama state
    Given AgencyAdmin is on Home page of DM application
    And attempts to search Licensed Producer with details as
      | EntityCode | EntityValue |EntityType| State   |
      | NPN        |             |LBD       | Alabama |
    * Navigates to Profile tab at master level and verify details
    * Navigates to Contact tab at master level and verify contact details
    * Navigates to License tab at master level and verify license details
    * Navigates to Bank Account tab at master level and verify Bank details
    * Navigates to E&O tab at master level and verify policy details
    * Navigates to agent appointment tab at contract level and verify appointment details
    * Navigates to agent hierarchy tab at contract level and verify details
    * Navigates to ivansdownload tab at contract level and verify details
    * Navigates to book of business tab at contract level and verify details
    When AgencyAdmin verifies the producer details at master level
    Then verification status should be 'Verified'
        
@SmokeTest
  Scenario: Validate Business Licensed Intermediary Producer data on agency360 view for Alabama state
    Given AgencyAdmin is on Home page of DM application
    And attempts to search Licensed Producer with details as
      | EntityCode | EntityValue |EntityType| State   |
      | NPN        |             |LBI       | Alabama |
    * Navigates to Profile tab at master level and verify details
    * Navigates to Contact tab at master level and verify contact details
    * Navigates to License tab at master level and verify license details
    * Navigates to Bank Account tab at master level and verify Bank details
    * Navigates to E&O tab at master level and verify policy details
    * Navigates to agent appointment tab at contract level and verify appointment details
    * Navigates to agent hierarchy tab at contract level and verify details
    * Navigates to ivansdownload tab at contract level and verify details
    * Navigates to book of business tab at contract level and verify details
    When AgencyAdmin verifies the producer details at master level
    Then verification status should be 'Verified'