package test;

import driver.DriverSingleton;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import util.TestListener;

@Listeners({TestListener.class})
public class CommonConditions {

    protected WebDriver webDriver;

    @Before
    public void setUp() {
        webDriver = DriverSingleton.getWebDriver();
    }

    @After
    public void stopBrowser() {
        DriverSingleton.closeWebDriver();
    }
}