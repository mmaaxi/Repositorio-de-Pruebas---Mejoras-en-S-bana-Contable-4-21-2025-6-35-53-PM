package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.tc_001Page;

public class tc_001Steps {
    WebDriver driver;
    tc_001Page page = new tc_001Page(driver);

    @Given("^I am on the Canned Reports module in Claim Accounting Report$")
    public void openCannedReportsModule() {
        page.navigateToCannedReports();
        page.selectModuleClaimAccountingReport();
    }

    @When("^I select 'Submit' and then 'View Log'$")
    public void submitAndViewLog() {
        page.clickSubmit();
        page.clickViewLog();
    }

    @And("^I click on 'Agregar Folio' and 'Download Excel file'$")
    public void addFolioAndDownloadExcel() {
        page.clickAgregarFolio();
        page.downloadExcelFile();
    }

    @Then("^the system downloads an Excel file$")
    public void verifyExcelDownload() {
        page.verifyExcelDownloaded();
    }

    @And("^I verify that column C contains the concatenated key formula$")
    public void verifyConcatenatedKeyInExcel() {
        page.verifyConcatenatedKeyInExcel();
    }
}