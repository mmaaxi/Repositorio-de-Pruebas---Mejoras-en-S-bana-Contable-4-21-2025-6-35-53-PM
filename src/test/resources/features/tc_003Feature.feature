Feature: Validar Actualización de Campos en Columna 'estado'

  Scenario: Validar la exportación y actualización de la columna 'estado'
    Given El usuario accede a la página de exportación
    When El usuario realiza la exportación del Excel
    Then El documento debe descargarse sin inconvenientes
    And Verificar que la columna 'estado' se actualice con los datos correctos
    Then Los datos de la columna deben haberse actualizado correctamente