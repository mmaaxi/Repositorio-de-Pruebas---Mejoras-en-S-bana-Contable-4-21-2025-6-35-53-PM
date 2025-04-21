package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_004Page {
    WebDriver driver;

    By exportButton = By.id("exportButton");
    // Define los selectores de elementos necesarios

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarAlModuloDeExportacion() {
        // Lógica para navegar al módulo de exportación
    }

    public void ejecutarExportacion() {
        driver.findElement(exportButton).click();
        // Lógica para ejecutar la exportación
    }

    public void validarDescargaSinErrores() {
        // Lógica para validar que el archivo Excel se descargó sin errores
    }

    public void abrirArchivoExcel() {
        // Lógica para abrir y leer el archivo Excel
    }

    public void verificarColumnaMontoAcumulado() {
        // Lógica para verificar la existencia de la columna
    }

    public void validarPosicionColumna() {
        // Lógica para validar la posición de la columna
    }

    public void validarSumaAcumulada() {
        // Lógica para validar que el valor es correcto
    }
}