package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	// Elements Library
	@FindBy(how = How.ID, using = "username")
	WebElement USERNAME_FIELD_LOCATOR;
	@FindBy(how = How.ID, using = "password")
	WebElement PASSWORD_FIELD_LOCATOR;
	@FindBy(how = How.NAME, using = "login")
	WebElement SIGNINBUTTON;
	@FindBy(how = How.XPATH, using = "//div[@class='col-lg-12']/h2[text()='Dashboard ']")
	WebElement DASHBOARD_LOCATOR;

	// Methods to interact with Elements
	public void enterUserName(String username) {

		USERNAME_FIELD_LOCATOR.sendKeys(username);
	}

	public void enterPassword(String password) {

		PASSWORD_FIELD_LOCATOR.sendKeys(password);
	}

	public void clickOnSignInButton() {

		SIGNINBUTTON.click();

	}
	public boolean isDashboardPageDisplayed() {
		return DASHBOARD_LOCATOR.isDisplayed();
		
	}
	public String loginPageTitle() {
		return driver.getTitle();
	}

}
