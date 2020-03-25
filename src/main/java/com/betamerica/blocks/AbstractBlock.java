package com.betamerica.blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractBlock {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public AbstractBlock(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 30);
    }
}
