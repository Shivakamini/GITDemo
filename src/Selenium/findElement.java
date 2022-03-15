package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class findElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.in");
		WebElement search=driver.findElement(By.id("gh-ac"));
		search.sendKeys("LG");
		WebElement btn=driver.findElement(By.id("gh-btn"));
		btn.click();
		//WebElement btn=driver.findElement(By.id("gh-btn")).click();
	}

}
