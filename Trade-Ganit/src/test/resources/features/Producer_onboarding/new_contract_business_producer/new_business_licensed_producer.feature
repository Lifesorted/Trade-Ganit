Feature: NPC- Manage Business Licensed Producer Information for On-boarding

@SmokeTest
  Scenario: Create New Business Licensed Producer with Direct contract type and state is Alabama
    Given AgencyAdmin is on Home page of DM application
    And attempts to create new Licensed Producer with details as
      | NPN | Type     | SubType     | Role           | ContractType | SaveFlag | EventTest |
      |     | Business | Corporation | General Agency | Direct       | Yes      | No        |
    * provides Agency Profile details as
      | Name         | Type              | EffectiveFrom | FEIN | LegalType   | ResidentState | LicenseNo | LicenseType        |
      | Majesco Ltd. | Doing Business As |               |      | Corporation | Alabama       | Default   | Insurance Producer |
    * provides Contact Info with Residence Address as
      | AddressType | Line1             | City       | State   | Zip   |
      | Business    | 801 Tom Martin Dr | Birmingham | Alabama | 35201 |
    * provides Contact Info with Business or Shipping Address as
      | AddressType | Line1             | City       | State   | Zip   |
      | Business    | 801 Tom Martin Dr | Birmingham | Alabama | 35201 |
    * provides Designated Responsible Licensed Producers details as
      | FirstName | LastName | NPN | Gender | ResidentState | LicenseNo | LicenseType        | Role        | PeriodFrom | PeriodTo |
      | Kevin     | Peterson |     | Male   | Alabama       |           | Insurance Producer | Proprietor  | 01/01/2020 |          |
    * provides 'Direct' contract type Agency Affiliation details as
      | MarketingChannel | EntityCode |CompanyCode| RoleLevel | CEDFlag |
      | Demo             |            |200        | Level 9   | Yes     |
    * provides Monitoring Relations details as
    * provides License details as
      | LOA      | IssueDate  | ExpiryDate |
      | Property | 01/01/2020 | 01/01/2040 |
    * provides Appointments details as
      | State   | AppointedCompany            | LOA  |
      | Alabama | Benchmark Insurance Company | Life |
    * provides Direct Deposit details as
      | FinancialInstitute | AccName     | AccNo         | AccType | RoutingNo | VendorCode |
      | HSBC               | Josh Taylor | 0123456789012 | Savings |           |            |
    * provides Errors and Omission Insurance details as
      | Carrier       | PolicyNo | EffectiveFrom | ExpiryDate | CoverageAmount | CascadeEOPolicy |
      | ACE Ltd Group |          | 12/10/2021    | 09/21/2024 | 50000.00       | Yes             |
    * provides ivans download information
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
    When AgencyAdmin verifies the producer application
    Then Licensed Producer should get created successfully
    And application status should be 'Approved'
    
@SmokeTest
  Scenario: Create New Business Licensed Producer with Intermediary contract type and state is Alabama
    Given AgencyAdmin is on Home page of DM application
    And attempts to create new Licensed Producer with details as
      | NPN | Type     | SubType     | Role           | ContractType | SaveFlag | EventTest |
      |     | Business | Corporation | General Agency | Intermediary | Yes      | No        |
    * provides Agency Profile details as
      | Name         | Type              | EffectiveFrom | FEIN | LegalType   | ResidentState | LicenseNo | LicenseType        |
      | Majesco Ltd. | Doing Business As |               |      | Corporation | Alabama       | Default   | Insurance Producer |
    * provides Contact Info with Residence Address as
      | AddressType | Line1             | City       | State   | Zip   |
      | Business    | 801 Tom Martin Dr | Birmingham | Alabama | 35201 |
    * provides Contact Info with Business or Shipping Address as
      | AddressType | Line1             | City       | State   | Zip   |
      | Business    | 801 Tom Martin Dr | Birmingham | Alabama | 35201 |
    * provides Designated Responsible Licensed Producers details as
      | FirstName | LastName | NPN | Gender | ResidentState | LicenseNo | LicenseType        | Role       | PeriodFrom | PeriodTo |
      | Kevin     | Peterson |     | Male   | Alabama       |           | Insurance Producer | Proprietor | 01/01/2020 |          |
    * provides 'Intermediary' contract type Agency Affiliation details as
      | MarketingChannel | EntityCode | CompanyCode | RoleLevel | CEDFlag |
      | Demo             |            | 200         | Level 8   | Yes     |
    * provides License details as
      | LOA      | IssueDate  | ExpiryDate |
      | Property | 01/01/2020 | 01/01/2040 |
    * provides Appointments details as
      | State   | AppointedCompany            | LOA  |
      | Alabama | Benchmark Insurance Company | Life |
    * provides Direct Deposit details as
      | FinancialInstitute | AccName     | AccNo         | AccType | RoutingNo | VendorCode |
      | HSBC               | Josh Taylor | 0123456789012 | Savings |           |            |
    * provides Errors and Omission Insurance details as
      | Carrier       | PolicyNo | EffectiveFrom | ExpiryDate | CoverageAmount | CascadeEOPolicy |
      | ACE Ltd Group |          | 12/10/2021    | 09/21/2024 | 50000.00       | Yes             |
    * provides ivans download information
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
    When AgencyAdmin verifies the producer application
    Then Licensed Producer should get created successfully
    And application status should be 'Approved'