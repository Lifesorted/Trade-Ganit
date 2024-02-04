Feature: ADC- Create new Additional Contract for Business Licensed Producer

@SmokeTest
  Scenario: Create additional contract for Business  Licensed Producer with Direct contract type and state is Alabama
    Given AgencyAdmin is on Home page of DM application
    And attempts to create new additional contract for Licensed Producer with details as
      | NPN | SubType     | Role           | ContractType | SaveFlag | EventTest |
      |     | Corporation | General Agency | Direct       | Yes      | NoD       |
    * provides 'Direct' contract type Agency Affiliation details as
      | MarketingChannel | EntityCode | CompanyCode | RoleLevel | CEDFlag |
      | Demo             |            | 200         | Level 5   | Yes     |
    * provides ivan download information
      | YCode | AgencyMailbox | PrimaryContact | PrimaryEmail     |
      | YC721 | AG123         | 6723908412     | testd1@gmail.com |
    * provides book of business information
      | LineOfBusiness | MGAInsurer | Admitted | TotalInforcePremium | IndustrySegment | Commission | ContingencyProgram |
      |                | Allied     | Surplus  | 245                 | Retail          | 14         | Yes                |
    * provides Compensation Preferences details as
      | AccrualPreference | AccrualBasis | RatesApplicability | CompRetained | PayTo | Mode  | Schedule |Compschedule|
      | Custom            | Paid         | Custom Schedule    | No           | Self  | Check | Monthly  |            |
    * provides Communication Preferences details as
      | Category     | Event |
      | Compensation | Check |
    When AgencyAdmin verifies the additional contract for producer application
    Then Additional Contract for Licensed Producer should get created successfully
    And contract entity status should be 'Approved'
    
@SmokeTest
  Scenario: ADC- Create additional contract for Business  Licensed Producer with Intermediary contract type and state is Alabama
    Given AgencyAdmin is on Home page of DM application
    And attempts to create new additional contract for Licensed Producer with details as
      | NPN | SubType     | Role           | ContractType | SaveFlag | EventTest |
      |     | Corporation | General Agency | Intermediary | Yes      | NoI       |
    * provides 'Intermediary' contract type for Agency Affiliation details as
      | MarketingChannel | EntityCode | CompanyCode | RoleLevel | CEDFlag |
      | Demo             | FC000396   | 200         | Level 6   | Yes     |
    * provides ivan download information
      | YCode | AgencyMailbox | PrimaryContact | PrimaryEmail     |
      | YC721 | AG123         | 6723908412     | testd1@gmail.com |
    * provides book of business information
      | LineOfBusiness | MGAInsurer | Admitted | TotalInforcePremium | IndustrySegment | Commission | ContingencyProgram |
      |                | Allied     | Surplus  | 245                 | Retail          | 14         | Yes                |
    * provides Compensation Preferences details as
      | AccrualPreference | AccrualBasis | RatesApplicability | CompRetained | PayTo | Mode  | Schedule | Compschedule |
      | Custom            | Paid         | Custom Schedule    |              | Self  | Check | Monthly  |              |
     * provides Communication Preferences details as
      | Category     | Event |
      | Compensation | Check |
    When AgencyAdmin verifies the additional contract for producer application
    Then Additional Contract for Licensed Producer should get created successfully
    And contract entity status should be 'Approved'