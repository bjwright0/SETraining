package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Training {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.ca");
		WebElement el = driver.findElement(By.xpath("//*[@data-pid='23']"));
		System.out.println(el.getText());
		System.out.println(el.getTagName());
	}

}
