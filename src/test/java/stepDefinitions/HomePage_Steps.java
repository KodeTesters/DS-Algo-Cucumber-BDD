
package stepDefinitions;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Home_Page;
import utilities.LoggerLoad;


public class HomePage_Steps {

    Home_Page homePage =new Home_Page();

    @Given("user opens the dsalgo portal link")
    public void user_opens_the_dsalgo_portal_link() {
        LoggerLoad.info("-----DSAlgo Portal-----");
        homePage.dsalgoportal();
    }

    @When("user clicks on {string} button")
    public void user_clicks_on_button(String string) {
        LoggerLoad.info("-----Click on get Started button----");
        homePage.getstarted_btn();

    }

    @Then("user redirected to home page")
    public void user_redirected_to_home_page() {
        String title=homePage.getTitleofPage();
        LoggerLoad.info("----User is on"+title +"Page----");
        assertEquals(title,"NumpyNinja");

    }

    @Given("user is on Home Page")
    public void user_is_on_home_page() {
        LoggerLoad.info("----This is the Home Page------");
        homePage.homepage();

    }

    @When("The user clicks on data structure dropdown before signin")
    public void the_user_clicks_on_data_structure_dropdown_before_signin() {

        LoggerLoad.info("-----User Clicks on Dropdown Before Sign in-----");

    }

    @Then("The user select any dropdown menu {string}")
    public void the_user_select_any_dropdown_menu(String string) {

        homePage.dropdown(string);

    }

    @Then("It should Alert the user with the message {string}")
    public void it_should_alert_the_user_with_the_message(String string) {
        String alert =homePage.getAlert();
        LoggerLoad.info("The actual Message:" +alert);
        assertEquals(alert, string);
    }

    @When("The user click any of the Get started link before signin {string} in home page")
    public void the_user_click_any_of_the_get_started_link_before_signin_in_home_page(String string) {
        homePage.getStartedhome(string);
        LoggerLoad.info("User Clicks on Get Started link before Sign in");
    }

    @When("user clicks on SignIn link")
    public void user_clicks_on_sign_in_link() {

        LoggerLoad.info("---User Clicks on Sign In link----");
        homePage.signinLink();

    }

    @Then("user redirected to login page")
    public void user_redirected_to_login_page() {
        LoggerLoad.info("User redirected to Login page ");
        String Title = homePage.login_page();
        LoggerLoad.info("Title of current page is : " + Title);
        assertEquals(Title, "Login");
    }

    @When("user clicks on Register link")
    public void user_clicks_on_register_link() {
        LoggerLoad.info("----User Clicks on Register link---");
        homePage.registerLink();

    }

    @Then("user redirected to register page")
    public void user_redirected_to_register_page() {

        LoggerLoad.info("User redirected to Registraion page ");
        String Title = homePage.register_page();
        LoggerLoad.info("Title of current page is : " + Title);
        assertEquals(Title, "Registration");

    }

}
