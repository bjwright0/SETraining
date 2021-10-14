package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends CommonPage {

	
	
	public HomePage (WebDriver driver) {
		super(driver);
		driver.get("https://www.kijiji.ca/");
		
	}
	
	public void setSearchbox (String searchValue) {
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='SearchKeyword']"));
		searchBox.click();
		searchBox.sendKeys(searchValue);
	}
	
	public void clickSearchBtn() {
		driver.findElement(By.xpath("//button[@name='SearchSubmit']")).click();
	}

}
