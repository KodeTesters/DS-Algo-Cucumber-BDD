package stepDefinitions;

import static org.testng.Assert.assertEquals;

//import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Array_Page;
import pageFactory.Home_Page;
import pageFactory.Queue_Page;
import pageFactory.SignIn_Page;
import utilities.LoggerLoad;

public class Common_Steps_All {
    SignIn_Page signin = new SignIn_Page();
    Home_Page home =new Home_Page();
    Array_Page array=new Array_Page();
    Queue_Page qpage=new Queue_Page();

    @Given("The user is on Signin page of DS Algo portal")
    public void the_user_is_on_signin_page_of_ds_algo_portal() {
        LoggerLoad.info("User Is on Login Page");
        signin.getLoginurl();

    }

    @When("The user enter valid {string} and {string}")
    public void the_user_enter_valid_and(String username, String password) {
        LoggerLoad.info("User Enters username and password");
        signin.enterUsername(username);
        signin.enterPassword(password);


    }

    @When("The user click on login button")
    public void the_user_click_on_login_button() {
        signin.clickLogin();

    }

    @Then("The user redirected to homepage")
    public void the_user_redirected_to_homepage() {

        home.homepage();
        LoggerLoad.info("User redirected to HomePage");

    }
    @Given("The user is on Home page after logged in")
    public void the_user_is_on_home_page_after_logged_in() {
        String Title = home.getTitleofPage();
        LoggerLoad.info("Title of current page is " + Title);

    }
    @Then("User redirected to {string} page")
    public void user_redirected_to_page(String string) {
        LoggerLoad.info("The User redirected to " + string + "Page");
        String title = qpage.getPageTitle();
        LoggerLoad.info("Title of the Current Page is " + title);
        assertEquals(title, string);
    }

}