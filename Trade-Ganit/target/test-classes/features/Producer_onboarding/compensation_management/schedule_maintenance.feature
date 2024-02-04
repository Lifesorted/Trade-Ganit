Feature: Schedule maintenance in compensation management

@SmokeTest
  Scenario: Create New schedule in schedule maintenance
    Given AgencyAdmin is on Home page of DM application
    And attempts to add new schedule with details as
      | LOBClass              | Code | Name | EffectiveFrom | Type       | SubType             | AccrualBasis | BillType     |
      | Property And Casualty |      |      |               | Commission | Standard Commission | Paid         | Account Bill | 
    When AgencyAdmin verifies the added schedule in compensation management
    Then added schedule in compensation management should be visible
    
@SmokeTest
  Scenario: Search the schedule in schedule maintenance and verify
    Given AgencyAdmin is on Home page of DM application
    And attempts to search schedule by schedule Name
    When agencyadmin verifies the searched schedule in schedule maintenance
    Then schedule in schedule maintenance should be visible