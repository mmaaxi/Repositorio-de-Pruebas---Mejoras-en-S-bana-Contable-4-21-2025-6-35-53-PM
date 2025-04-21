Feature: Validar Actualización de Fórmula en 'Monto Acumulado Folio OPC 2121'

  Scenario: Verificar actualización de fórmula después de exportar el Excel
    Given el documento Excel está listo para exportar con todas las modificaciones aplicadas
    When el usuario exporta el Excel completando todas las modificaciones
    Then el documento se genera exitosamente
    When el usuario revisa la celda que contiene la fórmula actualizada para 'Monto Acumulado Folio OPC 2121'
    Then la fórmula se actualiza adecuadamente y realiza la suma con los campos: Descuento, IVA descuento, ISR, Impuesto cedular, IVA acumulable y IVA retenido