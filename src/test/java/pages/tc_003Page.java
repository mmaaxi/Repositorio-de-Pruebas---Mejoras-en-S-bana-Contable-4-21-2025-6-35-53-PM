package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class tc_003Page {
    WebDriver driver;

    // Locators
    By exportButton = By.id("exportExcelButton");
    // More locators can be added as necessary

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToExportPage() {
        driver.get("https://example.com/export");
    }

    public void exportExcel() {
        driver.findElement(exportButton).click();
    }

    public boolean isDownloadSuccessful() {
        // Dummy implementation for checking file download
        try {
            return Files.exists(Paths.get(System.getProperty("user.home") + "/Downloads/exported_file.xlsx"));
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isColumnUpdatedCorrectly(String columnName) {
        // Logic to validate if the specific column 'estado' is updated correctly
        // This may involve parsing the downloaded Excel file and verifying contents
        // Dummy return for example
        try {
            // Implement actual Excel parsing and validation
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}