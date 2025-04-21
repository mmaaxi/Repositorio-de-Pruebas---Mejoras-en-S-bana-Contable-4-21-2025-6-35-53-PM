package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_005Page;

import static org.junit.Assert.assertTrue;

public class tc_005Steps {

    tc_005Page page = new tc_005Page();

    @Given("^the user is on the data export page$")
    public void the_user_is_on_the_data_export_page() {
        page.navigateToDataExportPage();
    }

    @When("^the user exports the Excel with updated data$")
    public void the_user_exports_the_Excel_with_updated_data() {
        page.exportExcel();
    }

    @Then("^the file should be generated successfully$")
    public void the_file_should_be_generated_successfully() {
        assertTrue(page.isFileGenerated());
    }

    @Then("^the column 'Monto Acumulado Folio OPC' should be renamed to 'Monto Acumulado Folio OPC \\(2121\\)'$")
    public void the_column_should_be_renamed() {
        assertTrue(page.isColumnRenamed());
    }

    @Then("^the existing data should remain unchanged$")
    public void the_existing_data_should_remain_unchanged() {
        assertTrue(page.isDataUnchanged());
    }
}