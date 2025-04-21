package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {

    tc_009Page exportPage = new tc_009Page();

    @Given("que el usuario está en la página de exportación")
    public void queElUsuarioEstaEnLaPaginaDeExportacion() {
        exportPage.navigateToExportPage();
    }

    @When("el usuario ejecuta la exportación del Excel")
    public void elUsuarioEjecutaLaExportacionDelExcel() {
        exportPage.exportExcel();
    }

    @Then("el Excel se genera sin errores")
    public void elExcelSeGeneraSinErrores() {
        Assert.assertTrue(exportPage.isExcelGeneratedSuccessfully());
    }

    @Then("las columnas 'Folio Pre solicitud' y 'Folio de Pago' aparecen en las posiciones correctas")
    public void lasColumnasAparecenEnLasPosicionesCorrectas() {
        Assert.assertTrue(exportPage.areColumnsPresentInCorrectOrder());
    }
}