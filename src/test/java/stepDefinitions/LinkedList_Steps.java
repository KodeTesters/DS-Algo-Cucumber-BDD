package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LinkedList_Page;
import utilities.LoggerLoad;

public class LinkedList_Steps {
    LinkedList_Page lList = new LinkedList_Page();

    @When("The user selecting linkedlist item from the drop down menu")
    public void the_user_selecting_linkedlist_item_from_the_drop_down_menu() {
        LoggerLoad.info("The User Select Linked List From drop down menu ");
        lList.dropdown_linkedlist();
    }

    @Then("The user redirected to {string}  Page")
    public void the_user_redirected_to_page(String string) {
        LoggerLoad.info("The User redirected to " + string + "Page");
        String title = lList.getLinkedListPageTitle();
        LoggerLoad.info("Title of the Current Page is " + title);
        assertEquals(title, string);
    }
    @Given("The user is on the {string} after logged in")
    public void the_user_is_on_the_after_logged_in(String pagename) {
        String page_name = pagename.replaceAll("\\s+", "");
        lList.navigateTo(page_name);
        LoggerLoad.info("The user is on the " + pagename + " after logged in");
    }

    @When("The user clicks Introduction link")
    public void the_user_clicks_introduction_link() {
        lList.Clickon_introductionLink();
        LoggerLoad.info("User Clicks on Introduction link");
    }

    // TS_02,TS_06,@TS_10
    @Then("The user move to {string} of Linked List Page")
    public void the_user_move_to_of_linked_list_page(String pagename) {
        LoggerLoad.info("The User redirected to " + pagename + "Page");
        String title = lList.getLinkedListPageTitle();
        LoggerLoad.info("Title of the Current Page is " + title);
        assertEquals(title, pagename);
    }

    @When("The user clicks {string} button in the {string} page")
    public void the_user_clicks_button_in_the_page(String BtName, String DsName) {
        lList.TryHereLink(BtName, DsName);
        LoggerLoad.info("User Clicks on try it Editor");
    }

    @Then("The user redirected to the page having an tryEditor with a Run button to test")
    public void the_user_redirected_to_the_page_having_an_try_editor_with_a_run_button_to_test() {
        LoggerLoad.info("User redirected to a page having an tryEditor with a Run button to test");
        String Title = lList.getLinkedListPageTitle();
        LoggerLoad.info("Title of current page is :" + Title);
        assertEquals(Title, "Assessment", "Title do not match");
    }

    // TS_03,@TS_06
    @Given("The user is in a try here page having tryEditor with a Run button to test")
    public void the_user_is_in_a_try_here_page_having_try_editor_with_a_run_button_to_test() {
        LoggerLoad.info("The User is in page having an tryEditor with a Run button to test");
        lList.navigateTotryEditor();
        String Title = lList.getLinkedListPageTitle();
        LoggerLoad.info("Title of current page is :" + Title);

    }

    // @TS_04,@TS_08
    @When("The user Enter valid python code")
    public void the_user_enter_valid_python_code(io.cucumber.datatable.DataTable pythonCode) throws InterruptedException
    {
        List<List<String>>data=pythonCode.cells();
        lList.Enter_PythonCode(data.get(0).get(0));

    }

    @When("user click on Run button")
    public void user_click_on_run_button() throws InterruptedException {
        lList.Clickon_runButton();
    }

    // @TS_04,@TS_08
    @Then("The user should get the Run output")
    public void the_user_should_get_the_run_output() {
        String output = lList.Get_OutputString();
        LoggerLoad.info("The output is:" + output);

    }

    // @TS_05
    @When("The user Enter invalid python code")
    public void the_user_enter_invalid_python_code(io.cucumber.datatable.DataTable invalidCode)
            throws InterruptedException {
        List<List<String>> data = invalidCode.cells();
        lList.Enter_PythonCode(data.get(0).get(0));
    }

    @Then("The user get the error message")
    public void the_user_get_the_error_message() {
        lList.Get_Errormsg();
    }
    // @TS_09

    @When("The user clicks creating linked list link")
    public void the_user_clicks_creating_linked_list_link() {
        lList.Clickon_creatinglinkedlistLink();
    }



    @When("The user clicks Types of Linked List link")
    public void the_user_clicks_types_of_linked_list_link() {
        lList.Clickon_typesOfLinkedLink();
    }

    @When("The user clicks Implement Linked List in Python link")
    public void the_user_clicks_implement_linked_list_in_python_link() {
        lList.Clickon_implementLLInPythonLink();
    }


    @When("The user clicks Traversal link")
    public void the_user_clicks_traversal_link() {
        lList.Clickon_Traversal();
    }



    @When("The user clicks Insertion link")
    public void the_user_clicks_insertion_link() {
        lList.Clickon_Insertion();
    }



    @When("The user clicks Deletion link")
    public void the_user_clicks_deletion_link() {
        lList.Clickon_Deletion();
    }



    @When("The user clicks on the Practice Questions")
    public void the_user_clicks_on_the_practice_questions() {
        lList.Clickon_PracticeQuestion();
    }

    @Then("The user move to {string} Linked List Page")
    public void the_user_move_to_linked_list_page(String string) {
        LoggerLoad.info("The User redirected to " + string + "Page");
        String title = lList.getLinkedListPageTitle();
        LoggerLoad.info("Title of the Current Page is " + title);
        assertEquals(title, string);

    }
}