Feature: Computer Page functionality

@author_SoniyaPatel @smoke @sanity @regression
  Scenario: Verify User Should Navigate To ComputerPage Successfully
    Given I am on homepage
    When I click on Computer tab
    Then I should see "Computers" text on ComputerPage

  @author_SoniyaPatel @smoke  @regression
  Scenario: Verify User Should Navigate To DesktopsPage Successfully
    Given I am on homepage
    When I click on Computer tab
    And I click on Desktops link
    Then I should see "Desktops" text on DesktopPage

  @author_SoniyaPatel  @regression
  Scenario Outline: Verify That User Should Build Your Own Computer And Add Then To Cart Successfully
    Given I am on homepage
    When I click on Computer tab
    And I click on Desktops link
    And I click on product name Build your own computer
    And I select processor "<processor>"
    And I select RAM "<ram>"
    And I select HDD "<hdd>"
    And I select OS "<os>"
    And I select Software "<software>"
    And I click on ADD TO CART Button
    Then Verify notification text  "The product has been added to your shopping cart" should displayed
    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |
