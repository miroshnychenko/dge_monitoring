package com.betamerica.blocks.casino;

import com.betamerica.blocks.AbstractBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CasinoGridBlock extends AbstractBlock {

    @FindBy(how = How.CSS, using = "div[data-game-title=\"Shamrock Spin\"] .sb-src-components-sbtech-cas-component-gamegrid-_index__play")
    public WebElement shamrockSpinPlayButton;

    public CasinoGridBlock(WebDriver driver) {
        super(driver);
    }

    public void launchGame(WebElement element) {
        element.click();
    }

}
