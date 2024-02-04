Feature: Policy Interface

@SmokeTest1
  Scenario: Verify for form attached when InState condition is met for states TX
    Given underwriter has ability to create policy for LOB Workers Compensation
    And with insured address and location details for 'Texas' state
    And with Primary State 'Texas'
    And with Risk State 'Texas'
    When underwriter creates WK policy
  # And underwriter perform approval transaction on WK Quote
  # And quote should have the status 'Forms Management - User input required'
  # Then Below Forms should be attached with the description for WK policy
  #   | FormName        | FormDescription              |
  #   | WC420301L 07-23 | Texas Amendatory Endorsement |

@SmokeTest1
  Scenario: Verify policy file batch run to generate feed file
    Given underwriter is on home page of PAS
    And Run nightly commission batch to generate file
    When Batch run successfully
    Then Feed file should be generated

@SmokeTest1
  Scenario: Verify policy interface batch run to consume generated policy
    Given AgencyAdmin is on Home page of DM application
    And Navigate to job scheduler and run policy interface batch
      | BatchType |
      | Policy    |
    When Batch run successfully
    Then Consumed policy should be generated

@SmokeTest1
  Scenario: Verify consumed policy from policy inquiry
    Given AgencyAdmin is on Home page of DM application
    And Navigate to policy summary and verify