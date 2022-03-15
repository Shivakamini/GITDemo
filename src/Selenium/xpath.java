package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement cat=driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
		Select S=new Select(cat);
		S.selectByIndex(15);	
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("LG");
		driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]")).click();
		
		

	}

}
