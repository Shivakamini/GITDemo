package TestNGG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultiTest {
  @Test(priority=3,enabled=true)
  public void f()
  {
	  System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com");
	  System.out.println("LIFE");
  }
  @Test(priority=1,enabled=false)
  public void L()
  {
	  System.out.println("ENJOY");
  }
  @Test(priority=2,enabled=true)
  public void M()
  {
	  System.out.println("Brave");
  }
}
