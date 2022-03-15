package Seleniumpractise;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String WinID=driver.getWindowHandle();
		System.out.println(WinID);
		//System.out.println(driver.getWindowHandle()+"=>"+driver.getTitle());
		System.out.println(WinID+"=>"+driver.getTitle());
		Set<String> WinIDs=driver.getWindowHandles();
		System.out.println(WinIDs);
		System.out.println("no.of windows opened"+"=>"+WinIDs.size());
		for(String id:WinIDs)
		{
			driver.switchTo().window(id);
			System.out.println(id+"=>"+driver.getTitle());
			boolean isExists=false;
			if(isExists==driver.getTitle().equalsIgnoreCase("Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com"))
			{
				driver.close();
			}
		}
	driver.switchTo().window(WinID);
	System.out.println(WinID+"=>"+driver.getTitle());
	}
	

}
