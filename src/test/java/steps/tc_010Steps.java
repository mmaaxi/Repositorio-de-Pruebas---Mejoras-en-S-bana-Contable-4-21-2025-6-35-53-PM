package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {
    tc_010Page page = new tc_010Page();

    @Given("I have accessed the module to download the updated Excel")
    public void i_have_accessed_the_module_to_download_the_updated_excel() {
        page.accessModule();
    }

    @When("I download the Excel file")
    public void i_download_the_excel_file() {
        page.downloadExcelFile();
    }

    @Then("the document should be generated successfully with all modifications")
    public void the_document_should_be_generated_successfully_with_all_modifications() {
        Assert.assertTrue(page.isDocumentGeneratedSuccessfully());
    }

    @Then("I should see the 'Status Pago Código' column to the right of 'Fecha de Pago'")
    public void i_should_see_the_status_pago_codigo_column_to_the_right_of_fecha_de_pago() {
        Assert.assertTrue(page.isStatusPagoCodigoColumnInExpectedPosition());
    }

    @Then("the 'Status de Pago' column should be renamed to 'Descripción Status Pago'")
    public void the_status_de_pago_column_should_be_renamed_to_descripcion_status_pago() {
        Assert.assertTrue(page.isStatusDePagoColumnRenamedCorrectly());
    }

    @Then("there should be no data integrity issues in the document")
    public void there_should_be_no_data_integrity_issues_in_the_document() {
        Assert.assertTrue(page.isDataIntegrityMaintained());
    }
}