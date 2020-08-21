package com.beinsports;

import com.beinsports.utils.DriverFactory;
import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private static WebDriver driver = DriverFactory.getChromeDriver();

    @BeforeScenario
    public void setUp() {
        String baseURL = "https://connect-au.beinsports.com/en";
        driver.manage().deleteAllCookies();
        driver.navigate().to(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterScenario
    public void tearDown() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
