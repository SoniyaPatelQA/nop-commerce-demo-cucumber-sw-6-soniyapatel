package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);

    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(linkText = "Log out")
    WebElement logOutLink;

    @CacheLookup
    @FindBy(linkText = "Computers")
    WebElement computerTab;

    public void clickOnComputerTab() {
        clickOnElement(computerTab);
        log.info("Click on computer tab " + computerTab.toString());
    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Click on login link " + loginLink.toString());
    }

    public String getLogOutText() {
        log.info("Get logout text " + logOutLink.getText());
        return getTextFromElement(logOutLink);
    }

    public String getLoginText() {
        log.info("Get login text " + loginLink.getText());
        return getTextFromElement(loginLink);
    }

    public void clickOnLogoutLink() {
        clickOnElement(logOutLink);
        log.info("Click on logout link " + logOutLink.toString());
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Click on register link " + registerLink.toString());
    }

}
