Feature: Producer amendment from producer management

@SmokeTest
  Scenario: Add license via producer amendment from producer management
    Given AgencyAdmin is on Home page of DM application
    And attempts to search existing producer and continue
    * Add license info to an existing producer
     | LicenseNo | State   | Type               | Resident    | LOA      | IssueDate  | ExpiryDate |
     |           | Alabama | Insurance Producer | Yes         | Property | 01/01/2020 | 01/01/2040 |
    When AgencyAdmin verifies the producer application
    Then Add License via amendment should get created successfully
    And application status should be 'Approved'