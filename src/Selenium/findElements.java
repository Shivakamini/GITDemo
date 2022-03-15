package Selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		driver.getTitle();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("no. of links opened;"+links.size());
		for(WebElement l:links)
		{
			System.out.println(l.getText());
		}

	}

}
