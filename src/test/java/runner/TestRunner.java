package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.*;

//import io.cucumber.junit.Cucumber;
//import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

	

	

	//@RunWith(Cucumber.class) //Junit executions

	@CucumberOptions(
			plugin = {"pretty", "html:target/ds_Algo_Reports.html",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, //reporting purpose
			monochrome=false,  //console output
			//tags = "@CrossBrowserFirefox", //tags from feature file
			features = {"src/test/resources/features"}, //location of feature files
			glue= {"stepDefinitions","hooks"}) //location of step definition files


	public class TestRunner extends AbstractTestNGCucumberTests{
		
		@Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
					
		return super.scenarios();
	    }



		}

	
