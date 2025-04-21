package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {
    tc_006Page page = new tc_006Page();

    @Given("El usuario está en la página de exportación de Excel")
    public void elUsuarioEstaEnLaPaginaDeExportacionDeExcel() {
        page.navigateToExportPage();
    }

    @When("El usuario realiza la exportación del archivo Excel")
    public void elUsuarioRealizaLaExportacionDelArchivoExcel() {
        page.exportExcelFile();
    }

    @Then("El Excel se descarga sin inconvenientes")
    public void elExcelSeDescargaSinInconvenientes() {
        Assert.assertTrue(page.isExcelDownloaded());
    }

    @Then("La columna 'IVA 0%' aparece en el documento")
    public void laColumnaIVAApareceEnElDocumento() {
        Assert.assertTrue(page.isColumnIVA0Present());
    }

    @Then("La columna 'IVA 0%' contiene los montos aplicables correctamente")
    public void laColumnaIVAContieneLosMontosAplicablesCorrectamente() {
        Assert.assertTrue(page.isColumnIVA0Correct());
    }
}