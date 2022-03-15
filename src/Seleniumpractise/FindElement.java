package Seleniumpractise;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		System.out.println(driver.getTitle());
		WebElement Search=driver.findElement(By.xpath("//input[@name='q']"));
		Search.sendKeys("HP Laptop");
		WebElement btn=driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		btn.click();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("no.of links opened"+"=>"+links.size());
		boolean isExists=false;
		for(WebElement l:links)
		{
			System.out.println(l.getText());
		}
				
}
}