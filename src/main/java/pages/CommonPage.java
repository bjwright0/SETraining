package pages;

import org.openqa.selenium.WebDriver;

public abstract class CommonPage {

	protected WebDriver driver;
	
	public CommonPage (WebDriver driver) {
		this.driver=driver;
		
	}
}
