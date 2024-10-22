package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Array_Page;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.LoggerLoad;
import utilities.Utility_Methods;

public class Array_Steps {

    //Array Step Definitions
    Utility_Methods util=new Utility_Methods();
    Array_Page array=new Array_Page();

     String PythonCode;
     String Output;
     String ExpectedResult,ExpectedError,expMsg;
    String Excelpath=ConfigReader.getexcelfilepath();


    @When("user clicks on Array getstarted")
    public void user_clicks_on_Array_getstarted()
    {
        LoggerLoad.info("User Clicks on Array get started link");
        array.getStartedArrayButton();
    }

    @Given("User is on {string} after logged in")
    public void user_is_on_after_logged_in(String pagename)
    {
        String page_name=pagename.replaceAll("\\s+", "");
        array.navigateTo(page_name);
        LoggerLoad.info("User is on the "+pagename + " after logged in");

    }


    @When("User clicks on Arrays in Python link")
    public void user_clicks_on_arrays_in_python_link()
    {

        array.clickArraysInPythonLink();
    }

    @Then("User should be redirected to {string} page")
    public void user_should_be_redirected_to_page(String pagename)
    {
        LoggerLoad.info("User is redirected to " +pagename + "Page");
        String pageTitle= array.getPageTitle();
        LoggerLoad.info("Page title is " +pageTitle);
        assertEquals(pageTitle,pagename,"User is redirected to another page");
    }


    @When("User clicks on {string} button in {string}")
    public void user_clicks_on_button_in_page(String buttonName, String dataStructureName)
    {
        LoggerLoad.info("User clicks " + buttonName + " on " + dataStructureName );
        array.clickTryHereLink(buttonName, dataStructureName);
        LoggerLoad.info("User clicks on Try Here Link");

    }

    @Then("User should be redirected to a page having an tryEditor with a Run button to test")
    public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test()
    {
        LoggerLoad.info("User is redirected to a page having Try Editor with a run button to test");
        String title=array.getPageTitle();
        LoggerLoad.info("Page Title is " +title);
        String expectedTitle="Assessment";
        assertEquals(title,expectedTitle,"User is redirected to Try Editor page");
    }

    @When("User enters valid Python code from sheet {string} and {int}")
    public void user_enters_valid_python_code_from_sheet_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException
    {
        LoggerLoad.info("User is on Try Editor page");
        ExcelReader reader = new ExcelReader();

        List<Map<String, String>> testdata = reader.getData(Excelpath, SheetName);
        //array.explicitWait(1000);

        PythonCode = testdata.get(RowNumber).get("PythonCode");
        ExpectedResult=testdata.get(RowNumber).get("Output");
        LoggerLoad.info("Expected Result is "+ExpectedResult);

        LoggerLoad.info("User enters PythonCode as \" " + PythonCode);
        if ( PythonCode!= null )
            array.fetchPythonCode(PythonCode);
       // array.explicitWait(1000);


    }

    @When("User clicks on Run button")
    public void user_clicks_on_run_button()
    {
      //  array.explicitWait(1000);
        LoggerLoad.info("User clicks on Run Button");
        array.clickRunButton();

    }

    @Then("User should be able to see the output")
    public void user_should_be_able_to_see_the_output()
    {
        LoggerLoad.info("User gets the Result of entered Python Code");
        String fetchOutput = array.fetchOutput();
        LoggerLoad.info("Displayed Result is "+fetchOutput);
        assertEquals(fetchOutput,ExpectedResult,"Output is same");


    }

    @When("User enters invalid Python code from sheet {string} and {int}")
    public void user_enters_invalid_python_code_from_sheet_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {

        LoggerLoad.info("User is on Try Editor page");
        ExcelReader reader = new ExcelReader();

        List<Map<String, String>> testdata = reader.getData(Excelpath, SheetName);
        PythonCode = testdata.get(RowNumber).get("PythonCode");
        ExpectedResult=testdata.get(RowNumber).get("Output");
        LoggerLoad.info("Expected Result is "+ExpectedResult);

        LoggerLoad.info("User enters PythonCode as \" " + PythonCode);
        if ( PythonCode!= null )
            array.fetchPythonCode(PythonCode);

    }

    @Then("User should be able to see error message")
    public void user_should_be_able_to_see_error_message() {

        LoggerLoad.info("User gets the error message in an Alert");
        String fetchError = array.fetchErrorMessage();
        String ExpectedError="NameError: name 'hello' is not defined on line 1";
        LoggerLoad.info("Displayed Error Message  is "+fetchError);
        assertEquals(fetchError,ExpectedError,"Invalid Syntax error message");

    }

    @When("User clicks on Arrays Using List link")
    public void user_clicks_on_arrays_using_list_link()
    {
        LoggerLoad.info("User clicks Arrays Using List Link");
        array.clickArraysUsingListLink();
    }


    @Then("User should be able to see error message in an Alert")
    public void user_should_be_able_to_see_error_message_in_an_alert() {
        LoggerLoad.info("User gets the error message in an Alert for Arrays Using List ");
        String fetchError = array.fetchErrorMessage();
        String ExpectedError="NameError: name 'hello' is not defined on line 1";
        LoggerLoad.info("Displayed Error Message  is "+fetchError);
        assertEquals(fetchError,ExpectedError,"Invalid Syntax error message");

    }

