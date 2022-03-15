package TestNG;
import org.junit.Test;
import org.openqa.selenium.By;

public class DependancyTest extends DepTest
{
  @Test
  public void A() 
  {
	driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("LG");
			
  }
}
