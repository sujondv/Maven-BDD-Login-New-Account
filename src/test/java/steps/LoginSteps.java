package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.LoginPage;
import page.NewAccountPage;
import util.BrowserFactory;

public class LoginSteps {

	WebDriver driver;
	LoginPage loginPage;
	NewAccountPage newAccountPage;
	
	@Before
	public void startFirst() {

		loginPage = PageFactory.initElements(driver, LoginPage.class);
		newAccountPage = PageFactory.initElements(driver, NewAccountPage.class);
	}

	@Given("^a valid user goes to techfios site$")
	public void a_valid_user_goes_to_techfios_site() throws InterruptedException {

		driver = BrowserFactory.launchBrowser();
		Thread.sleep(3000);
	}

	@Then("^techfios site should display$")
	public void techfios_site_should_display() throws InterruptedException {
		
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		String expectedTitle = "Login - TechFios Test Application - Billing";
		String actualTitle = loginPage.loginPageTitle();
		Thread.sleep(3000);
		Assert.assertEquals("Title did not match", expectedTitle, actualTitle);

	}

	@When("^user logs in with valid credentials UserName \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_logs_in_with_valid_credentials_UserName_and_Password(String username, String password) {

		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
		loginPage.clickOnSignInButton();

	}

	@Then("^Dashboard page should display$")
	public void dashboard_page_should_display() throws InterruptedException {
		
		Thread.sleep(3000);
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		Assert.assertTrue("Dashboard did not display", loginPage.isDashboardPageDisplayed());
		newAccountPage = PageFactory.initElements(driver, NewAccountPage.class);
		newAccountPage.closeEverything();
	}
	
	

}
