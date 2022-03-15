package Seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SELECT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		WebElement Cat=driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select S=new Select(Cat);
		S.selectByVisibleText("Baby");
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("LG");
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		driver.findElement(By.xpath("//h3[@class='s-item__title']")).click();
	}

}
