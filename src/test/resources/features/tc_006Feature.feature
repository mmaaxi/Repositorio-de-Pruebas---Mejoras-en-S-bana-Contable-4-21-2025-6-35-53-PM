Feature: Validar Columna 'IVA 0%'

  Scenario: Verificar la exportación y columna 'IVA 0%' en el Excel
    Given El usuario está en la página de exportación de Excel
    When El usuario realiza la exportación del archivo Excel
    Then El Excel se descarga sin inconvenientes
    And La columna 'IVA 0%' aparece en el documento
    And La columna 'IVA 0%' contiene los montos aplicables correctamente