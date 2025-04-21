package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_003Page;

public class tc_003Steps {
    WebDriver driver;
    tc_003Page page;

    public tc_003Steps() {
        // Initialization of WebDriver and Page
        this.driver = Hooks.getDriver();
        this.page = new tc_003Page(driver);
    }

    @Given("El usuario accede a la página de exportación")
    public void elUsuarioAccedeAPaginaDeExportacion() {
        page.navigateToExportPage();
    }

    @When("El usuario realiza la exportación del Excel")
    public void elUsuarioRealizaLaExportacionDelExcel() {
        page.exportExcel();
    }

    @Then("El documento debe descargarse sin inconvenientes")
    public void elDocumentoDebeDescargarseSinInconvenientes() {
        Assert.assertTrue(page.isDownloadSuccessful());
    }

    @Then("Verificar que la columna 'estado' se actualice con los datos correctos")
    public void verificarColumnaEstadoActualizada() {
        Assert.assertTrue(page.isColumnUpdatedCorrectly("estado"));
    }

    @Then("Los datos de la columna deben haberse actualizado correctamente")
    public void losDatosDebenActualizarseCorrectamente() {
        // Additional validation if necessary
    }
}