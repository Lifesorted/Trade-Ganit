Feature: Create new Ofice Node under specific hierarchy

@SmokeTest
  Scenario: Create new Office Node under specific hierarchy
    Given AgencyAdmin is on Home page of DM application
    And attempts to create new office node under specific hierarchy with details as
      | Hierarchy   | ParentType | NodeType | OfficeId | OfficeName | Role           | BusinessArea          |
      | Hierarchy 5 | Office     | Office   |          |            | General Agency | Worker's Compensation |
    When AgencyAdmin verifies the added node in hierarchy
    Then added node in hierarchy should be visible
    
@SmokeTest
  Scenario: Create new Staff Node under office in specific hierarchy
    Given AgencyAdmin is on Home page of DM application
    And attempts to create new office node under specific hierarchy with details as
      | Hierarchy   | ParentType | NodeType | OfficeId | OfficeName | Role            | BusinessArea          |
      | Hierarchy 5 | Office     | Staff    |          |            | Agency Director | Worker's Compensation |
    When AgencyAdmin verifies the added node in hierarchy
    Then added node in hierarchy should be visible