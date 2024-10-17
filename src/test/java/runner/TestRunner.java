package runner;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Drivers.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ConfigReader;
import utilities.LoggerLoad;

@CucumberOptions(plugin = { "pretty", "html:target/ds_Algo_Reports.html",
		"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, // reporting purpose
		monochrome = true, // console output
		tags = "@Signin", // tags from feature file
		features = { "src/test/resources/features" }, // location of feature files
		glue = { "stepDefinitions", "hooks" }) // location of step definition files

public class TestRunner extends AbstractTestNGCucumberTests {

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

	 

	@BeforeMethod
	@Parameters({ "browser" }) 
	public void defineBrowser(String browser) throws Throwable {
		System.out.println("-------------------------------" + browser);
		// ConfigReader.setBrowserType(browser);
		DriverFactory.initializeWebDriver(browser);
	}

}
