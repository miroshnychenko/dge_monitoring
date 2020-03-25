package com.betamerica.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginBlock extends AbstractBlock{

    @FindBy(how = How.CSS, using = "input[data-uat=login-username-input]")
    private WebElement usernameField;

    @FindBy(how = How.CSS, using = "input[data-uat=login-password-input]")
    private WebElement passwordField;

    @FindBy(how = How.CLASS_NAME, using = "user-info__button")
    public WebElement submitButton;

    public LoginBlock(WebDriver driver) {
        super(driver);
    }

    public void submitLoginForm(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        submitButton.click();
    }
}
