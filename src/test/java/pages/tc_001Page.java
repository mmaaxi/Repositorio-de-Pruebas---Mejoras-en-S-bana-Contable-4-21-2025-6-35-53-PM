package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;

public class tc_001Page {
    WebDriver driver;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    private By moduleDropdown = By.id("moduleClaim");
    private By reportCodeDropdown = By.id("reportCodeClaimAccounting");
    private By submitButton = By.id("submit");
    private By viewLogButton = By.id("viewLog");
    private By agregarFolioButton = By.id("agregarFolio");
    private By downloadExcelButton = By.id("downloadExcel");

    public void navigateToCannedReports() {
        // Implement navigation code
    }

    public void selectModuleClaimAccountingReport() {
        driver.findElement(moduleDropdown).click();
        driver.findElement(reportCodeDropdown).click();
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }

    public void clickViewLog() {
        driver.findElement(viewLogButton).click();
    }

    public void clickAgregarFolio() {
        driver.findElement(agregarFolioButton).click();
    }

    public void downloadExcelFile() {
        driver.findElement(downloadExcelButton).click();
    }

    public void verifyExcelDownloaded() {
        // Implement verification code for Excel download
    }

    public void verifyConcatenatedKeyInExcel() {
        try {
            File file = new File("path/to/downloaded/excel.xls");
            FileInputStream fis = new FileInputStream(file);
            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheetAt(0);
            Cell cell = sheet.getRow(1).getCell(2);
            String expectedFormula = "CONCATENATE(D2, \"_\", H2, \"_\", U2, \"_\", O2, \"_\", E2)";
            assert cell.getCellFormula().equals(expectedFormula);
            workbook.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}