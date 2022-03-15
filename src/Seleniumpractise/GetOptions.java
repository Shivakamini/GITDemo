package Seleniumpractise;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Scanner S=new Scanner(System.in);
		System.out.println("enter category");
		String cat=S.nextLine();
		System.out.println("Enter product");
		String prod=S.nextLine();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		WebElement dd=driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select Sl=new Select(dd);
	    boolean isExists=false;
	    List<WebElement> items=Sl.getOptions();
	    for(WebElement item:items)
	    {
	    	isExists=item.getText().equalsIgnoreCase(cat);
	    		if(isExists==true)
	    		{
	    			Sl.selectByVisibleText(item.getText());
	    			driver.findElement(By.id("gh-ac")).sendKeys(prod);
	    			driver.findElement(By.id("gh-btn")).click();
	    			break;
	    		}
	    		if(isExists==false)
	    		{
	    			System.out.println("Not available");
	    		}
	    	}
	    }
	
	
	    
	}

