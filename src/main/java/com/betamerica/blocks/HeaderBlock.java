package com.betamerica.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HeaderBlock extends AbstractBlock {

    @FindBy(how = How.CLASS_NAME, using = "page-header-login-button")
    private WebElement loginButton;

    public HeaderBlock(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

}
