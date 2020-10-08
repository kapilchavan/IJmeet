Feature: Verify Sign Up page

  Background: Verify user navigates to Sign Up page
    Given launch chrome browser
    When Opens URL "https://ijmeet.com/"
    And Check visibility of Sign Up button
    Then Click on Sign Up button
    Then Navigate to Sign Up Page

  Scenario: Verify user navigates to google account
    When Click on Sign in with google account button
    Then navigates to google account

  Scenario: Verify user navigates to facebook account
    When Click on Sign in with facebook button
    Then navigates to facebook login page

  Scenario: Verify when user already have an ijmeet account, when click on Log in link page redirect to Sign In screen
    When Click on Log in link
    Then navigates to Sign In page
