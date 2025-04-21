import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import pages.tc_008Page;

public class tc_008Steps {

    WebDriver driver;
    tc_008Page page;

    @Given("el documento Excel está listo para exportar con todas las modificaciones aplicadas")
    public void el_documento_excel_esta_listo_para_exportar() {
        page = new tc_008Page(driver);
        page.prepareExcelForExport();
    }

    @When("el usuario exporta el Excel completando todas las modificaciones")
    public void el_usuario_exporta_el_excel() {
        page.exportExcel();
    }

    @Then("el documento se genera exitosamente")
    public void el_documento_se_genera_exitosamente() {
        assertTrue(page.isExcelGeneratedSuccessfully());
    }

    @When("el usuario revisa la celda que contiene la fórmula actualizada para 'Monto Acumulado Folio OPC 2121'")
    public void el_usuario_revisa_la_formula_actualizada() {
        page.checkUpdatedFormulaInExcel();
    }

    @Then("la fórmula se actualiza adecuadamente y realiza la suma con los campos: Descuento, IVA descuento, ISR, Impuesto cedular, IVA acumulable y IVA retenido")
    public void la_formula_se_actualiza_adecuadamente() {
        assertTrue(page.isFormulaUpdatedCorrectly());
    }
}