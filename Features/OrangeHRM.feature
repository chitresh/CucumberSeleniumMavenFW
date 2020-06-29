Feature: OrangeHRMLogin

  Scenario: Logo Present on ORANGEHRM Home page
    Given I launch chrome browser
    When I open OrangeHRM Homepage
    Then I verify that the logo present on homepage
    And Close browser