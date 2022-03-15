package Selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class select1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Scanner S=new Scanner(System.in);
		System.out.println("Enter Category");
		String slcat=S.next();
		System.out.println("Enter product");
		String slprod=S.next();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		WebElement cat=driver.findElement(By.id("gh-cat"));
		Select s=new Select(cat);
		List<WebElement> cats=s.getOptions();
		boolean isExists=false;
		for(WebElement c:cats)
		{
			isExists=c.getText().equalsIgnoreCase(slcat);
			if(isExists==true)
			{
				c.click();
				driver.findElement(By.id("gh-ac")).sendKeys(slprod);
				driver.findElement(By.id("gh-btn")).click();
			}
			if(isExists==false)
			{
				System.out.println("Mismatch");
			}
		}

	}

}
