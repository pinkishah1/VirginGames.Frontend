package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Accept']")
    WebElement acceptCookies;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Join Now']")
    WebElement joinNowButton;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome to Virgin Games')]")
    WebElement text;

    public void clickOnJoinNowButton(){
        clickOnElement(joinNowButton);
    }

    public void clickOnCookies(){
        clickOnElement(acceptCookies);
    }

    public String getTextFromPage(){
        log.info("Welcome Text" + text);
        return getTextFromElement(text);
    }
}
