package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Register_Page;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class Register_Steps {

    Register_Page RP = new Register_Page();
    String Excelpath=ConfigReader.getexcelfilepath();
    static String username;
    static String password;
    static String confirmpwd;

    @When("User click Register with username as {string} only")
    public void user_click_register_with_username_as_only(String UserName) {
        RP.setUserName(UserName);
        RP.ClickRegister();
    }

    @Then("User verify the message at password on Register Page as {string}")
    public void user_verify_the_message_at_password_as(String warn1) {
        String pwmsg =RP.verifyPassWarnMsg();
        assertEquals(pwmsg, warn1);
    }

    @When("User click Register with username as {string} and password as {string} only")
    public void user_click_register_with_username_as_and_password_as_only(String user, String pass) {
        RP.setUserName(user);
        RP.setPassword(pass);
        RP.ClickRegister();
    }

    @Then("User verify the message at confirmpassword on Register Page as {string}")
    public void user_verify_the_message_at_confirmpassword_as(String warn2) {
        String cpwmsg = RP.verifyConPassWarnMsg();
        assertEquals(cpwmsg, warn2);
    }



    @When("User click Register with all empty field")
    public void user_click_register_with_all_empty_field() {
        RP.ClickRegister();
    }

    @Then("User verify the message at username on Register Page as {string}")
    public void user_verify_the_message_at_username_as(String warn) {
        String uwmsg = RP.verifyUserWarnMsg();
        assertEquals(uwmsg, warn);
    }

    @Then("User click Register and verify the {string}")
    public void user_click_register_and_verify_the(String message) {
        RP.ClickRegister();
        String emsg =RP.verifyErrorMsg();
        assertEquals(emsg, message);
    }
    @Given("The user opens Register Page")
    public void the_user_opens_register_page() {
        RP.OpenRegisterPage();
    }

    @When("User enter {string} ,{string} and {string}")
    public void user_enter_and(String username, String password, String confirmpass) {
        RP.setUserName(username);
        RP.setPassword(password);
        RP.setConfirmPass(confirmpass);
    }

    @Then("User verify the {string}")
    public void user_verify_the(String message) {
        RP.ClickRegister();
        String emsg =RP.verifyErrorMsg();
        assertEquals(emsg, message);
    }
    @When("user enter the sheetname {string} and row number {int}")
    public void user_enter_the_sheetname_and_row_number(String Sheetname, Integer rownum) throws  IOException, InvalidFormatException {

        ExcelReader reader = new ExcelReader();

        List<Map<String, String>> testdata = reader.getData(Excelpath, Sheetname);

        username = testdata.get(rownum).get("username");
        password = testdata.get(rownum).get("password");
        confirmpwd = testdata.get(rownum).get("confirmpwd");


        LoggerLoad.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" Confirm password as\" "+ confirmpwd);
        if (username != null || password != null || confirmpwd != null)
            RP.setUserName(username);
        RP.setPassword(password);
        RP.setConfirmPass(confirmpwd);


    }

    @Then("user click on Register button and verify message as {string}")
    public void user_click_on_register_button_and_verify_message(String message) {
        RP.ClickRegister();
        String mes2 =RP.verifyErrorMsg();
        assertEquals(mes2, message);
    }

}