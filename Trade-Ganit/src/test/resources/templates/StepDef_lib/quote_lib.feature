Feature: Contains all type of steps which are already implemented in Repository

  Background: Create quote from CCIS system
    Given UW has ability to create quote via CCIS integration
    When UW creates quote in PAS system
    Then quote should get created in the PAS system

#-----------------------------------------------------------------------------------------------------------------------

  Scenario: API steps

    #Givens steps
    Given UW has ability to create quote for LOB CA
    Given UW has ability to create quote via CCIS integration
    Given UW can create quote via CCIS integration
    Given UW has a quote created
    And with Liability Limit {int}
    And with Form Language '<FormLanguage>'
    And with Risk Class '<RiskClass>'
    And with default vehicle group
    And with default vehicle coverage
    And Apply Reinsurance is checked
    And with Reinsurance Details having '<ReinsuranceCompany>', '<ReinsuranceInsuranceCode>', '<ReinsuranceInsurancePreference>', '<Type>', '<Percentage>', '<Limit>', '<Excess>', '<OverrideCommission>', '<Gross>', '<EffectiveDate>', '<Section>'
    And with Apply Commission Reduction is checked
    And with New Commission '<NewCommission>'
    And with first Additional Interest as 'Premium Finance Company'
    And with Group Information for first Additional Interest as
      | Group | Vehicles | Description       |
      | 1     | 5        | group description |
    And with Group Information for first Premium Finance Company as
      | PremiumFinancingCompanyAccNo | Code |
      | 1234567890                   | 123  |
    And with below Address for first Additional Interest as
      | Country | Street              | City       | State        | ZipCode |
      | Canada  | 92 Battleford Cross | Battleford | Saskatchewan | S0M 0E0 |


    #Whens steps
    When UW calculates premium for CA quote
    When UW creates quote in PAS system
    When UW updates CA quote


    #Thens Steps
    Then quote should get created in the PAS system
    Then quote should get updated successfully
    Then premium should get generated successfully
    Then premium should not be generated
    And Risk Class '<RiskClass>' should be populated
    And Net amount should be calculated as Gross minus Gross X Override Commission rounded to 2
    Then Commission Reduction Percent should be calculated as difference between Commission Default and New Commission
    Then Premium adjustment factor should be calculated as per defined formula
    Then quote should have the status '<quoteStatus>'
    And system should display the error message as 'Commission cannot be greater than default commission'
    And Below Forms should be attached with the description


