package TestNGG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupTest {
	
      @Test(groups={"XY"})
	  public void D()
	  {
		  System.out.println("LIFE");
	  }
	  @Test(groups={"XX"})
	  public void S()
	  {
		  System.out.println("ENJOY");
	  }
	  @Test(groups={"XY"})
	  public void P()
	  {
		  System.out.println("Brave");
	  }
	}
