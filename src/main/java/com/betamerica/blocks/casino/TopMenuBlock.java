package com.betamerica.blocks.casino;

import com.betamerica.blocks.AbstractBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TopMenuBlock extends AbstractBlock {

    @FindBy(how = How.CSS, using = "div[data-id=\"TopMenuSearch\"]")
    private WebElement searchButton;

    @FindBy(how = How.CLASS_NAME, using = "sb-src-components-sbtech-cas-widget-search-_index__search-wrapper__string-wrapper__input-wrapper__input")
    private WebElement searchInput;

    public TopMenuBlock(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, TopMenuBlock.class);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void searchGame(String game) {
        searchInput.sendKeys(game);
    }

    public void launchGameFromSearch() {
        WebElement game = driver.findElement(By.cssSelector(".sb-src-components-sbtech-cas-widget-search-_index__search-wrapper__result-wrapper .sb-src-components-sbtech-cas-component-gamegrid-_index__extra"));
        game.click();
    }
}


