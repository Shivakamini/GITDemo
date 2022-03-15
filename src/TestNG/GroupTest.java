package TestNG;

import org.testng.annotations.Test;

public class GroupTest
{
	@Test(groups="XY")
	  public void A()
	  {
		 System.out.println("Shiva");  
	  }
	  @Test(groups="XX")
	  public void B()
	  {
		 System.out.println("Confident");
	  }
	  @Test(groups="XY")
	  public void C()
	  {
		 System.out.println("MyLife");	
	  }
	}
  
