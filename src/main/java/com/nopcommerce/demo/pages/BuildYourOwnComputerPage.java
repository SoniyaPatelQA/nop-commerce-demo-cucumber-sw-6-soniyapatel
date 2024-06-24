package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class);

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processorDropDown;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ramDropDown;

    @CacheLookup
    @FindBy(xpath = "//ul[@data-attr='3']//li/label")
    List<WebElement> hddOptions;

    @CacheLookup
    @FindBy(xpath = "//ul[@data-attr='4']//li/label")
    List<WebElement> osOptions;

    @CacheLookup
    @FindBy(xpath = "//ul[@data-attr='5']//li/label")
    List<WebElement> softwareOptions;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement notificationMessage;


    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
        log.info("Click on add to cart button");

    }

    public String getNotificationMessage() {
        log.info("Get notification message");
        return getTextFromElement(notificationMessage);
    }

    public void selectOptionFromProcessorDropDown(String processorValue) {
        selectByVisibleTextFromDropDown(processorDropDown, processorValue);
        log.info("Select value '" + processorValue + "' from processor dropdown");
    }

    public void selectOptionFromRamDropDown(String ramValue) {
        selectByVisibleTextFromDropDown(ramDropDown, ramValue);
        log.info("Select value '" + ramValue + "' from ram dropdown" + ramDropDown.toString());
    }

    /**
     * this method click on HDD option
     *
     * @param option
     */

    public void selectHddOption(String option) {
        List<WebElement> hddOption = webElementList(hddOptions);
        for (WebElement e : hddOption) {
            if (e.getText().equalsIgnoreCase(option)) {
                e.click();
            }
        }
        log.info("Select value '" + option + "' from HDD radio" + hddOption.toString());
    }


    /**
     * this method click on OS option
     *
     * @param option
     */
    public void selectOsOption(String option) {
        List<WebElement> osOption = webElementList(osOptions);
        for (WebElement e : osOption) {
            if (e.getText().equalsIgnoreCase(option)) {
                e.click();
            }
        }
        log.info("Select value '" + option + "' from OS radio" + osOption.toString());
    }

    /**
     * this method select software checkbox option
     */

    public void selectSoftwareOption(String option) {
        List<WebElement> softwareOption = webElementList(softwareOptions);
        WebElement optionToSelect = null;

        // Find the option to select
        for (WebElement checkbox : softwareOption) {
            if (checkbox.getText().equalsIgnoreCase(option)) {
                optionToSelect = checkbox;
                break;
            }
        }

        // Deselect all options except the default selected option in the first set of test data
        for (WebElement checkbox : softwareOption) {
            if (checkbox.isSelected()) {
                if (optionToSelect == null || !checkbox.getText().equalsIgnoreCase(option)) {
                    checkbox.click();
                }
            }
        }

        // Select the desired option if found and not already selected
        if (optionToSelect != null && !optionToSelect.isSelected()) {
            optionToSelect.click();
        } else {
            System.out.println("Option not found or already selected: " + option);
        }
        log.info("Select value '" + option + "' from Software checkbox" + softwareOption.toString());
    }
}