    @When("User clicks on Basic Operations in Lists link")
    public void user_clicks_on_basic_operations_in_lists_link() {
        LoggerLoad.info("User clicks on Basic Operations In List link");
        array.clickbasicOperationsInListsLink();
    }

    @Then("User should be able to see error message in an Alert box")
    public void user_should_be_able_to_see_error_message_in_an_alert_box()
    {
        LoggerLoad.info("User gets the error message in an Alert for Basic Operations in List ");
        String fetchError = array.fetchErrorMessage();
        String ExpectedError="NameError: name 'hello' is not defined on line 1";
        LoggerLoad.info("Displayed Error Message  is "+fetchError);
        assertEquals(fetchError,ExpectedError,"Invalid Syntax error message");
    }

    @When("User clicks on Applications of Array link")
    public void user_clicks_on_applications_of_array_link()
    {
        LoggerLoad.info("User clicks on Applications of Array Link");
        array.clickapplicationsOfArrayLink();

    }

    @Then("User should be able to see an error message in an Alert")
    public void user_should_be_able_to_see_an_error_message_in_an_alert()
    {
        LoggerLoad.info("User gets the error message in an Alert for Applications of Array ");
        String fetchError = array.fetchErrorMessage();
        String ExpectedError="NameError: name 'hello' is not defined on line 1";
        LoggerLoad.info("Displayed Error Message  is "+fetchError);
        assertEquals(fetchError,ExpectedError,"Invalid Syntax error message");

    }

    @When("User clicks on Practice Questions link")
    public void user_clicks_on_practice_questions_link()
    {

        LoggerLoad.info("User clicks on Practice Questions link");
        array.clickpracticeQuestionsLink();
    }

    @When("User clicks on Search the Array link")
    public void user_clicks_on_search_the_array_link()
    {
        LoggerLoad.info("User clicks on Search the Array Link");
        array.clickSearchTheArrayLink();

    }

    @Then("User should be redirected to Questions page contains a tryEditor with Run and Submit buttons")
    public void user_should_be_redirected_to_questions_page_contains_a_try_editor_with_run_and_submit_buttons() {

        LoggerLoad.info("User is redirected to Questions page having a Try Editor with Run button and Submit buttons");
        String title=array.getPageTitle();
        LoggerLoad.info("Page Title is " +title);
        String expectedTitle="Assessment";
        assertEquals(title,expectedTitle,"User is redirected to another page");

    }

    @Then("User should be able to see the Result")
    public void user_should_be_able_to_see_the_result() {

        LoggerLoad.info("User gets the Result of entered Python Code");
        String actualResult = array.getActualResult();
        LoggerLoad.info("Displayed Result is "+actualResult);
        assertEquals(actualResult,expMsg,"Output is displayed");
    }

    @Given("User is on {string} page of {string} after logged in")
    public void user_is_on_page_of_after_logged_in(String pageName1, String pageName2)
    {
        LoggerLoad.info("User is  on " +pageName1 + "  page of "+pageName2 + "after logged in ");
        String pname=pageName1+pageName2.replaceAll("\\s+", "");
        array.navigateTo(pname);

    }

    @When("User enters valid Python code from sheet {string} and {int} for the PracticeQuestions")
    public void user_enters_valid_python_code_from_sheet_and_for_the_practice_questions(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException
    {
        LoggerLoad.info("User enters valid Python Code from Sheet Name  "+sheetName);
        LoggerLoad.info("User enters valid Python Code from Row Number "+rowNumber);
        array.enterPracticeQuestions(sheetName,rowNumber);
        expMsg=array.getExpectedResult(sheetName, rowNumber);
    }

    @When("User clicks on Submit button")
    public void user_clicks_on_submit_button()
    {
        LoggerLoad.info("User clicks on Submit button");
        array.clickSubmitButton();
    }

    @Then("User should get success submission message")
    public void user_should_get_success_submission_message()
    {
        LoggerLoad.info("User gets Success submission message");
        //String actualMessage=array.getActualResult();
        //assertEquals(actualMessage,expMsg,"User gets submission message");
    }

    @When("User clicks on Max Consecutive Ones link")
    public void user_clicks_on_max_consecutive_ones_link()
    {
        LoggerLoad.info("User clicks on Max Consecutive Ones link");
        array.clickMaxConsecutiveOnesLink();
    }

    @When("User clicks on Find Numbers with Even Number of Digits link")
    public void user_clicks_on_find_numbers_with_even_number_of_digits_link()
    {
        LoggerLoad.info("User clicks on Find Numbers with Even Number of Digits link");
        array.clickFindNumbersWithEvenNumberOfDigitsLink();

    }

    @When("User clicks on Squares of a Sorted Array link")
    public void user_clicks_on_squares_of_a_sorted_array_link() {
        LoggerLoad.info("User clicks on Squares of a Sorted Array link");
        array.clickSquaresOfASortedArrayLink();

    }

}