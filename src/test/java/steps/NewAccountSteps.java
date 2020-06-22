package steps;

import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.BasePage;
import page.LoginPage;
import page.NewAccountPage;
import page.SideNavigationPage;
import util.BrowserFactory;

public class NewAccountSteps extends TestBase {

	WebDriver driver;
	LoginPage loginPage;
	SideNavigationPage sideNavigationPage;
	NewAccountPage newAccountPage;

	@Before
	public void startFirst() throws InterruptedException {
		driver = BrowserFactory.launchBrowser();
		Thread.sleep(3000);
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		sideNavigationPage = PageFactory.initElements(driver, SideNavigationPage.class);
		newAccountPage = PageFactory.initElements(driver, NewAccountPage.class);
	}

	@Given("^a user with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void a_user_with_username_and_password(String username, String password) throws InterruptedException {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
		loginPage.clickOnSignInButton();
		Thread.sleep(3000);
	}

	@When("^user goes to new account page$")
	public void user_goes_to_new_account_page() throws InterruptedException {
		sideNavigationPage.newAccountPage();
		Thread.sleep(3000);
	}

	@When("^create new account with title \"([^\"]*)\" description \"([^\"]*)\" balance \"([^\"]*)\"$")
	public void create_new_account_with_title_description_balance(String title, String description, String balance)
			throws Exception {
		newAccountPage.accountTitle(title + new Random().nextInt(9999));
		newAccountPage.inputDescription(description);
		newAccountPage.initialBalance(balance);
		newAccountPage.clickOnSubmitButton();
		Thread.sleep(3000);
		screenShot(driver, "C:\\Users\\ARIF RAHMAN\\Desktop\\ScreenShot\\screenshot.jpg");
	}

	@Then("^new account should be created$")
	public void new_account_should_be_created() {
		
		newAccountPage = PageFactory.initElements(driver, NewAccountPage.class);
		Assert.assertTrue("Account did not add successfully", newAccountPage.isAccountsDisplayed());
		newAccountPage.closeEverything();
	}

	
}
