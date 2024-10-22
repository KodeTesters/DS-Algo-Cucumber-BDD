package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.List;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.DataStructure_Page;
import utilities.LoggerLoad;

public class DataStructure_Steps {
	DataStructure_Page dspage = new DataStructure_Page();

	@When("user clicks on datastructure getstarted")
	public void user_clicks_on_datastructure_getstarted() {
		LoggerLoad.info("User Clicks on get started link");
		dspage.getStarted_DS();
	}

	@Then("user redirected to page with title {string}")
	public void user_redirected_to_page_with_title(String string) {
		LoggerLoad.info("User redirected to"+string+"Page");
		String Title = dspage.getPageTitle();
		LoggerLoad.info("Title of current page is : " + Title);
		assertEquals(Title,string);
	}

	@When("user click on Time Complexity")
	public void user_click_on_time_complexity() {
		dspage.clickOnTimeComplexitylink();
		LoggerLoad.info("User Clicks on Time complexity link"); 
	}

	@Then("It should navigate to corresponding page with title {string}")
	public void it_should_navigate_to_corresponding_page_with_title(String string) {
		LoggerLoad.info("User redirected to"+string+"Page");
		String Title = dspage.getTitle();
		LoggerLoad.info("Title of current page is : " + Title);
		assertEquals(Title,string);
	    
	}

	@When("user click on Try here")
	public void user_click_on_try_here() {
		dspage.tryEditorlink();
		LoggerLoad.info("User Clicks on try it Editor");
		
	}

	@When("user enter the Python code")
	public void user_enter_the_python_code(io.cucumber.datatable.DataTable pythonCode) throws InterruptedException {
		List<List<String>>data=pythonCode.cells();
		 dspage.enterCode(data.get(0).get(0));
		    
	}

	@When("click on run button")
	public void click_on_run_button() throws InterruptedException {
		dspage.clickRunBtn();
		LoggerLoad.info("User Clicked Run button");
	    
	}

	
}