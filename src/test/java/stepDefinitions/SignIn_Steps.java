

package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.SignIn_Page;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class SignIn_Steps {
	SignIn_Page signIn = new SignIn_Page();
	static String username;
	static String password;
	String Excelpath=ConfigReader.getexcelfilepath();
	
	
	@Given("User is on SignIn page")
	public void user_is_on_sign_in_page() {
		
		LoggerLoad.info("------User is On Sign in page------");
		signIn.getLoginurl();    
	}
	@When("User Clicks on Register link")
	public void user_clicks_on_register_link() {
		LoggerLoad.info("----User Clicks on Register Link-----");
		signIn.register();
	   
	}
	@Then("User should be redirected to Register page")
	public void user_should_be_redirected_to_register_page() {
		String title =signIn.register_page();
		LoggerLoad.info("----User redirected to Page----"+title);
		assertEquals(title, "Registration");
	}
	@When("User clicks on login button with all empty field")
	public void user_clicks_on_login_button_with_all_empty_field() {
		
		 LoggerLoad.info("User is Clicking login button with empty fields");
		 signIn.clickLogin();
	    
	}

	@Then("User verify the message at username as {string}")
	public void user_verify_the_message_at_username_as(String string) {
		String text= signIn.validateUsernamefield(string);
		assertEquals(text,"Please fill out this field.");	    
	}

	@When("User clicks on login button with username as {string} only")
	public void user_clicks_on_login_button_with_username_as_only(String kode) {
		LoggerLoad.info("--User Enters Only the User name--");

		signIn.enterUsername(kode);

	    
	}

	@Then("User verify the message at password as {string}")
	public void user_verify_the_message_at_password_as(String numpy) {
		
		String text= signIn.validatePasswordfield(numpy);
		LoggerLoad.info("----User can see" +text +"-----");
		assertEquals(text,"Please fill out this field.");
	}

	@When("User clicks on login button with password as {string} only")
	public void user_clicks_on_login_button_with_password_as_only(String string) {
		LoggerLoad.info("User Enters Only Password");
		signIn.enterPassword(string);
	    
	}

	@Then("User verify the message at user as {string}")
	public void user_verify_the_message_at_user_as(String string) {
		
		String text= signIn.validateUsernamefield(string);
		LoggerLoad.info("User can see" +text);
		assertEquals(text,"Please fill out this field.");
	   
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
		
		signIn.enterUsername(username);
	    
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		signIn.enterPassword(password);
	    
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
		
		LoggerLoad.info("-----User Clicks on Login button-----");
		
		signIn.clickLogin();
	    
	}
	@Then("User verify the message as {string}")
	public void user_verify_the_message_as(String string) {
		String alertmsg =signIn.invalidAlert();
		LoggerLoad.info("The actual Alert is:" +alertmsg);
		assertEquals(alertmsg, string);

	}



	@When("User enters sheetname {string} and rownumber {int}")
	public void user_enters_sheetname_and_rownumber(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData(Excelpath, Sheetname);
		username = testdata.get(RowNumber).get("username");
		password = testdata.get(RowNumber).get("password");

		LoggerLoad.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");
		if (username != null || password != null)
			signIn.enterUsername(username);
		    signIn.enterPassword(password);
		
	    
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		signIn.clickLogin();
	    
	}

	@Then("It should navigate to the home page with a message {string}")
	public void it_should_navigate_to_the_home_page_with_a_message(String string) {
		signIn.successAlert();
	    
	}



	   


	
	
}
