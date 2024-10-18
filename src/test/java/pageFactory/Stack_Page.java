package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivers.DriverFactory;
import utilities.ConfigReader;
import utilities.LoggerLoad;
import utilities.Utility_Methods;

public class Stack_Page {

	 public  WebDriver driver = DriverFactory.getDriver();
	  String tryEditorURL = ConfigReader.tryEditorURL();

	  Utility_Methods util = new Utility_Methods(); // This is for webelement wait 
	
	  //Home page
     @FindBy(xpath = "//a[@href='stack']")WebElement GetStartedLink; 

	//StackPage

	@FindBy(xpath = "//a[@href='operations-in-stack']")WebElement OperationsInStackLink;
	@FindBy(xpath = "//a[@href='implementation']")WebElement ImplementationLink;
	@FindBy(xpath = "//a[@href='stack-applications']")WebElement ApplicationsLink;
	@FindBy(xpath = "//a[@class='list-group-item list-group-item-light text-info']")WebElement PracticeQuestionsLink;
	@FindBy(xpath = "//a[@class='btn btn-info']")WebElement TryhereButton;
	@FindBy(xpath = "//textarea[@tabindex='0']")WebElement TextEditor;
	@FindBy(xpath = "//button[text()='Run']")WebElement RunButton;
	@FindBy(xpath = "//pre[@id='output']")WebElement EditorOutput; 

	public Stack_Page() {
		PageFactory.initElements(driver, this);
	}

	public void getstarted_Stack() {
		
		GetStartedLink.click();
		LoggerLoad.info("User clicks on Stack Get Started link");
	}

	public String getStackpageTitle() {
		String title = driver.getTitle();
		return title;
	}



	public void navigate(String pagename) {
		String urlName = ConfigReader.geturl(pagename);
		driver.get(urlName); 
	}

	public void clickOperationsInStackLink() {
		OperationsInStackLink.click();
		LoggerLoad.info("User clicks on Operations in Stack link");
	}

	public void clickTryHerebutton () {	
		TryhereButton.click();
		LoggerLoad.info("User clicks On Tryhere button in stack page");
	}

	public void enterCode(String pythonCode) throws InterruptedException {
		TextEditor.sendKeys(pythonCode);
	}

	public void clickRunBtn () {
		 RunButton.click();

	}
	public String getEditorOutput() {
		util.waitForElement(EditorOutput); // here we are using utility_method class

		String Output = EditorOutput.getText();
		return Output;
	}
	public String getAlertText() {
		
		String alertMsg = driver.switchTo().alert().getText();
		LoggerLoad.info("The Error Message is:" +alertMsg);
		driver.switchTo().alert().accept();
		return alertMsg;
	}
	public void navigateTryEditorUrl() {
		driver.get(tryEditorURL);
	}
	public void clickImplementationLink() {
		ImplementationLink.click();
		LoggerLoad.info("User clicks on Implementation link on Stack page");
	}
	public void clickApplicationsLink() {
		ApplicationsLink.click();
		LoggerLoad.info("User clicks On Applications link in stack page");
	}
	public void clickPracticeQuesLink() {
		PracticeQuestionsLink.click();
		LoggerLoad.info("User clicks On Practice Questions link in stack page");
	}
	}
