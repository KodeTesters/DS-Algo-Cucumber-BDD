package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Stack_Page;
import utilities.LoggerLoad;

public class Stack_Steps {
Stack_Page stackpage = new Stack_Page();


	@When("The User clicks on the Stack Get Started button")
	public void the_user_clicks_on_the_stack_get_started_button() {
	   stackpage.getstarted_Stack();
	   LoggerLoad.info("The User clicks on the Stack Get Started button");
	}

	@Then("The User is redirected to the {string} page")
	public void the_user_is_redirected_to_the_page(String string) {
	    String Title = stackpage.getStackpageTitle();
	    LoggerLoad.info("Title of current page is:" + Title);
	    assertEquals(Title, "Stack");
	}

	@Given("The User is in the {string} after logged in")
	public void the_user_is_in_the_after_logged_in(String pagename) {
		String page_name=pagename.replaceAll("\\s+","");
		stackpage.navigate(page_name);
		LoggerLoad.info(page_name);
		
		
	}

	@When("The User clicks the Operations in Stack link")
	public void the_user_clicks_the_operations_in_stack_link() {
	    stackpage.clickOperationsInStackLink();
	    
	}

	@Then("The User is redirected to the page with title {string}")
	public void the_user_is_redirected_to_the_page_with_title(String string) {
	   String Title = stackpage.getStackpageTitle();
	   LoggerLoad.info("Title of current page is:" +Title);
	   assertEquals( Title,"Operations in Stack");
	}

	@When("The User clicks Try here button in Operations in stack page")
	public void the_user_clicks_try_here_button_in_operations_in_stack_page() {
	    stackpage.clickTryHerebutton();
	}

	@Then("The User should be redirected to the page with title {string}")
	public void the_user_should_be_redirected_to_the_page_with_title(String Assessment) {
		// String Title = stackpage.getStackpageTitle();
		 stackpage.navigateTryEditorUrl();
		 LoggerLoad.info("Title of current page is:");
		 //assertEquals( Title,"Assessment");
		 
	}

	@Given("The User is in tryEditor page of Operations in Stack")
	public void the_user_is_in_try_editor_page_of_operations_in_stack() {
	   stackpage.navigateTryEditorUrl();
	   LoggerLoad.info("The User is in tryEditor page of Operations in Stack");
	}

	@When("The User enter a python code in try Editor")
	public void the_user_enter_a_python_code_in_try_editor(io.cucumber.datatable.DataTable pythonCode) throws InterruptedException {
		List<List<String>>data=pythonCode.cells();
		 stackpage.enterCode(data.get(0).get(0));
	}

	@When("The User clicks the Run button")
	public void the_user_clicks_the_run_button() {
	   stackpage.clickRunBtn();
	   LoggerLoad.info("The User clicks the Run button");
		
	}

	@Then("The User get the run output")
	public void the_user_get_the_run_output() {
	    stackpage.getEditorOutput();
	    
	}

	@When("The User enter a invalid python code in try Editor")
	public void the_user_enter_a_invalid_python_code_in_try_editor(io.cucumber.datatable.DataTable invalidpythonCode ) throws InterruptedException {
		List<List<String>>data=invalidpythonCode.cells();
		 stackpage.enterCode(data.get(0).get(0));
	}
	
	@Then("The User get the Alert message")
	public void the_user_get_the_alert_message() {
	    stackpage.getAlertText();
		
		
	}
	
	@When("The User clicks on the Implementation link")
	public void the_user_clicks_on_the_implementation_link() {
	    stackpage.clickImplementationLink();
	    LoggerLoad.info("The User clicks on the Implementation link");	
	    }

	@When("The User clicks Try here button in stack Implementation page")
	public void the_user_clicks_try_here_button_in_stack_implementation_page() {
	    stackpage.clickTryHerebutton();
	}

	@Given("The User is in tryEditor page of Stack Implementation")
	public void the_user_is_in_try_editor_page_of_stack_implementation() {
		stackpage.navigateTryEditorUrl();
		LoggerLoad.info("The User is in tryEditor page of Stack Implementation");
	}

	@When("The User clicks on the Applications link")
	public void the_user_clicks_on_the_applications_link() {
		 stackpage.clickApplicationsLink();
		 LoggerLoad.info("The User clicks on the Applications link");
	}

	@When("The User clicks Try here button in Applications page")
	public void the_user_clicks_try_here_button_in_applications_page() {
		 stackpage.clickTryHerebutton();
	}
 
	@Given("The User is in tryEditor page of Stack Applications")
	public void the_user_is_in_try_editor_page_of_stack_applications() {
		 stackpage.navigateTryEditorUrl();
	}

	@When("The User clicks on the Practice Questions link")
	public void the_user_clicks_on_the_practice_questions_link() {
		stackpage.clickApplicationsLink();
	    stackpage.clickPracticeQuesLink();
	    LoggerLoad.info("The User clicks on the Practice Questions link");
	}

	@Then("The User should be redirected to the page with title Practice Questions")
	public void the_user_should_be_redirected_to_the_page_with_title_practice_questions() {
	   String Title = stackpage.getStackpageTitle();
	   LoggerLoad.info("Title of current page is :" +Title);
	   assertEquals(Title, "Practice Questions");
	   LoggerLoad.info("Practice Questions not found");
	   
	}
}