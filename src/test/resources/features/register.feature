Feature: Register functionality

  @author_SoniyaPatel @smoke @sanity @regression
  Scenario: User Should Navigate To RegisterPage Successfully
    Given I am on homepage
    When I click on Register link
    Then "Register" text should display

  @author_SoniyaPatel @smoke @regression
  Scenario:verify That FirstName LastName Email Password And Confirm Password Fields Are Mandatory
    Given I am on homepage
    When I click on Register link
    And Click on Register Button
    Then "First name is required." errorMessage should display FirstName mandatory field
    And "Last name is required." errorMessage should display LastName mandatory field
    And "Email is required." errorMessage should display Email mandatory field
    And "Password is required." errorMessage should display Password mandatory field

  @author_SoniyaPatel @regression
  Scenario: User Should Create Account Successfully
    Given I am on homepage
    When I click on Register link
    When I select 'female' gender option
    And I enter firstname "Test FirstName"
    And I enter lastname "Test LastName"
    And I select day "12" from day dropdown field
    And I select month "April" from month dropdown field
    And I select year "1993" from year dropdown field
    And I enter email "testfnsln911@gmail.com" to emailField
    And I enter password "test@123" to passwordField
    And I enter confirmPassword "test@123"
    And I click on Register button
    Then "Your registration completed" message should displayed
