package pageFactory;

import java.io.IOException;
import java.time.Clock;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Drivers.DriverFactory;
import utilities.ConfigReader;
import utilities.LoggerLoad;
import utilities.Utility_Methods;
public class Array_Page {

    //public  WebDriver driver =DriverFactory.getDriver();
    Utility_Methods util=new Utility_Methods();
    // String tryEditorURL=ConfigReader.tryEditorURL();
    String arrayPageurl=ConfigReader.arrayPageURL();

    @FindBy (xpath="//a[@href='arrays-in-python']")WebElement arraysInPythonLink;
    @FindBy (xpath="//a[@href='arrays-using-list']")WebElement arraysUsingListLink;
    @FindBy (xpath="//a[text()='Basic Operations in Lists']") WebElement basicOperationsInListsLink;
    @FindBy (xpath="//a[@href='applications-of-array']") WebElement applicationsOfArrayLink;
    @FindBy (xpath="//a[text()='Practice Questions']") WebElement practiceQuestionsLink;
    @FindBy (xpath="//a[text()='Search the array']") WebElement searchTheArrayLink;
    @FindBy (xpath="//a[text()='Max Consecutive Ones']")WebElement maxConsecutiveOnesLink;
    @FindBy (xpath="//a[text()='Find Numbers with Even Number of Digits']") WebElement findNumbersWithEvenNumberOfDigitsLink;
    @FindBy (xpath="//a[text()='Squares of  a Sorted Array']") WebElement squaresOfASortedArrayLink;
    @FindBy (xpath = "//a[@href ='array']")WebElement getStartedarray;
    @FindBy (xpath="//a[@href='/tryEditor']")WebElement tryHereLink;
    @FindBy (xpath="//form/div/div/div/textarea")WebElement editorInput;
    @FindBy (xpath="//button[text()='Run']") WebElement runButton;
    @FindBy (xpath="//pre[@id='output']") WebElement output;
    @FindBy (id="answer_form") WebElement answerform;
    @FindBy (xpath="//input[@value='Submit']") WebElement submitButton;

    public Array_Page()
    {
        PageFactory.initElements(util.driver,this);
    }
    public void arraypage() {
        util.driver.get(arrayPageurl);

    }
    public void  navigateTo(String pagename)
    {
        String urlName= ConfigReader.geturl(pagename);
        util.driver.get(urlName);
    }


    public void clickArraysInPythonLink()
    {
        LoggerLoad.info("User clicks on " +arraysInPythonLink.getText() + " in Array Page");
        arraysInPythonLink.click();
    }
    public String getPageTitle()
    {
        String Title=util.driver.getTitle();
        return Title;
    }

    public void getStartedArrayButton() {

        getStartedarray.click();

    }
    public void clickTryHereLink(String buttonName, String dataStructureName) {

        tryHereLink.click();
    }

    public void fetchPythonCode(String PythonCode) throws InterruptedException {
        System.out.println("Editor Input: "+editorInput);
        util.waitForElement(answerform);
        answerform.click();
        editorInput.sendKeys(PythonCode);
    }

    public void clickRunButton() {

        runButton.click();
    }

    public String fetchOutput()
    {
        util.waitForElement(output);
        String Result = output.getText();
        return Result;
    }

    public String fetchErrorMessage()
    {
        String errorMessage=util.driver.switchTo().alert().getText();
        util.driver.switchTo().alert().accept();
        return errorMessage;
    }

    public void clickArraysUsingListLink()
    {
        arraysUsingListLink.click();
    }

    public void clickbasicOperationsInListsLink()
    {
        basicOperationsInListsLink.click();

    }

    public void clickapplicationsOfArrayLink()
    {
        applicationsOfArrayLink.click();
    }

    public void clickpracticeQuestionsLink()
    {
        practiceQuestionsLink.click();

    }

    public void clickSearchTheArrayLink()
    {
        searchTheArrayLink.click();
    }

    public void enterPracticeQuestions(String sheetname, int rownumber) throws InvalidFormatException, IOException
    {
        util.waitForElement(answerform);
        answerform.click();
        String code=util.getCodefromExcel(sheetname, rownumber);
        util.enterPythonCodeForPractice(code, editorInput);

    }
    public String getExpectedResult(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException
    {
        String expectedResult=util.getResultfromExcel(sheetName, rowNumber);
        return expectedResult;
    }
    public String getActualResult()
    {
        return output.getText();
    }

    public void clickSubmitButton()
    {
        submitButton.click();
    }
    public void clickMaxConsecutiveOnesLink()
    {
        maxConsecutiveOnesLink.click();
    }

    public void clickFindNumbersWithEvenNumberOfDigitsLink()
    {
        findNumbersWithEvenNumberOfDigitsLink.click();
    }

    public void clickSquaresOfASortedArrayLink()
    {
        squaresOfASortedArrayLink.click();
    }

}