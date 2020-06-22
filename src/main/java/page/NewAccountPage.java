package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewAccountPage extends BasePage{
	
	WebDriver driver;

	// Constructor 
	public NewAccountPage(WebDriver driver) {
		super.driver = driver;
	}
	
	//Elements Library
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement ACCOUNT_TITLE_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement DESCRIPTION_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement INITIAL_BALANCE_LOCATOR;
	@FindBy(how = How.XPATH, using = "//div[@class='form-group']/following-sibling::button[@type='submit']")
	WebElement SUBMIT_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Accounts ')]")
	WebElement ACCOUNTS_LOCATOR;
	
	//Methods
	public void accountTitle(String title) {
		ACCOUNT_TITLE_LOCATOR.sendKeys(title);
	}
	public void inputDescription(String description) {
		DESCRIPTION_LOCATOR.sendKeys(description);
	}
	public void initialBalance(String balance) {
		INITIAL_BALANCE_LOCATOR.sendKeys(balance);
	}
	public void clickOnSubmitButton() {
		SUBMIT_BUTTON_LOCATOR.click();
	}
	public boolean isAccountsDisplayed() {
		return ACCOUNTS_LOCATOR.isDisplayed();
		
	}

}
