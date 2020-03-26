package com.betamerica;

import com.betamerica.blocks.casino.CasinoGridBlock;
import com.betamerica.blocks.HeaderBlock;

import com.betamerica.blocks.LoginBlock;
import com.betamerica.blocks.casino.TopMenuBlock;
import com.betamerica.core.PropertiesCache;
import com.betamerica.core.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginAndLaunchZoltar extends TestBase {

    private String url = String.valueOf(PropertiesCache.getProperty("env.casinoUrl"));
    private String username = String.valueOf(PropertiesCache.getProperty("login.username"));
    private String password = String.valueOf(PropertiesCache.getProperty("login.password"));


    @Test
    public void loginAndLaunchZoltarTest() throws InterruptedException {
        driver.get(url);

        HeaderBlock headerBlock = new HeaderBlock(driver);
        headerBlock.clickLoginButton();

        LoginBlock loginBlock = new LoginBlock(driver);
        loginBlock.submitLoginForm(username, password);
        Thread.sleep(5000);

        TopMenuBlock topMenuBlock = new TopMenuBlock(driver);
        topMenuBlock.clickSearchButton();
        topMenuBlock.searchGame("zoltar");
        topMenuBlock.launchGameFromSearch();
    }
}
