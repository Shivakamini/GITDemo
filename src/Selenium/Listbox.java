package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement W=driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
		//Select s=new Select(W);
		List<WebElement> MS=driver.findElements(By.tagName("a"));
		Actions a=new Actions(driver);
	    a.keyDown(Keys.CONTROL).click(MS.get(1));
	    a.build().perform();
		//s.selectByIndex(12);
		////driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Men Shirts");
		driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();
		//WebElement M=driver.findElement(By.xpath("//*[@id='leftNav']/h4[9]"));
		//List<WebElement> MS=driver.findElements(By.tagName("a"));
	    //Actions a=new Actions(driver);
	    //a.keyDown(Keys.CONTROL).click(MS.get(1)).click(MS.get(4));
	   // a.build().perform();
				
		
		
	}

}
