package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivers.DriverFactory;
import utilities.ConfigReader;
import utilities.LoggerLoad;
import utilities.Utility_Methods;

public class Queue_Page {

    public  WebDriver driver =DriverFactory.getDriver();
    Utility_Methods util =new Utility_Methods();

    String queueurl = ConfigReader.getQueueUrl();
    String qpracquesurl = ConfigReader.getQPracQuesUrl();
    String homepage = ConfigReader.homePage();
    String impofqpythonurl = ConfigReader.getImpOfQPythonUrl();
    String editorurl = ConfigReader.getEditorUrl();
    String impcolldqurl = ConfigReader.getImpCollDQUrl();
    String impusingarray=ConfigReader.getImpUsingArrayUrl();

    @FindBy (xpath = "//a[@href ='queue']")WebElement getStartedQueue;
    @FindBy (xpath = "//a[@href='implementation-lists']")WebElement implementlistpython;
    @FindBy (xpath = "//a[@href='implementation-collections']")WebElement implementcolDeque;
    @FindBy (xpath = "//a[@href='Implementation-array']")WebElement implementArray;
    @FindBy (xpath = "//a[@href='QueueOp']")WebElement queueoperation;
    @FindBy (xpath = "//a[@href='/queue/practice']")WebElement practiceQuestions;
    @FindBy (xpath = "//a[@href='/tryEditor']")WebElement tryEditor;
    @FindBy (xpath ="//form/div/div/div/textarea")
    WebElement textEditor;
    @FindBy(xpath ="//button[text()='Run']")WebElement runBtn;
    @FindBy(xpath ="//pre[@id='output']")WebElement outputText;


    public Queue_Page() {
        PageFactory.initElements(driver, this);
    }
    public void getStarted() {
        getStartedQueue.click();
        LoggerLoad.info("User Clicked on Queue get started");
    }
    public String getPageTitle() {
        String title = driver.getTitle();
        return title;
    }
    public void navigateToHomePage() {
        driver.get(homepage);
        LoggerLoad.info("user is in homepage");
    }

    public void navigateToQueuePage() {
        driver.get(queueurl);
        LoggerLoad.info("User is in queue page");
    }

    public void navigateToQPracQuesPage() {
        driver.get(qpracquesurl);
    }

    public void navigateToImpOfQPython() {
        driver.get(impofqpythonurl);
        LoggerLoad.info("User is in Implementation of Queue in Python Page ");
    }

    public void navigateToEditorUrl() {
        driver.get(editorurl);
        LoggerLoad.info("User is in editor page");
    }

    public void navigateToImpCollDequePage() {
        driver.get(impcolldqurl);
        LoggerLoad.info("User is in Implementation using collections deque page");
    }
    public void impQueueinPython() {
        implementlistpython.click();
        LoggerLoad.info("User Clicked on the Implement of Queue in Python");
    }
    public void navigateToImpUsingArrayUrl() {
        driver.get(impusingarray);
    }
    public void clickTryhere() {
        tryEditor.click();
        LoggerLoad.info("User Clicked on Try here");
    }
    public void enterCode(String pythonCode) throws InterruptedException {
        textEditor.sendKeys(pythonCode);
    }
    public void clickonrunbtn() {
        runBtn.click();
        LoggerLoad.info("User Clicked on Run button");
    }
    public String getOutput() {
        util.waitForElement(outputText);
        String output=outputText.getText();

        return output;
    }
    public String getErrorText() {
        String errorMsg = driver.switchTo().alert().getText();
        LoggerLoad.info("The Error Message is:" +errorMsg);
        driver.switchTo().alert().accept();
        return errorMsg;
    }
    public void impCollectiondeque() {
        implementcolDeque.click();
        LoggerLoad.info("User Clicked on Implement Collection.deque");

    }
    public void arrayImplementation() {
        implementArray.click();
        LoggerLoad.info("User Clicked on Implementation using Array");

    }
    public void queueOperation() {
        queueoperation.click();
        LoggerLoad.info("User Clicked on Queue Operations");

    }
    public void practice() {
        practiceQuestions.click();
        LoggerLoad.info("User Clicked on Practice Questions");

    }


}