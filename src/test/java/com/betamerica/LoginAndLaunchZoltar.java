package com.betamerica;

import com.betamerica.blocks.casino.CasinoGridBlock;
import com.betamerica.blocks.HeaderBlock;

import com.betamerica.blocks.LoginBlock;
import com.betamerica.blocks.casino.TopMenuBlock;
import com.betamerica.core.PropertiesCache;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginAndLaunchZoltar {

    private WebDriver driver;
    private Actions actions;
    private WebDriverWait wait;
    private String url = String.valueOf(PropertiesCache.getProperty("env.casinoUrl"));
    private String username = String.valueOf(PropertiesCache.getProperty("login.username"));
    private String password = String.valueOf(PropertiesCache.getProperty("login.password"));


    @BeforeClass
    public void testSetup() {
        driver = new ChromeDriver();
        //actions = new Actions(driver);
        //wait = new WebDriverWait(this.driver, 30);
    }

    @Test
    public void loginAndLaunchZoltarTest() throws InterruptedException {
        driver.get("https://nj-betamerica-dge.staging.sbtech.com/en/casino-hub-stg/");

        HeaderBlock headerBlock = PageFactory.initElements(driver, HeaderBlock.class);
        headerBlock.clickLoginButton();

        LoginBlock loginBlock = PageFactory.initElements(driver, LoginBlock.class);
        loginBlock.submitLoginForm(username, password);
        Thread.sleep(5000);

        TopMenuBlock topMenuBlock = PageFactory.initElements(driver, TopMenuBlock.class);
        topMenuBlock.clickSearchButton();
        topMenuBlock.searchGame("zoltar");
        topMenuBlock.launchGameFromSearch();
    }
}
