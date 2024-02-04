Feature: ASCA- Create new Additional State Appointment for Business Licensed Producer

@SmokeTest
  Scenario: Create new additional state appointment for Business Licensed Producer and state is Alabama
    Given AgencyAdmin is on Home page of DM application
    And attempts to create new additional state appointment for Licensed Producer with details as
      | NPN |
      |     |
    * select contract details as
    * provides ASA License details as
    * provides ASA Appointments details as
    When AgencyAdmin verifies the Additional State Appointment for producer application
    Then Additional State Appointment for Licensed Producer should get created successfully
    And State Appointment Application status should be 'Approved'