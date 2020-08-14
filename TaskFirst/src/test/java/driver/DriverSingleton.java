package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingleton {

    private static final String RESOURCES_PATH = "src\\test\\resources";
    private static WebDriver webDriver;

    public DriverSingleton() {
        if (null == webDriver) {
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();
        }
    }

    public static void closeWebDriver() {
        webDriver.quit();
        webDriver = null;
    }
}
