package AUTOMATION_TEST.Definition_Steps;

import AUTOMATION_TEST.STEPS_TO_STEPS.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import AUTOMATION_TEST.Objects.Conexion;

import java.awt.*;

public class DefinitionsSteps {


	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private HomePage PaginaPrincipal;




	@Given("^abra el navegador$")
	public void abra_el_navegador() throws Throwable {
	this.conexion = new Conexion();
	this.driver = this.conexion.Home_Page();

	}



	@When("^haga click sobre un producto y lo agregue al carrito")
	public void haga_click_sobre_un_producto_y_lo_agregue_al_carrito() throws InterruptedException, AWTException {
		this.PaginaPrincipal = new HomePage(driver);
		this.PaginaPrincipal.Home_Page();

	}
}