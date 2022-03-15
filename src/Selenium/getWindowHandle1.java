package Selenium;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandle1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.getTitle();
		String id=driver.getWindowHandle();
		System.out.println(id+"==>"+driver.getTitle());
		Set<String> IDs=driver.getWindowHandles();
		System.out.println("No.of windows opened:"+IDs.size());
		for(String ID:IDs)
		{
			driver.switchTo().window(ID);
			System.out.println(ID+"==>"+driver.getTitle());
			boolean isExists=false;
			if(isExists==driver.getTitle().equalsIgnoreCase("Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com"))
				{
				driver.close();
				}
		}	
		driver.switchTo().window(id);
		System.out.println(driver.getTitle());
		}
	}

