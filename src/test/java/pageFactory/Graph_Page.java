package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivers.DriverFactory;
import utilities.ConfigReader;
import utilities.LoggerLoad;
import utilities.Utility_Methods;

public class Graph_Page {

    public static WebDriver driver = DriverFactory.getDriver();
    Utility_Methods utils=new Utility_Methods();

    String homepage = ConfigReader.homePage();
    String graphurl = ConfigReader.getGraphUrl();
    String graphgraphurl = ConfigReader.getGraphGraphUrl();
    String graphrepresentationsurl = ConfigReader.getGraphRepresentationsUrl();
    @FindBy (xpath ="//a[@href ='graph']")WebElement getStartedgraph;
    @FindBy (linkText="Graph")WebElement Graphlink;
    @FindBy (xpath ="//a[contains(text(),'Graph Representations')]")WebElement graphrep_link;
    @FindBy(xpath="//a[contains(text(),'Practice Questions')]")WebElement graphpracticeq;
    @FindBy (xpath = "//a[@href='/tryEditor']")WebElement graph_tryEditor;
    @FindBy (xpath ="//form/div/div/div/textarea")
    WebElement textEditor;
    @FindBy(xpath ="//button[text()='Run']")WebElement runBtn;
    @FindBy(xpath ="//pre[@id='output']")WebElement outputText;
    @FindBy(xpath = "//a[contains(text(),'Sign out')]")
    WebElement signout;
    @FindBy(xpath = "//div[contains(text(),'Logged out successfully')]")
    WebElement successLogout;

    public Graph_Page() {
        PageFactory.initElements(driver, this);
    }
    public void getStarted() {
        getStartedgraph.click();
        LoggerLoad.info("User Clicked on Queue get started");
    }
    public String getGraphPageTitle() {
        String title = driver.getTitle();
        return title;
    }
    public void navigateToHomePage() {
        driver.get(homepage);
        LoggerLoad.info("user is in home page");
    }

    public void navigateToGraphPage() {
        driver.get(graphurl);
        LoggerLoad.info("user is in graph page");
    }

    public void navigateToGraphGraphPage() {
        driver.get(graphgraphurl);
        LoggerLoad.info("user is in graphgraphpage");
    }

    public void navigateToGraphRepresentationsPage() {
        driver.get(graphrepresentationsurl);
        LoggerLoad.info("user is in graph representations page");
    }

    public void clickOnGraphPracQuesLink() {
        graphpracticeq.click();
        LoggerLoad.info("User clicked on Graph Practice Questions link");
    }
    public void clickOnGraphLink() {
        Graphlink.click();
        LoggerLoad.info("User clicked on Graph link");
    }

    public void clickOnGraphRepresentationsLink() {
        graphrep_link.click();
        LoggerLoad.info("User clicked on Graph Representations link");
    }

    public void clickOnGraphTryhereLink() {
        graph_tryEditor.click();
        LoggerLoad.info("User clicked on Graph Try here link");
    }
    public void enterCode(String pythonCode) throws InterruptedException {
        textEditor.sendKeys(pythonCode);
    }
    public String getOutput() {
        utils.waitForElement(outputText);
        String output=outputText.getText();

        return output;
    }

    public void logout() {
        signout.click();
    }

    public String successLogout() {
        String alert = successLogout.getText();
        return alert;
    }


}