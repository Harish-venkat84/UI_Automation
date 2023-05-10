@Login_page
Feature: To Login Functionality
  ------------

  Scenario: Login Functionality
    Given user Must Launch Url In The Url Field
    When user Enter The Username In The Username Field
    And user Enter The Password In The Password Field
    And user must unselect default business unit
    And user Click The Singin Botton and It Navigates To The Netmeds RWOS Page
    Then user if already login click the yes botton

  Scenario: Select Business Unit
    Given User Must Select Common Business Unit
    When user click the process button