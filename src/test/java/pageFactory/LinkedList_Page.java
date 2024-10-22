package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivers.DriverFactory;
import utilities.ConfigReader;
import utilities.LoggerLoad;
import utilities.Utility_Methods;

public class LinkedList_Page {

    public  WebDriver driver = DriverFactory.getDriver();

    String tryEditorURL = ConfigReader.tryEditorURL();
    Utility_Methods util =new Utility_Methods();

    // Homepage
    @FindBy(xpath = "//a[@href='linked-list']")
    WebElement getstart_linkedlist;
    @FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")
    WebElement dropDown;
    @FindBy(xpath = "//a[@href='/linked-list']")
    WebElement dropdown_linkedlist;

    // LinkedListPage
    @FindBy(xpath = "//a[@href='introduction']")
    WebElement introductionLink;
    @FindBy(xpath = "//a[@href='creating-linked-list']")
    WebElement creatinglinkedlistLink;
    @FindBy(xpath = "//a[@href='types-of-linked-list']")
    WebElement typesOfLinkedList;
    @FindBy(xpath = "//a[@href='implement-linked-list-in-python']")
    WebElement implementLLInPythonLink;
    @FindBy(xpath = "//a[@href='traversal']")
    WebElement traversalLink;
    @FindBy(xpath = "//a[@href='insertion-in-linked-list']")
    WebElement insertionLink;
    @FindBy(xpath = "//a[@href='deletion-in-linked-list']")
    WebElement deletionLink;
    @FindBy(xpath = "//a[@href='/linked-list/practice']")
    WebElement practiceQuestionLink;
    @FindBy (id="answer_form") WebElement answerform;
    @FindBy(xpath = "//a[@href='/tryEditor']")
    WebElement tryHereLink;
    @FindBy (xpath ="//form/div/div/div/textarea")
    WebElement editorInput;
    @FindBy(xpath = "//*[@id='answer_form']/button")
    WebElement runButton;
    @FindBy(id = "output")
    WebElement output;

    public LinkedList_Page() {
        PageFactory.initElements(driver, this);
    }

    public void dropdown_linkedlist() {
        LoggerLoad.info("Click" + dropDown.getText() + "on drop down");
        dropDown.click();
        LoggerLoad.info("Click" + dropdown_linkedlist.getText() + " From the drop down");
        dropdown_linkedlist.click();
    }
    public String getLinkedListPageTitle() {
        String title = driver.getTitle();
        return title;
    }

    public void Clickon_introductionLink() {
        LoggerLoad.info("Click On " + introductionLink.getText() + "On Linked List Page");
        introductionLink.click();
        LoggerLoad.info("Title of the Page" + driver.getTitle());

    }

    public void TryHereLink(String Btname,String DsName) {
        tryHereLink.click();
        LoggerLoad.info("User Clicked on" + Btname+ " Button" + DsName );
    }

    public void Enter_PythonCode(String pythonCode)throws InterruptedException {
        util.waitForElement(answerform);
        answerform.click();
        editorInput.sendKeys(pythonCode);
    }

    public void Clickon_runButton() throws InterruptedException {

        runButton.click();
        LoggerLoad.info("User Clicked on Run button");

    }

    public String Get_OutputString() {

        util.waitForElement(output);
        return output.getText();

    }

    public String Get_Errormsg() {
        String errormsg = driver.switchTo().alert().getText();
        LoggerLoad.info("The Error Message is:" +errormsg);
        driver.switchTo().alert().accept();
        return errormsg;

    }

    public void navigateTotryEditor() {
        driver.get(tryEditorURL);
        LoggerLoad.info("User is in editor page");

    }
    public void navigateTo(String pagename) {
        String urlName = ConfigReader.geturl(pagename);
        driver.get(urlName);

    }
    public void Clickon_creatinglinkedlistLink() {
        LoggerLoad.info("Click" + creatinglinkedlistLink.getText() + "On Linked List Page");
        creatinglinkedlistLink.click();
        LoggerLoad.info("Title of the Page" + driver.getTitle());

    }

    public void Clickon_typesOfLinkedLink() {
        LoggerLoad.info("Click" + typesOfLinkedList.getText() + "On Linked List Page");
        typesOfLinkedList.click();
        LoggerLoad.info("Title of the Page" + driver.getTitle());

    }

    public void Clickon_implementLLInPythonLink() {
        LoggerLoad.info("Click" + implementLLInPythonLink.getText() + "On Linked List Page");
        implementLLInPythonLink.click();
        LoggerLoad.info("Title of the Page" + driver.getTitle());
    }
    public void Clickon_Traversal() {
        LoggerLoad.info("Click" +traversalLink.getText() + "On Linked List Page");
        traversalLink.click();
        LoggerLoad.info("Title of the Page" + driver.getTitle());
    }
    public void Clickon_Insertion() {
        LoggerLoad.info("Click" +insertionLink.getText() + "On Linked List Page");
        insertionLink.click();
        LoggerLoad.info("Title of the Page" + driver.getTitle());
    }
    public void Clickon_Deletion() {
        LoggerLoad.info("Click" +deletionLink.getText() + "On Linked List Page");
        deletionLink.click();
        LoggerLoad.info("Title of the Page" + driver.getTitle());
    }
    public void Clickon_PracticeQuestion() {
        LoggerLoad.info("Click" +practiceQuestionLink.getText() + "On Linked List Page");
        practiceQuestionLink.click();
        LoggerLoad.info("Title of the Page" + driver.getTitle());
    }




}