#-----------------------------------------------------------------------------------------------------------------------

  Scenario Outline: UI Steps

    #Given steps
    Given UW is on home page of PAS
    Given UW can create CA quote from PAS
    Given searches for Quote created via CCIS from search tile
    Given UW select language {string} and prefix {string}
    Given navigates to producer screen
    Given navigates to Commercial Auto screen
    Given navigates to Vehicle Group screen
    Given UW create Vehicle Group with Group Number '1'
    Given navigates to Endorsement Forms screen
    Given navigates to Additional Interest screen
    Given creates Vehicle Group with details '<GroupNumber>', '<GroupName>', '<GroupDescription>', '<VehicleType>', '<Province>', '<Territory>', '<ClassCode>', '<TrailerType>', '<TotalUnits>'
    Given performs Redo transaction on quote
    Given click on All Groups radio button
    Given checks {string}
    Given Override Premium Rate Amount as {string}
    


    #When Steps
    When UW navigates to Next screen
    When UW click on Unified Search Dropdown
    When UW selects '<SearchBy>' from dropdown and provides '<ThreeCharacters>' as a keyword for quick search
    When Dropdown should have following values
    When Selects Entity Type
    When UW selects producer code '<ProducerCode>'
    When UW navigates to Next screen
    When checkbox Apply Commission Reduction is checked
    When UW enters New Commission value {string}
    When UW enters quote info data {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}
    When UW enters data for Client Code {string}, Submission Id {string}, CCISStatus Id {string}, Revision Number {string}, Member Since {string}
    When UW click on any date field on Quote info
    When UW open lookup for Form Language field
    When UW changes the Binding Date {string} That is not between {string} and {string}
    When UW fill Quote screen form
    When UW navigates to next screen with errors
    When UW navigates to Next screen without selecting any coverage from vehicle group screen
    When UW click Yes button on Confirm Box
    When UW enters underwriter info {string}, {string}, {string}, {string}, {string}
    When UW enter the email {string}
    When UW enter the phone no as {string}
    When UW selects producer code {string}
    When UW checks the Fleet checkbox
    When unchecks 21B/D checkbox
    When Group Number field is empty
    When UW add second Vehicle Group with Group Number '1'
    When UW select Vehicle Type '<VehicleType>'
    When below input fields with {word} lookup
    When UW enters Province as {string}
    When UW click on {string} lookup
    When UW enters Liability Limit {string} on Commercial Auto screen
    When navigates to Vehicle Group screen with selected {string} limit
    When {word} clicks on {string} lookup
    When {word} select Form Number {string}
    When UW selects Interest Type 'Additional Named Insured'
    When UW enters '<Name>' in Name field on Additional Interest screen
    When clicks on calculate premium and redirect to Premium Summary Page


    #Then Steps
    Then Search widget should be present on top of screen
    Then Entity Type dropdown should have following values
    Then Search widget should be present on top center of screen
    Then selected entity type from dropdown should be displayed in same field
    Then all matching Quote or Policy records with '<ThreeCharacters>' as links should be displayed on search result page
    Then all matching Insured records with '<ThreeCharacters>' as links should be displayed on search result page
    Then producer details should be populated having '<ProducerCode>', '<Name>', '<Street>', '<City>', '<Province>', '<PostalCode>', '<Salutations>', '<Title>', '<ContactName>', '<Email>', '<Phone>', '<Fax>'
    Then the Quote Number should be {int} digits system generated number
    Then Renewal counter should be set to {string}
    Then the quote number should be visible in the format {string}
    Then System generated {int} digits Quote number should be display in the Quote Number field
    Then commission default value is {string}
    Then New commission field should not be displayed
    Then New Commission field should be displayed on the screen and by default value should be null
    Then Premium Adjustment Factor field should be displayed on the screen and by default it should be disabled
    Then the field {string} should be editable
    Then Program field should be visible at quote info section
    Then Program field should be blank by default
    Then quote info data should display in respective fields
    Then alphabet special characters should not accepted
    Then calendar window should popup
    Then should be able to select date from calender
    Then selected date should be displayed in field
    Then Language options should be displayed as
    Then the error message should be displayed {string}
    Then Quote number should be generated and should be visible on top left corner at all times
    Then default values for language and quote prefix fields should be displayed as
    Then producer details should be populated having {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}
    Then Underwriter data should display in respective fields
    Then Underwriter Email field should display error message
    Then Underwriter work telephone should be in below format
    Then Underwriter Work Telephone field should display error message
    Then by default Non-Fleet option should be applicable
    Then 21B/D and RateType fields should be displayed
    Then by default checkbox 21B/D should be checked
    Then Rate Type field should populates options as
    Then Rate Type field should not be displayed
    Then system should throw an error message as {string}
    Then system should throw an error message for Their Interests checkbox as "Please enter a vehicle or check the 'As Their Interests May Appear' checkbox"
    Then error message should be pop up {string}
    Then on Vehicle group screen displayed fields should be
    Then {string} lookup table should have following values
    Then {string} lookup table should have following values
    Then In {string} coverage Limit should be displayed {string}
    Then only {string}  should be present in Province field lookup table
    Then on Endorsement Forms screen displayed fields should be
    Then 'Additional Named Insured' should be displayed in Interest Type field
    Then Name field should accept alpha-numeric characters as '<Name>'
    Then RIN/CVOR field should be mandatory
    Then RIN/CVOR field should not be mandatory
    Then RIN/CVOR field should not be displayed
    Then Vehicle Information section should be appeared on Additional Interest Screen
    Then system should throw an error message for Coverages as 'For Vehicle Group 1 atleast one coverage should be selected.'
    Then Choose Next Action should have the following transactions on quote dashboard
    Then Premium Summary Screen Endorsement section should be display as


    Examples:
      | Program | MarketSegment        |
      | CannGen | Marijuana Operations |
