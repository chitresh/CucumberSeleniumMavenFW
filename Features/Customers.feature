Feature: Customers
  Background: Below are the common steps for each scenario

  Scenario: Add a new Customer
    Given User launches a Chrome Browser
    When User Opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters email as "admin@yourstore.com" and Password as "admin"
    And User hits login button
    Then User can view Dashboard
    When User clicks on Customers Menu
    And User clicks on Customer Menu Item
    And User clicks on Add new button
    Then User can view Add a new customer page
    When User enters Customer info
    And User clicks on Save button
    Then User can view conformation message ""
    And close Browser