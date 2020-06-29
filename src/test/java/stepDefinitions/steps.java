package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;

public class steps extends BaseClass {



    @Given("User launches a Chrome Browser")
    public void user_launches_a_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "D:\\personal\\LEarning\\QA\\chromedriver.exe");
        driver = new ChromeDriver();
        lp = new LoginPage(driver);

    }

    @When("User Opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
    }

    @When("User enters email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) {
            lp.setUsername(email);
            lp.setPassword(password);
    }

    @When("User hits login button")
    public void user_hits_login_button() {
            lp.loginClick();
    }

    @Then("Page title should be {string}")
    public void page_title_should_be_dashboard_nop_commerce_news(String title) {
            String titleonpage = driver.getTitle();
            Assert.assertEquals(title, titleonpage);
    }

    @When("User clicks on Logout")
    public void user_clicks_on_logout() throws InterruptedException {
        lp.logoutClick();
        Thread.sleep(3000);

    }


    @Then("close browser")
    public void close_browser() {
        driver.quit();
    }

    //Customer Feature Step Definition

    @Then("User can view Dashboard")
    public void user_can_view_dashboard() {
        addCust = new AddCustomerPage(driver);
        Assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPageTitle());
    }

    @When("User clicks on Customers Menu")
    public void user_clicks_on_customers_menu() {
        addCust.clickOnCustomersMenu();

    }

    @When("User clicks on Customer Menu Item")
    public void user_clicks_on_customer_menu_item() {
        addCust.clickOnCustomersMenuItem();
    }

    @When("User clicks on Add new button")
    public void user_clicks_on_add_new_button() {
        addCust.clickOnAddnew();
    }

    @Then("User can view Add a new customer page")
    public void user_can_view_add_a_new_customer_page() {
        Assert.assertEquals("",addCust.getPageTitle());
    }

    @When("User enters Customer info")
    public void user_enters_customer_info() {
        String email = randomestring()+"@gmail.com";
        addCust.setEmail(email);
        addCust.setPassword("134");
        addCust.setAdminContent("Test");
        addCust.setFirstName("Chris");

    }

    @When("User clicks on Save button")
    public void user_clicks_on_save_button() throws InterruptedException {
        addCust.clickOnSave();
        Thread.sleep(3000);
    }

    @Then("User can view conformation message {string}")
    public void user_can_view_conformation_message(String string) {

    }


}
