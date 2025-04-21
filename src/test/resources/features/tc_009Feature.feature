Feature: Validar Creación de Columnas 'Folio Pre solicitud' y 'Folio de Pago'
  Para garantizar que las columnas 'Folio Pre solicitud' y 'Folio de Pago' están presentes en el reporte de Excel,
  como usuario,
  quiero verificar su presencia y posición correctas después de exportar el archivo.

  Scenario: Verificar exportación de Excel y presencia de columnas específicas
    Given que el usuario está en la página de exportación
    When el usuario ejecuta la exportación del Excel
    Then el Excel se genera sin errores
    And las columnas 'Folio Pre solicitud' y 'Folio de Pago' aparecen en las posiciones correctas