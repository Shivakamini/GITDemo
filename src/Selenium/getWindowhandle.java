package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class getWindowhandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.getTitle();
		String id=driver.getWindowHandle();
		System.out.println(id +"==>"+driver.getTitle());
		Set<String> IDs=driver.getWindowHandles();
		for(String ID:IDs)
		{
			driver.switchTo().window(ID);
			System.out.println("No.of windows opened"+IDs.size());
			System.out.println(ID+"==>"+driver.getTitle());
			
		}
		
		
		

	}

}
