package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerPageSteps {

    //Click on Computer tab
    @When("I click on Computer tab")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputerTab();
    }

    //Verify "Computer" text
    @Then("I should see {string} text on ComputerPage")
    public void iShouldSeeTextOnComputerPage(String computerText) {
        Assert.assertEquals(new ComputerPage().getComputerText(), computerText, "Computer text is not match");
    }

    //Click on Desktops link
    @And("I click on Desktops link")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktopsLink();
    }

    //Verify "Desktops" text
    @Then("I should see {string} text on DesktopPage")
    public void iShouldSeeTextOnDesktopPage(String deskTopText) {
        Assert.assertEquals(new DesktopsPage().getDeskTopsText(), deskTopText, "DeskTopText is not displayed");
    }

    //Click on product name "Build your own computer"
    @And("I click on product name Build your own computer")
    public void iClickOnProductNameBuildYourOwnComputer() {
        new DesktopsPage().clickOnBuildYourOwnComputer();
    }

    //Select processor "processor"
    @And("I select processor {string}")
    public void iSelectProcessor(String processorValue) {
        new BuildYourOwnComputerPage().selectOptionFromProcessorDropDown(processorValue);
    }

    //Select RAM "ram"
    @And("I select RAM {string}")
    public void iSelectRAM(String ramValue) {
        new BuildYourOwnComputerPage().selectOptionFromRamDropDown(ramValue);
    }

    //Select HDD "hdd"
    @And("I select HDD {string}")
    public void iSelectHDD(String hddOption) {
        new BuildYourOwnComputerPage().selectHddOption(hddOption);
    }

    //Select OS "os"
    @And("I select OS {string}")
    public void iSelectOS(String osOption) {
        new BuildYourOwnComputerPage().selectOsOption(osOption);
    }

    //Select Software "software"
    @And("I select Software {string}")
    public void iSElectSoftware(String softwareOption) {
        new BuildYourOwnComputerPage().selectSoftwareOption(softwareOption);
    }

    //Click on "ADD TO CART" Button
    @And("I click on ADD TO CART Button")
    public void iClickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    //Verify message "The product has been added to your shopping cart"
    @Then("Verify notification text  {string} should displayed")
    public void verifyNotificationTextShouldDisplayed(String notificationText) {
        Assert.assertTrue(new BuildYourOwnComputerPage().getNotificationMessage().contains(notificationText), "notification text is not match");
    }

}
