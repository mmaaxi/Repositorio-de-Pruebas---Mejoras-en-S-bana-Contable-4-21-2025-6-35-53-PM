package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_007Page {
    WebDriver driver;

    By exportButton = By.id("exportExcelButton");
    By ivaExentoColumn = By.xpath("//th[contains(text(), 'IVA exento')]");
    By ivaRetenidoColumn = By.xpath("//th[contains(text(), 'IVA retenido')]");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportExcel() {
        driver.findElement(exportButton).click();
    }

    public boolean isExcelGeneratedWithUpdatedData() {
        // Implementar lógica para verificar que el Excel fue generado con datos actualizados.
        return true;
    }

    public boolean areColumnsDisplayedCorrectly() {
        // Implementar lógica para verificar que las columnas se muestran con la información correcta.
        return driver.findElement(ivaExentoColumn).isDisplayed() && driver.findElement(ivaRetenidoColumn).isDisplayed();
    }

    public boolean areColumnsPositionedAndFilledCorrectly() {
        // Implementar lógica para verificar que las columnas están posicionadas y llenas correctamente.
        return true;
    }
}