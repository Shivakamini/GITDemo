package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGBasic {
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.ebay.com");
	  System.out.println(driver.getTitle());
	  }
}
