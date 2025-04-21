package steps;

import cucumber.api.java.en.*;
import pages.tc_004Page;

public class tc_004Steps {

    tc_004Page page = new tc_004Page();

    @Given("^el usuario navega al módulo de exportación$")
    public void navegarModuloExportacion() {
        page.navegarAlModuloDeExportacion();
    }

    @When("^el usuario ejecuta la exportación$")
    public void ejecutarExportacion() {
        page.ejecutarExportacion();
    }

    @Then("^el usuario descarga el archivo Excel sin errores$")
    public void validarDescargaSinErrores() {
        page.validarDescargaSinErrores();
    }

    @Given("^el usuario abre el archivo Excel$")
    public void abrirArchivoExcel() {
        page.abrirArchivoExcel();
    }

    @When("^el usuario verifica la existencia de la columna 'Monto acumulado Folio Reserva 5401'$")
    public void verificarColumnaMontoAcumulado() {
        page.verificarColumnaMontoAcumulado();
    }

    @Then("^la columna aparece a la derecha de 'Monto \\(reserva\\)'$")
    public void validarPosicionColumna() {
        page.validarPosicionColumna();
    }

    @And("^el valor es igual a la suma del acumulado anterior y el monto de reserva actual$")
    public void validarSumaAcumulada() {
        page.validarSumaAcumulada();
    }
}