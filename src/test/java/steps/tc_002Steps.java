package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {

    tc_002Page page = new tc_002Page();

    @Given("el usuario está en la página principal")
    public void usuarioEnPaginaPrincipal() {
        page.navegarAPaginaPrincipal();
    }

    @When("el usuario exporta el documento Excel según flujo principal")
    public void exportarDocumentoExcel() {
        page.exportarDocumentoExcel();
    }

    @Then("el Excel se exporta correctamente")
    public void verificarExportacionExitosa() {
        Assert.assertTrue(page.verificarExportacion());
    }

    @Then("verifica la existencia de la columna 'Estado Código' a la derecha de la columna I")
    public void verificarColumnaEstadoCodigo() {
        Assert.assertTrue(page.verificarColumnaEstadoCodigo());
    }

    @Then("la columna 'Estado Código' está en la posición correcta sin datos erróneos")
    public void verificarDatosCorrectosColumna() {
        Assert.assertTrue(page.verificarDatosColumnaEstadoCodigo());
    }
}