
package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;

import Drivers.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Tree_Page;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class Tree_Steps {

    public  WebDriver driver =DriverFactory.getDriver();
    Tree_Page tp = new Tree_Page();
    ConfigReader cr = new ConfigReader();
    static String Tittle;

    @When("User click on the Tree Get Started button")
    public void user_click_on_the_tree_get_started_button() {
        tp.ClickTreeGS();
    }

    @Then("User is on Tree page and verify tittle as {string}")
    public void user_is_on_tree_page_and_verify_tittle_as(String msg) {
        LoggerLoad.info("Tittle of the Tree page:  "+driver.getTitle());
        String Msg1 = driver.getTitle();
        assertEquals(Msg1,msg);
    }


    @When("The user clicks on the Overview of Trees link")
    public void the_user_clicks_on_the_overview_of_trees_link() {
        tp.ClickOverview();
    }

    @Then("The user should be directed to the {string}  Page")
    public void the_user_should_be_directed_to_the_page(String PageName) {
        Tittle = driver.getTitle();
        assertEquals(Tittle,PageName);
    }

    @Then("The user should be redirected to tryEditor page with Run button")
    public void the_user_should_be_redirected_to_try_editor_page_with_run_button() {
        Tittle=driver.getTitle();
        System.out.println(Tittle);
        assertEquals(Tittle,"Assessment");
    }

    @When("The user clicks on the Terminologies button")
    public void the_user_clicks_on_the_terminologies_button() {
        tp.ClickTerminology();
    }


    @When("The user clicks {string} button on {string} page")
    public void the_user_clicks_button_on_page(String trybutton, String pgName) {
        LoggerLoad.info("User Clicks on "+trybutton+" in a "+pgName+" page");
        tp.ClickTryhereLink();
    }

    @When("The user clicks on the Types of Trees button")
    public void the_user_clicks_on_the_types_of_trees_button() {
        tp.ClickTypesOFTree();
    }

    @Given("The user is on the {string} page")
    public void the_user_is_on_the_page(String pagename) {

        String page_name=pagename.replaceAll("\\s+", "");
        String URL = ConfigReader.geturl(page_name);
        System.out.println(URL);
        driver.get(URL);
        Tittle = driver.getTitle();
        assertEquals(Tittle,pagename);
    }

    @When("The user clicks on the Tree Traversals button")
    public void the_user_clicks_on_the_tree_traversals_button() {
        tp.ClickTreeTraversal();
    }


    @When("The user clicks on the Traversal illustration button")
    public void the_user_clicks_on_the_traversal_illustration_button() {
        tp.ClickTraveIllustrate();
    }

    @When("The user clicks on the binary trees button")
    public void the_user_clicks_on_the_binary_trees_button() {
        tp.ClickBinaryTree();
    }

    @When("The user clicks on the types of binary trees button")
    public void the_user_clicks_on_the_types_of_binary_trees_button() {
        tp.ClickTypesOfBinary();
    }

    @When("The user clicks on the Implementation in Python button")
    public void the_user_clicks_on_the_implementation_in_python_button() {
        tp.ClickImplementPython();
    }


    @When("The user clicks on the binary tree traversals button")
    public void the_user_clicks_on_the_binary_tree_traversals_button() {
        tp.ClickBTTraverse();
    }

    @When("The user clicks on the Implementation of Binary Trees button")
    public void the_user_clicks_on_the_implementation_of_binary_trees_button() {
        tp.ClickImplementBT();
    }

    @When("The user clicks on the Applications of Binary Trees button")
    public void the_user_clicks_on_the_applications_of_binary_trees_button() {
        tp.ClickAppsOfBT();
    }

    @When("The user clicks on the Binary Search Trees button")
    public void the_user_clicks_on_the_binary_search_trees_button() {
        tp.ClickBinarySearchTree();
    }

    @When("The user clicks on the Implementation of BST button")
    public void the_user_clicks_on_the_implementation_of_bst_button() {
        tp.ClickImplementBST();
    }


    @Given("The User is on try editor page with run button")
    public void the_user_is_on_try_editor_page_with_run_button() {
        String TryEUrl = ConfigReader.tryEditorURL();
        driver.get(TryEUrl);
    }

    @When("User enter the Python code")
    public void user_enter_the_python_code(io.cucumber.datatable.DataTable pythonCode) throws InterruptedException {
        List<List<String>>data=pythonCode.cells();
        tp.enterCode(data.get(0).get(0));
    }

    @When("User Clicks on Run button")
    public void user_clicks_on_run_button() throws InterruptedException {
        tp.clickRunBtn();

    }

    @Then("User Verify the Result")
    public void user_verify_the_result() {
        String Reslt = tp.getOutput();
        assertEquals(Reslt,"Hello Numpy Ninjas");
    }

    @When("User enter the invalid Python code")
    public void user_enter_the_invalid_python_code(io.cucumber.datatable.DataTable pythonCode) throws InterruptedException {
        List<List<String>>data=pythonCode.cells();
        tp.enterCode(data.get(0).get(0));
    }
    @Then("User Verify the error message")
    public void user_verify_the_error_message() {
        String actualMsg = tp.getErrormsg();
        LoggerLoad.info("Actual result  :" + actualMsg);
        assertEquals(actualMsg,"SyntaxError: bad input on line 1", "Result do not match");
    }



    @When("The user clicks on the Practice Questions in Overview of Trees")
    public void the_user_clicks_on_the_practice_questions_in_overview_of_trees() {
        tp.ClickPractQuesLink();
    }

    @Then("The user should be directed to Practice Questions of tree page Page")
    public void the_user_should_be_directed_to_practice_questions_of_tree_page_page() {
        Tittle = driver.getTitle();
        System.out.println(Tittle);
        assertEquals(Tittle,"Practice Questions");
    }


}