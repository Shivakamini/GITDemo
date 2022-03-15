package TestNG;

import org.testng.annotations.Test;

public class MultiTest
{
  @Test(priority=2,enabled=false)
  public void A()
  {
	 System.out.println("Shiva");  
  }
  @Test(priority=1)
  public void B()
  {
	 System.out.println("Brave");
  }
  @Test(priority=3)
  public void C()
  {
	 System.out.println("MyLife");	
  }
}