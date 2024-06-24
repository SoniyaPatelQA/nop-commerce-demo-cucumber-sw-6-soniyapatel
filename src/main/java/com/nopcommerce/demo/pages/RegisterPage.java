package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class);

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement maleRadio;

    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement femaleRadio;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dayFromDateOfBirthDropdown;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement monthFromDateOfBirthDropdown;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement yearFromDateOfBirthDropdown;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;

    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameFieldErrorMessage;

    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameFieldErrorMessage;

    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailFieldErrorMessage;

    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement passwordFieldErrorMessage;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement successfulRegistrationMessage;


    public String getRegisterText() {
        log.info("Get register text " + registerText.getText());
        return getTextFromElement(registerText);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        log.info("Click on register button" + registerButton.toString());
    }

    public String getFirstNameFieldErrorMessage() {
        log.info("Get firstname field error message " + firstNameFieldErrorMessage.getText());
        return getTextFromElement(firstNameFieldErrorMessage);
    }

    public String getLastNameFieldErrorMessage() {
        log.info("Get lastname field error message " + lastNameFieldErrorMessage.getText());
        return getTextFromElement(lastNameFieldErrorMessage);
    }

    public String getEmailFieldErrorMessage() {
        log.info("Get email field error message " + emailFieldErrorMessage.getText());
        return getTextFromElement(emailFieldErrorMessage);
    }

    public String getPasswordFieldErrorMessage() {
        log.info("Get password field error message " + passwordFieldErrorMessage.getText());
        return getTextFromElement(passwordFieldErrorMessage);
    }

    public void clickOnFemaleGenderRadioButton() {
        clickOnElement(femaleRadio);
        log.info("Click on Female option from Gender radio button " + femaleRadio.toString());
    }

    public void enterTextToFirstName(String firstnameText) {
        sendTextToElement(firstName, firstnameText);
        log.info("Enter firstname" + firstnameText + " to firstname field " + firstName.toString());
    }

    public void enterTextToLastName(String lastnameText) {
        sendTextToElement(lastName, lastnameText);
        log.info("Enter lastname " + lastnameText + " to lastname field " + lastName.toString());
    }

    public void selectDayFromDateOfBirthDropdown(String dayValue) {
        selectByVisibleTextFromDropDown(dayFromDateOfBirthDropdown, dayValue);
        log.info("Select day value '" + dayValue + "' from Date of birth dropdown " + dayFromDateOfBirthDropdown.toString());
    }

    public void selectMonthFromDateOfBirthDropdown(String monthValue) {
        selectByVisibleTextFromDropDown(monthFromDateOfBirthDropdown, monthValue);
        log.info("Select month value '" + monthValue + "' from Date of birth dropdown " + monthFromDateOfBirthDropdown.toString());
    }

    public void selectYearFromDateOfBirthDropdown(String yearValue) {
        selectByVisibleTextFromDropDown(yearFromDateOfBirthDropdown, yearValue);
        log.info("Select year value '" + yearValue + "' from Date of birth dropdown " + yearFromDateOfBirthDropdown.toString());
    }

    public void enterTextToEmail(String emailText) {
        sendTextToElement(email, emailText);
        log.info("Enter email" + emailText + " to email field " + email.toString());
    }

    public void enterTextToPassword(String passwordText) {
        sendTextToElement(password, passwordText);
        log.info("Enter password '" + passwordText + "' to password field " + password.toString());
    }

    public void enterTextToConfirmPassword(String confirmPasswordText) {
        sendTextToElement(confirmPassword, confirmPasswordText);
        log.info("Enter confirm password '" + confirmPasswordText + "' to password field " + confirmPassword.toString());
    }

    public String getRegisterSuccessMessage() {
        log.info("Get registration successful message " + successfulRegistrationMessage.getText());
        return getTextFromElement(successfulRegistrationMessage);
    }

}
