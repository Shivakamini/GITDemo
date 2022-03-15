package TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import junit.framework.Assert;

public class DependancyTest2 extends DepTest
{
  @Test(dependsOnMethods="CheckTitle")
  public void A()
  {
	  System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
	  driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("LG");
	  driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();
	  
  }
  @Test
  public void CheckTitle()
  {
	  String Title=driver.getTitle();
	  Assert.assertEquals(Title,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
  }
}
