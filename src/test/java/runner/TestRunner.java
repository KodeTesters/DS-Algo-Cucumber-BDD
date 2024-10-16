package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import utilities.ConfigReader;

@CucumberOptions(
		plugin = {"pretty", "html:target/ds_Algo_Reports.html",
				"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, //reporting purpose
		monochrome=true,  //console output
		//tags = "", //tags from feature file
		features = {"src/test/resources/features"}, //location of feature files
		glue= {"stepDefinitions","hooks"}) //location of step definition files

public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}


	@BeforeTest
	@Parameters({"browser"})
	public void defineBrowser(String browser)throws Throwable {
		ConfigReader.setBrowserType(browser);
	}

}