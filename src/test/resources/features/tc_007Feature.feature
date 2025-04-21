Feature: Validar Columnas 'IVA exento' e 'IVA retenido'
  Como usuario del sistema
  Quiero validar que las columnas 'IVA exento' e 'IVA retenido' se muestren correctamente
  Para asegurar que el archivo Excel contiene los datos precisos

  Scenario: Exportar y validar columnas 'IVA exento' e 'IVA retenido' en el Excel
    Given el usuario se encuentra en el módulo de exportación
    When el usuario exporta el archivo Excel del módulo
    Then el Excel se genera con los datos actualizados
    And las columnas 'IVA exento' e 'IVA retenido' aparecen con la información correcta
    And ambas columnas se mostraron correctamente a la derecha con los montos correspondientes