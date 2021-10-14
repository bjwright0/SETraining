package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//chromedriver");
		WebDriver driver = new ChromeDriver();


		HomePage homepage = new HomePage(driver);
		homepage.setSearchbox("Honda Insight");
		homepage.clickSearchBtn();
	}

}
