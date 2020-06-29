package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMSteps {

    WebDriver driver;
    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {

        System.setProperty("webdriver.chrome.driver", "D:\\personal\\LEarning\\QA\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @When("I open OrangeHRM Homepage")
    public void i_open_orange_hrm_homepage()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Then("I verify that the logo present on homepage")
    public void i_verify_that_the_logo_present_on_homepage()
    {

        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed());

    }

    @Then("Close browser")
    public void close_browser() {
        driver.quit();

    }

}
