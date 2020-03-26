package com.betamerica.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import static com.betamerica.core.PropertiesCache.getProperty;


public class TestBase {

    protected WebDriver driver;
    private long implicitWait = Long.parseLong(getProperty("wait.implicit"));
    private long pageWait = Long.parseLong(getProperty("wait.page"));
    private long scriptWait = Long.parseLong(getProperty("wait.script"));

    @BeforeClass
    public void testSetup() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(pageWait, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(scriptWait, TimeUnit.SECONDS);
    }

/*
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
*/
}
