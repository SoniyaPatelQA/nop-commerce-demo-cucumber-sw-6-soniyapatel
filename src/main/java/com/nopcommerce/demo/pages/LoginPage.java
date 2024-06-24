package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class);

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(className = "login-button")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    public void enterTextToEmail(String emailText) {
        sendTextToElement(emailField, emailText);
        log.info("Enter email " + emailText + " to email field " + emailField.toString());
    }

    public void enterTextToPassword(String passwordText) {
        sendTextToElement(passwordField, passwordText);
        log.info("Enter email " + passwordText + " to email field " + passwordField.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Click on login button " + loginButton.toString());

    }

    public String getWelcomeText() {
        log.info("Get welcome text " + welcomeText.getText());
        return getTextFromElement(welcomeText);
    }

    public String getErrorMessageText() {
        log.info("Get error message " + errorMessage.getText());
        return getTextFromElement(errorMessage);
    }

}
