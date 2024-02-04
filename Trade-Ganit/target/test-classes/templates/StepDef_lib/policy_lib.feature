Feature: Contains all type of steps which are already implemented in Repository

  Scenario: API steps

    #Create steps
    And with program as
      | program   |
      | <program> |
    #Do not add step with a blank EffectiveDate
    And with Effective date as
      | EffectiveDate   |
      | <EffectiveDate> |
    And with Primary State '<RiskState>'
    And with Risk State '<RiskState>'

    #Update Steps
    And with insured address and location details
      | StreetAddress   | Line2 | City   | State   | Zip   | Country   |
      | <streetAddress> |       | <city> | <state> | <zip> | <country> |
    #Delete Steps

    #verify Steps
    Then Below Forms should be attached with the description
      | FormName   | FormDescription   |
      | <FormName> | <FormDescription> |

  Scenario: UI Steps

    #Create steps

    #Update Steps

    #Delete Steps

    #verify Steps