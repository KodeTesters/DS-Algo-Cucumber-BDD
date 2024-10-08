package hooks;
import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Drivers.DriverFactory;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class Hooks {
    public static WebDriver driver;
    private static DriverFactory baseclass;

    @BeforeAll
    public static void launchbrowser()  throws Throwable {
        //Get Browser Type
        LoggerLoad.info("Loading Config file");
        ConfigReader.readConfig();
        String browser = ConfigReader.browserType();

        //Initialize driver from DriverFactory
        baseclass = new DriverFactory();
        driver =baseclass.initializeWebdriver(browser);
        LoggerLoad.info("Intializing" + browser +"driver");

    }

    @AfterStep
    public void afterstep(Scenario scenario) {
        if (scenario.isFailed()) {
            LoggerLoad.error("Steps Failed , Taking Screenshot");
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "My screenshot");
            Allure.attachment("Myscreenshot",new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));

        }
    }

    @AfterAll
    public static void after() throws InterruptedException {
        LoggerLoad.info("Closing Driver");
        //Thread.sleep(5000);
        DriverFactory.closeallDriver();
    }


}
