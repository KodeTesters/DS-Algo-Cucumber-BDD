package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    // Thread-safe WebDriver instance
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    // Initialize WebDriver
    public static void initializeWebDriver(String browser) {
        if (driver.get() == null) {  // Ensure WebDriver is only initialized once per thread
            if (browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");  // Maximize Chrome window
                driver.set(new ChromeDriver(options));

            } else if (browser.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions options = new FirefoxOptions();
                options.addArguments("--width=1920", "--height=1080");  // Maximize Firefox window
                driver.set(new FirefoxDriver(options));

            } else if (browser.equalsIgnoreCase("edge")) {
                WebDriverManager.edgedriver().setup();
                EdgeOptions options = new EdgeOptions();
                options.addArguments("start-maximized");  // Maximize Edge window
                driver.set(new EdgeDriver(options));

            } else {
                throw new RuntimeException("Browser type not supported: " + browser);
            }

            // Common driver setup
            driver.get().manage().window().maximize();
        }
    }

    // Get the WebDriver instance
    public static WebDriver getDriver() {
        if (driver.get() == null) {
            throw new RuntimeException("WebDriver is not initialized. Please call initializeWebDriver() first.");
        }
        return driver.get();
    }

    // Close the WebDriver
    public static void closeDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove(); // Removes driver from ThreadLocal to clean up resources
        }
    }
}
