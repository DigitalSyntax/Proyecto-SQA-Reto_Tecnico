package AUTOMATION_TEST.Objects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.Before;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conexion {

	private WebDriver driver;

	public Conexion() {

	}

	@Before
	@Step

	public WebDriver Home_Page() {
		//Colocar la ruta donde esta ubicado el webdriver dentro de la carpeta de recursos de proyecto.

		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://sanangel.com.co/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;

	}
}