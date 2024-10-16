package hooks;

import java.io.ByteArrayInputStream;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import Drivers.DriverFactory;
import io.qameta.allure.Allure;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class Hooks {

    @Before
    public void launchBrowser() throws Throwable {
        // Get the instance of ConfigReader and retrieve the browser type
        LoggerLoad.info("Loading config file");
        String browser = ConfigReader.getBrowserType();  // This ensures the config is loaded

        // Initialize WebDriver from DriverFactory
        LoggerLoad.info("Initializing " + browser + " driver");
        DriverFactory.initializeWebDriver(browser);  // Ensure thread-safe WebDriver creation
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        // Take a screenshot if the scenario fails
        if (scenario.isFailed() && DriverFactory.getDriver() != null) {
            try {
                LoggerLoad.error("Step failed, taking screenshot");
                final byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "Screenshot on failure");
                Allure.attachment("Screenshot", new ByteArrayInputStream(screenshot));
            } catch (Exception e) {
                LoggerLoad.error("Failed to capture screenshot: " + e.getMessage());
            }
        }
    }

    @After
    public void afterScenario() {
        // Close WebDriver after the scenario finishes
        LoggerLoad.info("Closing driver after scenario");
        DriverFactory.closeDriver();  // Ensure thread-safe driver closure
    }
}
