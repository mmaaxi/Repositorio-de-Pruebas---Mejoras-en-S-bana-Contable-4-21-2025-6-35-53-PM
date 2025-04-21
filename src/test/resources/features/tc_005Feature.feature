Feature: Validar Cambio de Nombre de Columna 'Monto Acumulado Folio OPC'

  Scenario: Exportar Excel y validar nombre de columna actualizado
    Given the user is on the data export page
    When the user exports the Excel with updated data
    Then the file should be generated successfully
    And the column 'Monto Acumulado Folio OPC' should be renamed to 'Monto Acumulado Folio OPC (2121)'
    And the existing data should remain unchanged