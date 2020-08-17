package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import page.HomePage;


public class HomePageTest extends CommonConditions {

    private Logger log = LogManager.getRootLogger();

    @Test
    public void tunePageTitle() {
        String titleText = new HomePage(webDriver)
                .openPage()
                .getTitle();
        Assert.assertEquals("Онлайн‑курсы для профессионалов, дистанционное обучение современным профессиям", titleText);
        log.info("Compare expected page title and taken page title");
    }
}
