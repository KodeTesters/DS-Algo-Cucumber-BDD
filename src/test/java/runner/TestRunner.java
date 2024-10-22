package runner;
import org.testng.annotations.*;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ConfigReader;
import utilities.LoggerLoad;
import Drivers.DriverFactory;  // Import the DriverFactory class

@CucumberOptions(plugin = { "pretty", "html:target/ds_Algo_Reports.html",
		"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, // reporting purpose
		monochrome = true, // console output
		tags = "@Treepage", // tags from feature file
		features = { "src/test/resources/features" }, // location of feature files
		glue = { "stepDefinitions", "hooks" }) // location of step definition files
public class TestRunner extends AbstractTestNGCucumberTests {

	DriverFactory driverFactory;  // Declare an instance of DriverFactory

	static {
		try {
			LoggerLoad.info("Loading Config file");
			ConfigReader.readConfig();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

	@BeforeTest
	@BeforeMethod
	@Parameters({ "browser" })
	public void defineBrowser( @Optional("chrome") String browser) throws Throwable {
		ConfigReader.readConfig();  // Load configurations
		LoggerLoad.info("Setting up WebDriver for browser: " + browser);

		// Initialize DriverFactory and WebDriver
		driverFactory = new DriverFactory();  // Create an instance of DriverFactory
		driverFactory.initializeWebDriver(browser);  // Initialize WebDriver for the given browser

		ConfigReader.setBrowserType(browser);  // Optional: for further configuration
	}

	@AfterTest
	public void tearDown() {
		// Close the WebDriver using the DriverFactory instance
		if (driverFactory != null) {
			driverFactory.closeDriver();
		}
		LoggerLoad.info("Closed the WebDriver after test execution");
	}
}
