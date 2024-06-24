package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {

    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    //Click on login link
    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    //verify that "Welcome, Please Sign In!" message display
    @Then("{string} message should display")
    public void messageShouldDisplay(String expectedMessage) {
        Assert.assertEquals(new LoginPage().getWelcomeText(), expectedMessage, "Welcome text message is not displayed");
    }

    //Enter EmailId
    @And("I enter email {string}")
    public void iEnterEmail(String emailText) {
        new LoginPage().enterTextToEmail(emailText);
    }

    //Enter Password
    @And("I enter password {string}")
    public void iEnterPassword(String passwordText) {
        new LoginPage().enterTextToPassword(passwordText);
    }

    //Click on Login Button
    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    //Verify that the Error message
    @Then("user should not login and <errorMessage>  should display")
    public void userShouldNotLoginAndErrorMessageShouldDisplay(String errorMessage) {
        Assert.assertEquals(new LoginPage().getErrorMessageText(), errorMessage, "Error Message is not displayed");
    }

    //Verify that LogOut link is display
    @Then("Logout link should display")
    public void logoutLinkShouldDisplay() {
        Assert.assertEquals(new HomePage().getLogOutText(), "Log out", "Logout link is not displayed");
    }

    //Click on LogOut Link
    @And("I click on Logout link")
    public void iClickOnLogoutLink() {
        new HomePage().clickOnLogoutLink();
    }

    //Verify that LogIn Link Display
    @Then("LogIn link should display")
    public void loginLinkShouldDisplay() {
        Assert.assertEquals(new HomePage().getLoginText(), "Log in", "Log in text is not displayed");
    }


}
