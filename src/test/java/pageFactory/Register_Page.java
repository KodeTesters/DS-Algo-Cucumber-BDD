package pageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivers.DriverFactory;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class Register_Page {

    public  WebDriver driver = DriverFactory.getDriver();

    String RegisterURL = ConfigReader.registerPageURL();

    @FindBy (name="username" ) WebElement username;
    @FindBy (name="password1" ) WebElement pass;
    @FindBy (name="password2" ) WebElement confirmpass;
    @FindBy (xpath="//div[@class='alert alert-primary']" ) WebElement errorMsg;
    @FindBy (xpath="//input[@value='Register']" ) WebElement register;

    public Register_Page() {
        PageFactory.initElements(driver, this);
    }

    public void OpenRegisterPage() {
        LoggerLoad.info("User is on Register Page");
        driver.get(RegisterURL);

    }
    public void setUserName(String userName) {

        LoggerLoad.info("Enter User Name");
        username.click();
        username.clear();
        username.sendKeys(userName);
    }
    public void setPassword(String Pass) {

        LoggerLoad.info("Enter password");
        pass.click();
        pass.clear();
        pass.sendKeys(Pass);

    }
    public void setConfirmPass(String confirmPass) {

        LoggerLoad.info("Enter confirm password");
        confirmpass.click();
        confirmpass.clear();
        confirmpass.sendKeys(confirmPass);
    }
    public String verifyErrorMsg() {
        LoggerLoad.info("verify the error message");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String emsg=errorMsg.getText();
        LoggerLoad.warn(emsg); //error message
        return emsg;
    }
    public void ClickRegister() {
        LoggerLoad.info("Click Register Button");
        register.click();
    }
    public String verifyUserWarnMsg() {
        LoggerLoad.info("verify the warn message");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String uwmsg=username.getAttribute("validationMessage");
        LoggerLoad.warn(uwmsg);//user warning message
        return uwmsg;
    }
    public String verifyPassWarnMsg() {
        LoggerLoad.info("verify the warn message");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String pwmsg=pass.getAttribute("validationMessage");
        LoggerLoad.warn(pwmsg);//password warning message
        return pwmsg;
    }
    public String verifyConPassWarnMsg() {
        LoggerLoad.info("verify the warn message");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String cpwmsg=confirmpass.getAttribute("validationMessage");
        LoggerLoad.warn(cpwmsg);//conform password warning message
        return cpwmsg;
    }
}