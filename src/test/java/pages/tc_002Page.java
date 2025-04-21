package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {

    WebDriver driver;

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarAPaginaPrincipal() {
        driver.get("URL_DE_LA_PAGINA_PRINCIPAL");
    }

    public void exportarDocumentoExcel() {
        WebElement exportButton = driver.findElement(By.id("botonExportar"));
        exportButton.click();
    }

    public boolean verificarExportacion() {
        // Lógica para verificar si el Excel se exportó correctamente
        return true; // Retornar verificación real
    }

    public boolean verificarColumnaEstadoCodigo() {
        // Lógica para abrir el Excel con alguna librería y verificar la columna
        return true; // Retornar verificación real
    }

    public boolean verificarDatosColumnaEstadoCodigo() {
        // Lógica para verificar que los datos de la columna no son erróneos
        return true; // Retornar verificación real
    }
}