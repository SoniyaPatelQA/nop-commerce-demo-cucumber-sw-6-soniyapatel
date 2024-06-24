package com.nopcommerce.demo.steps;

import com.google.common.base.Verify;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {

    //Click on Register Link
    @When("I click on Register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    //Verify "Register" text
    @Then("{string} text should display")
    public void textShouldDisplay(String expectedText) {
        Assert.assertEquals(new RegisterPage().getRegisterText(), expectedText, "Register text is not displayed");
    }

    //Click on "REGISTER" button
    @When("Click on Register Button")
    public void clickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    //Verify the error message "First name is required."
    @Then("{string} errorMessage should display FirstName mandatory field")
    public void errorMessageShouldDisplayFirstNameMandatoryField(String firstNameErrorMsg) {
        Assert.assertEquals(new RegisterPage().getFirstNameFieldErrorMessage(), firstNameErrorMsg, "Error Message is not displayed");
    }

    //Verify the error message "Last name is required."
    @And("{string} errorMessage should display LastName mandatory field")
    public void errorMessageShouldDisplayLastNameMandatoryField(String lastNameErrorMsg) {
        Assert.assertEquals(new RegisterPage().getLastNameFieldErrorMessage(), lastNameErrorMsg, "Error Message is not displayed");
    }

    //Verify the error message "Email is required."
    @And("{string} errorMessage should display Email mandatory field")
    public void errorMessageShouldDisplayEmailMandatoryField(String emailErrorMsg) {
        Assert.assertEquals(new RegisterPage().getEmailFieldErrorMessage(), emailErrorMsg, "Error Message is not displayed");
    }

    //Verify the error message "Password is required."
    @And("{string} errorMessage should display Password mandatory field")
    public void errorMessageShouldDisplayPasswordMandatoryField(String passwordErrorMsg) {
        Assert.assertEquals(new RegisterPage().getPasswordFieldErrorMessage(), passwordErrorMsg, "Error Message is not displayed");
    }

    //Select gender "Female"
    @When("I select 'female' gender option")
    public void iSelectGenderOptionAsFemale() {
        new RegisterPage().clickOnFemaleGenderRadioButton();
    }

    //Enter firstname
    @And("I enter firstname {string}")
    public void iEnterFirstname(String firstNameText) {
        new RegisterPage().enterTextToFirstName(firstNameText);
    }

    //Enter lastname
    @And("I enter lastname {string}")
    public void iEnterLastname(String lastNameText) {
        new RegisterPage().enterTextToLastName(lastNameText);
    }

    //Select day
    @And("I select day {string} from day dropdown field")
    public void iSelectDayFromDayDropdownField(String dayText) {
        new RegisterPage().selectDayFromDateOfBirthDropdown(dayText);
    }

    //Select month
    @And("I select month {string} from month dropdown field")
    public void iSelectMonthFromMonthDropdownField(String monthText) {
        new RegisterPage().selectMonthFromDateOfBirthDropdown(monthText);
    }

    //Select year
    @And("I select year {string} from year dropdown field")
    public void iSelectYearFromYearDropdownField(String yearText) {
        new RegisterPage().selectYearFromDateOfBirthDropdown(yearText);
    }
    //Enter email
    @And("I enter email {string} to emailField")
    public void iEnterEmailToEmailField(String emailText) {
        new RegisterPage().enterTextToEmail(emailText);
    }

    //Enter password
    @And("I enter password {string} to passwordField")
    public void iEnterPasswordToPasswordField(String passwordText) {
        new RegisterPage().enterTextToPassword(passwordText);
    }

    //Enter Confirm Password
    @And("I enter confirmPassword {string}")
    public void iEnterConfirmPassword(String confirmPasswordText) {
        new RegisterPage().enterTextToConfirmPassword(confirmPasswordText);
    }

    //Click on "REGISTER" button
    @And("I click on Register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    //Verify message "Your registration completed"
    @Then("{string} message should displayed")
    public void messageShouldDisplayed(String expectedText) {
        Assert.assertEquals(new RegisterPage().getRegisterSuccessMessage(), expectedText, "registration is not successful");
    }




}
