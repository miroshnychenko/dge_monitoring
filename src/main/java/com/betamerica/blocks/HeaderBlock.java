package com.betamerica.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HeaderBlock extends AbstractBlock {

    @FindBy(how = How.CLASS_NAME, using = "page-header-login-button")
    private WebElement loginButton;

    public HeaderBlock(WebDriver driver) {
        super(driver);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

}
