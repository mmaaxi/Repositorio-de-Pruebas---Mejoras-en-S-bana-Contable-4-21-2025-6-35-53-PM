Feature: Validate Excel Export and Concatenated Key

  Scenario: Validate Exporting Excel and Concatenated Key
    Given I am on the Canned Reports module in Claim Accounting Report
    When I select 'Submit' and then 'View Log'
    And I click on 'Agregar Folio' and 'Download Excel file'
    Then the system downloads an Excel file
    And I verify that column C contains the concatenated key formula