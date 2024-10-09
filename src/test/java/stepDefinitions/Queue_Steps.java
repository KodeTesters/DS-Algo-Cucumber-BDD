package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Queue_Page;
import utilities.LoggerLoad;

public class Queue_Steps {
    Queue_Page qpage= new Queue_Page();

    @When("user clicks on queue getstarted")
    public void user_clicks_on_queue_getstarted() {
        qpage.getStarted();
    }




    @Given("User is in the Queue Page after logged in")
    public void user_is_in_the_queue_page_after_logged_in() {
        qpage.navigateToQueuePage();
    }

    @When("User clicks on the Implementation of Queue in Python link")
    public void user_clicks_on_the_implementation_of_queue_in_python_link() {
        qpage.impQueueinPython();
    }



    @Given("User is in the Implementation of queue in python page")
    public void user_is_in_the_implementation_of_queue_in_python_page() {
        qpage.navigateToImpOfQPython();

    }

    @When("User click on try here link")
    public void user_click_on_try_here_link() {
        qpage.clickTryhere();
    }



    @Given("User is on the try editor page")
    public void user_is_on_the_try_editor_page() {
        qpage.navigateToEditorUrl();
    }

    @When("User enters the Python Code")
    public void user_enters_the_python_code(io.cucumber.datatable.DataTable pythonCode) throws InterruptedException {
        List<List<String>>data=pythonCode.cells();
        qpage.enterCode(data.get(0).get(0));
    }

    @When("User clicks on run button")
    public void user_clicks_on_run_button() {
        qpage.clickonrunbtn();
    }

    @Then("User is presented with Result")
    public void user_is_presented_with_result() {
        String output=qpage.getOutput();
        LoggerLoad.info("The output is:" +output);
    }

    @When("User enters the invalid Python Code")
    public void user_enters_the_invalid_python_code(io.cucumber.datatable.DataTable invalidCode) throws InterruptedException {
        List<List<String>>data=invalidCode.cells();
        qpage.enterCode(data.get(0).get(0));
    }

    @Then("User is presented with the error message")
    public void user_is_presented_with_the_error_message() {
        qpage.getErrorText();
    }

    @When("User clicks on Implementation using collection.deque link")
    public void user_clicks_on_implementation_using_collection_deque_link() {
        qpage.impCollectiondeque();
    }


    @Given("User is in the Implementation using collection deque in python page")
    public void user_is_in_the_implementation_using_collection_deque_in_python_page() {
        qpage.navigateToImpCollDequePage();
    }

    @When("User clicks on Implementation using array link")
    public void user_clicks_on_implementation_using_array_link() {
        qpage.arrayImplementation();
    }



    @Given("User is in the Implementation using Array page")
    public void user_is_in_the_implementation_using_array_page() {
        qpage.navigateToImpUsingArrayUrl();
    }

    @When("User clicks on Queue Operations link")
    public void user_clicks_on_queue_operations_link() {
        qpage.queueOperation();
    }


    @Given("User is in the Queue Operations page")
    public void user_is_in_the_queue_operations_page() {
        qpage.navigateToQPracQuesPage();
    }


    @When("User clicks on Practice Questions link in Queue page")
    public void user_clicks_on_practice_questions_link_in_queue_page() {
        qpage.practice();
    }






}