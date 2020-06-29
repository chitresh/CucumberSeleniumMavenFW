Feature:
  @sanity
  Scenario: Successful login with Valid credentials
    Given User launches a Chrome Browser
    When User Opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters email as "admin@yourstore.com" and Password as "admin"
    And User hits login button
    Then Page title should be "Dashboard / nopCommerce administration"
    When User clicks on Logout
    Then Page title should be "Your store. Login"
    And close browser
    @sanity
   Scenario Outline: Data Driven Login
    Given User launches a Chrome Browser
    When User Opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters email as "<email>" and Password as "<password>"
    And User hits login button
    Then Page title should be "Dashboard / nopCommerce administration"
    When User clicks on Logout
    Then Page title should be "Your store. Login"
    And close browser

    Examples:
      | email               | password |
      | admin@yourstore.com | admin    |
      | admi@fas.com        | addw     |

      @regression
  Scenario: Successful login with Valid credentials
    Given User launches a Chrome Browser
    When User Opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters email as "chris@yourstore.com" and Password as "aasda"
    And User hasdad
    Then Page title should be "Dashboard / nopCommerce administration"
    When User clicks on Logout
    Then Page asddasds should be "Your store. Login"
