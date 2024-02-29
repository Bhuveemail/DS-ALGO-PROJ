@homePage @regression 
Feature: Verify the homepage functionalities

    
 @home_page_negative
  Scenario Outline: Verify Negative scenario without logged in
    Given I Launch the Application
    Then I verify the error message when click on Data structure options Randomly without logged in
    Then I verify the error message when click on Data structure options by order without logged in
    Then I verify the error message when click on Get Started options Randomly without logged in
    Then I verify the error message when click on Get Started options by order without logged in
    
    