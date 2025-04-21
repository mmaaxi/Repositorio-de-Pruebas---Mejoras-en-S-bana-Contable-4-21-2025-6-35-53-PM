package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class tc_006Page {
    WebDriver driver;

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToExportPage() {
        driver.get("http://url-de-exportacion");
    }

    public void exportExcelFile() {
        driver.findElement(By.id("exportExcelButton")).click();
    }

    public boolean isExcelDownloaded() {
        File dir = new File(System.getProperty("user.dir") + "/downloads");
        File[] dirContents = dir.listFiles();

        for (File file : dirContents) {
            if (file.getName().equals("exportedFile.xlsx")) {
                return true;
            }
        }
        return false;
    }

    public boolean isColumnIVA0Present() {
        // Lógica para verificar si la columna 'IVA 0%' está presente en el documento Excel
        return true; // Placeholder para implementación real
    }

    public boolean isColumnIVA0Correct() {
        // Lógica para verificar si los montos en 'IVA 0%' en el documento son correctos
        return true; // Placeholder para implementación real
    }
}