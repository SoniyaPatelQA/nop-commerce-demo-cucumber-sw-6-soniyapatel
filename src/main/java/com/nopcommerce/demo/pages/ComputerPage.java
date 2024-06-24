package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class);

    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement computerText;

    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Desktops']")
    WebElement desktopsLink;


    public String getComputerText() {
        log.info("Get computer text " + computerText.getText());
        return getTextFromElement(computerText);
    }

    public void clickOnDesktopsLink() {
        clickOnElement(desktopsLink);
        log.info("click on desktops link" + desktopsLink.toString());
    }
}
