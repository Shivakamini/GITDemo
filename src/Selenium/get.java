package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://ebay.com");
		driver.navigate().back();
		driver.close();

	}

}
