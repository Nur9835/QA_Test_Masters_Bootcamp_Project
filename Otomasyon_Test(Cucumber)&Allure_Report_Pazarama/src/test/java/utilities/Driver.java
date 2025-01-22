package utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Driver {

    private Driver(){

    }
    static WebDriver driver;
    static DesiredCapabilities capabilities=new DesiredCapabilities();
    private static final ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    private static final ThreadLocal<String> threadBrowserName = new ThreadLocal<>();

    public static WebDriver getDriver() {

        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        if (threadBrowserName.get() == null) threadBrowserName.set("chrome");

        if (threadDriver.get() == null) {

            switch (threadBrowserName.get()) {

                case "edge":
                    threadDriver.set(new EdgeDriver());
                    break;
                case "firefox":
                    threadDriver.set(new FirefoxDriver());
                    break;
                case "safari":
                    threadDriver.set(new SafariDriver());
                    break;
                default:
                    threadDriver.set(new ChromeDriver());
                    break;
            }
        }
        threadDriver.get().manage().window().maximize();
        return threadDriver.get();
    }


    public static void quitDriver() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            WebDriver driver = threadDriver.get();
            driver = null;
            threadDriver.set(driver);
        }
    }

    public static void goBack() {
        if (threadDriver.get() != null) {
            threadDriver.get().navigate().back();
        } else {
            throw new IllegalStateException("Driver is not initialized!");
        }
    }
    public static void threadBrowserSet(String browser) {
        threadBrowserName.set(browser);
    }
}
