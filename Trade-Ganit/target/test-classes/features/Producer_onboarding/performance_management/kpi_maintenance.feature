Feature: Kpi maintenance in performace management

@SmokeTest
  Scenario: Create New kpi in kpi maintenance
    Given AgencyAdmin is on Home page of DM application
    And attempts to add new kpi for production policy count with details as
      | LOBClass              | Code | Name | EvaluationType | Category | Basis      | SubBasis | ProductionBasedOn | KpiValueType | EffectiveFrom |
      | Property And Casualty |      |      | Internal       | Growth   | Production | Policy   | Issue Date        | Numeric      |               |   
    When AgencyAdmin verifies the added kpi in performance management
    Then added kpi in performace management should be visible
    
@SmokeTest
  Scenario: Search the schedule in schedule maintenance and verify
    Given AgencyAdmin is on Home page of DM application
    And attempts to search kpi by kpi Name
    When agencyadmin verifies the searched kpi in kpi maintenance
    Then kpi in kpi maintenance should be visible