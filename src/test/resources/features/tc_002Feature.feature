Feature: Validar Columna 'Estado Código'

  Scenario: Exportar Excel y verificar la existencia de la columna 'Estado Código'
    Given el usuario está en la página principal
    When el usuario exporta el documento Excel según flujo principal
    Then el Excel se exporta correctamente
    And verifica la existencia de la columna 'Estado Código' a la derecha de la columna I
    And la columna 'Estado Código' está en la posición correcta sin datos erróneos