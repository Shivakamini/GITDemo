package Seleniumpractise;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		Scanner S=new Scanner(System.in);
		System.out.println("enter link to be selected");
		String SLink=S.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("no.of links opened"+"=>"+links.size());
		boolean isExists=false;
		for(WebElement l:links)
		{
			System.out.println(l.getText());//to dispaly all links texts;
			isExists=l.getText().equalsIgnoreCase(SLink);
            if(isExists==true)
			{
				l.click();
				System.out.println("SHIVA");
				break;
			}
            if(isExists==false)
			{
			System.out.println("Mismatch");	
			}

		}
	}
}
