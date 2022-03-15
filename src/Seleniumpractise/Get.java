package Seleniumpractise;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {

	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		driver.navigate().back();
		//String S=driver.getTitle();
		//System.out.println(S);
		System.out.println(driver.getTitle());
	}
}
