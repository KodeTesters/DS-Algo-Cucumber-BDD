package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;
    private static String browserType = null; // Allows dynamic setting of browser type
    private final static String propertyFilePath = ".\\src\\test\\resources\\config\\config.properties";

    // Load the properties file
    public static void readConfig() throws Throwable {
        try (FileInputStream fis = new FileInputStream(propertyFilePath)) {
            properties = new Properties();
            properties.load(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Config.properties not found at " + propertyFilePath, e);
        } catch (IOException e) {
            throw new RuntimeException("Error loading Config.properties file at " + propertyFilePath, e);
        }
    }

    // Method to dynamically set the browser type at runtime
    public static void setBrowserType(String browser) {
        browserType = browser;
    }

    // Get browser type, first checking the dynamic setting, then falling back to config file
    public static String getBrowserType() {
        if (browserType != null) {
            return browserType;  // Return the dynamically set browser type
        }
        return browserType(); // Fallback to value in config file if not set dynamically
    }

    // Fetch browser type from config.properties
    public static String browserType() {
        String browser = properties.getProperty("browser");
        LoggerLoad.info("Get Browser Type from Properties");
        if (browser != null)
            return browser;
        else
            throw new RuntimeException("Browser Not Specified in Config.Properties file");
    }

    // Base URL
    public static String applicationUrl() {
        String url = properties.getProperty("baseurl");
        if (url != null)
            return url;
        else
            throw new RuntimeException("url not specified in the Config.properties file");
    }

    // HomePage URL
    public static String homePage() {
        String homePageurl = properties.getProperty("homepageurl");
        if (homePageurl != null)
            return homePageurl;
        else
            throw new RuntimeException("HomePageurl not specified in the Config.properties file");
    }

    // Signin URL
    public static String loginPage() {
        String loginurl = properties.getProperty("loginurl");
        if (loginurl != null)
            return loginurl;
        else
            throw new RuntimeException("login not specified in the Config.properties file");
    }

    // Registration URL
    public static String registerPageURL() {
        String registerurl = properties.getProperty("registerpageurl");
        if (registerurl != null)
            return registerurl;
        else
            throw new RuntimeException("registerpageurl not specified in the Config.properties file");
    }

    // Excel file path
    public static String getexcelfilepath() {
        String excelfilelpath = properties.getProperty("excelFilePath");
        if (excelfilelpath != null)
            return excelfilelpath;
        else
            throw new RuntimeException("Excel file path not specified in the Configuration.properties file.");
    }

    // Array
    public static String arrayPageURL() {
        String arrayPageurl = properties.getProperty("Arraypage");
        if (arrayPageurl != null)
            return arrayPageurl;
        else
            throw new RuntimeException("Array Page url not specified in the Configuration.properties file.");
    }

    // Try Editor URL
    public static String tryEditorURL() {
        String tryeditorurl = properties.getProperty("tryeditorurl");
        if (tryeditorurl != null)
            return tryeditorurl;
        else
            throw new RuntimeException("tryeditorurl not specified in the Configuration.properties file.");
    }

    // Generic method to retrieve URLs
    public static String geturl(String pagename) {
        String url = properties.getProperty(pagename);
        if (url != null)
            return url;
        else
            throw new RuntimeException(pagename + " url not specified in the Configuration.properties file.");
    }

    // Linked list
    public static String getLinkedListUrl() {
        String linkedlisturl = properties.getProperty("linkedlisturl");
        if (linkedlisturl != null)
            return linkedlisturl;
        else
            throw new RuntimeException("linked list url not specified in the Configuration.properties file.");
    }

    // Stack
    public static String getStackUrl() {
        String stackurl = properties.getProperty("stackurl");
        if (stackurl != null)
            return stackurl;
        else
            throw new RuntimeException("stack url not specified in the Configuration.properties file.");
    }

    // Queue
    public static String getQueueUrl() {
        String queueurl = properties.getProperty("queueurl");
        if (queueurl != null)
            return queueurl;
        else
            throw new RuntimeException("queue url is not specified in the Configuration.properties file.");
    }

    // Other URL getters for various pages (QPractice, Graph, Tree, etc.)
    public static String getQPracQuesUrl() {
        String qpracquesurl = properties.getProperty("qpracquesurl");
        if (qpracquesurl != null)
            return qpracquesurl;
        else
            throw new RuntimeException("Queue Practice Questions url is not specified in the Configuration.properties file.");
    }

    public static String getImpOfQPythonUrl() {
        String impofqpythonurl = properties.getProperty("impofqpythonurl");
        if (impofqpythonurl != null)
            return impofqpythonurl;
        else
            throw new RuntimeException("Implementation of Queue in Python url is not specified in the Configuration.properties file.");
    }

    public static String getEditorUrl() {
        String editorurl = properties.getProperty("editorurl");
        if (editorurl != null)
            return editorurl;
        else
            throw new RuntimeException("Editor url is not specified in the Configuration.properties file.");
    }

    public static String getImpCollDQUrl() {
        String impcolldqurl = properties.getProperty("impcolldqurl");
        if (impcolldqurl != null)
            return impcolldqurl;
        else
            throw new RuntimeException("Implementation using collections deque url is not specified in the Configuration.properties file.");
    }

    public static String getImpUsingArrayUrl() {
        String impusingarray = properties.getProperty("impusingarrayurl");
        if (impusingarray != null)
            return impusingarray;
        else
            throw new RuntimeException("Implementation using array url is not specified in the Configuration.properties file.");
    }

    // Graph
    public static String getGraphUrl() {
        String graphurl = properties.getProperty("graphurl");
        if (graphurl != null)
            return graphurl;
        else
            throw new RuntimeException("graph url is not specified in the Configuration.properties file.");
    }

    public static String getGraphGraphUrl() {
        String graphgraphurl = properties.getProperty("graphgraphurl");
        if (graphgraphurl != null)
            return graphgraphurl;
        else
            throw new RuntimeException("graphgraph url is not specified in the Configuration.properties file.");
    }

    public static String getGraphRepresentationsUrl() {
        String graphrepresentationsurl = properties.getProperty("graphrepresentationsurl");
        if (graphrepresentationsurl != null)
            return graphrepresentationsurl;
        else
            throw new RuntimeException("graphrepresentations url is not specified in the Configuration.properties file.");
    }

    // Tree
    public static String getTreeUrl() {
        String treeurl = properties.getProperty("treeurl");
        if (treeurl != null)
            return treeurl;
        else
            throw new RuntimeException("tree url not specified in the Configuration.properties file.");
    }
}
