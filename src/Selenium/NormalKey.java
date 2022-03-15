package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class NormalKey {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("LG");
		Actions a=new Actions(driver);
		a.sendKeys(Keys.ENTER);
		a.build().perform();

	}

}
