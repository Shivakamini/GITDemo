package TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DepTest 
{
	public WebDriver driver;
  @Test
  public void f()
  {
	  System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  System.out.println(driver.getTitle());
	  }
}
