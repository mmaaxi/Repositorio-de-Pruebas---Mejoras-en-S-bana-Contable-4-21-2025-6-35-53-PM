package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_007Page;

public class tc_007Steps {
    WebDriver driver;
    tc_007Page page;

    @Before
    public void setUp() {
        // Código para inicializar el WebDriver.
    }
    
    @When("el usuario exporta el archivo Excel del módulo")
    public void exportExcelFile() {
        page.exportExcel();
    }

    @Then("el Excel se genera con los datos actualizados")
    public void validateExcelDataUpdated() {
        Assert.assertTrue(page.isExcelGeneratedWithUpdatedData());
    }

    @Then("las columnas 'IVA exento' e 'IVA retenido' aparecen con la información correcta")
    public void validateColumnsInformation() {
        Assert.assertTrue(page.areColumnsDisplayedCorrectly());
    }

    @Then("ambas columnas se mostraron correctamente a la derecha con los montos correspondientes")
    public void validateColumnsPositionAndValues() {
        Assert.assertTrue(page.areColumnsPositionedAndFilledCorrectly());
    }
    
    @After
    public void tearDown() {
        // Código para cerrar el WebDriver.
    }
}