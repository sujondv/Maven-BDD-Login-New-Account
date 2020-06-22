package page;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	WebDriver driver;
	
	public void closeEverything() {
		
		driver.close();
		driver.quit();
	}

}
