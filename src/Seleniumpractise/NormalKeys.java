package Seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NormalKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.getTitle();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("TVs");
		Actions a=new Actions(driver);
		a.sendKeys(Keys.ENTER);
		a.build().perform();
		a.sendKeys(Keys.PAGE_DOWN).moveToElement(driver.findElement(By.className("a-size-medium a-color-base a-text-normal"))).click();
	}

}
