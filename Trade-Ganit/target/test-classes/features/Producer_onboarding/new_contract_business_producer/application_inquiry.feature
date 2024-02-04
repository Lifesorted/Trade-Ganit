Feature: Verify application inquiry
   
@SmokeTest
  Scenario: validate pending application inquiry search result
    Given AgencyAdmin is on Home page of DM application
    And navigate to application inquiry screen
    When search application via application no
    Then application status should be 'Pending'