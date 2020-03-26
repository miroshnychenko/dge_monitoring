package com.betamerica.blocks;

import org.openqa.selenium.WebDriver;

public class AbstractBlock {

    protected WebDriver driver;

    public AbstractBlock(WebDriver driver) {
        this.driver = driver;
    }
}
