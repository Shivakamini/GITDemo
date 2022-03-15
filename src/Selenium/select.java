package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.ebay.com");
	    driver.manage().window().maximize();
		WebElement cat=driver.findElement(By.id("gh-cat"));
		Select S=new Select(cat);
		S.selectByIndex(6);
		driver.findElement(By.id("gh-ac")).sendKeys("LG");;
		driver.findElement(By.id("gh-btn")).click();
	}

}
