Feature: Validar Columna 'Monto acumulado Folio Reserva 5401'

  Scenario: Validar exportación y columna en Excel
    Given el usuario navega al módulo de exportación
    When el usuario ejecuta la exportación
    Then el usuario descarga el archivo Excel sin errores

    Given el usuario abre el archivo Excel
    When el usuario verifica la existencia de la columna 'Monto acumulado Folio Reserva 5401'
    Then la columna aparece a la derecha de 'Monto (reserva)'
    And el valor es igual a la suma del acumulado anterior y el monto de reserva actual