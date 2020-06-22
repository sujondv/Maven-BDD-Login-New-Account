package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SideNavigationPage {
	
	WebDriver driver;
	
	//constructor
	public SideNavigationPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	//Element Library
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Bank & Cash')]")
	WebElement BANK_CASH_LOCATOR;
	@FindBy(how = How.LINK_TEXT, using = "New Account")
	WebElement NEW_ACCOUNT_LOCATOR;
	
	public void newAccountPage() throws InterruptedException {
		
		Thread.sleep(3000);
		BANK_CASH_LOCATOR.click();
		Thread.sleep(3000);
		NEW_ACCOUNT_LOCATOR.click();
	}

}
