Feature: Validate 'Status Pago Código' Column and Rename 'Descripción Status Pago'

  Scenario: Validate and rename columns in downloaded Excel sheet
    Given I have accessed the module to download the updated Excel
    When I download the Excel file
    Then the document should be generated successfully with all modifications
    And I should see the 'Status Pago Código' column to the right of 'Fecha de Pago'
    And the 'Status de Pago' column should be renamed to 'Descripción Status Pago'
    And there should be no data integrity issues in the document