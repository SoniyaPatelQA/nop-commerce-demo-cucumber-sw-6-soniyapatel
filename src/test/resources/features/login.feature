Feature: Login Feature
  In Order to perform successful login
  As a user
  I have to enter correct username and password

  @author_SoniyaPatel @smoke @sanity @regression
  Scenario: Verify User Should Navigate To Login Page Successfully
    Given I am on homepage
    When I click on login link
    Then "Welcome, Please Sign In!" message should display

  @author_SoniyaPatel @smoke  @regression
  Scenario: Verify the error message with invalid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "primez123@gmail.com"
    And I enter password "prime123"
    And I click on login button
    Then  user should not login and <errorMessage>  should display
      | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |

  @author_SoniyaPatel  @regression
  Scenario: verify that user should login successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "testfnsln910@gmail.com"
    And I enter password "test@123"
    And I click on login button
    Then Logout link should display

  @author_SoniyaPatel  @regression
  Scenario:Verify that user should logout successfully
    Given I am on homepage
    When I click on login link
    And I enter email "testfnsln910@gmail.com"
    And I enter password "test@123"
    And I click on login button
    And I click on Logout link
    Then LogIn link should display
