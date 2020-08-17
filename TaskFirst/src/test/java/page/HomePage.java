package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends AbstractPage {

    private Logger log = LogManager.getRootLogger();

    private final String HOMEPAGE_URL = "https://otus.ru/";

    public HomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(this.webDriver, this);
    }


    @Override
    public HomePage openPage() {
        webDriver.navigate().to(HOMEPAGE_URL);
        return this;
    }

    @FindBy(tagName = "title")
    private WebElement pageTitle;

    public String getTitle(){
        log.info("Take page title");
        return pageTitle.getAttribute("innerHTML");
    }
}
