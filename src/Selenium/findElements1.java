package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;
import java.util.List;
import org.openqa.selenium.By;

public class findElements1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Scanner S=new Scanner(System.in);
		System.out.println("Enter Link");
		String sllink=S.next();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		driver.getTitle();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		boolean isExists=false;
		for(WebElement l:links)
		{
			isExists=l.getText().equalsIgnoreCase(sllink);
			if(isExists==true)
			{
				l.click();
			}
			if(isExists==false)
			{
			System.out.println("Mismatch");	
			}
		}

	}

}
