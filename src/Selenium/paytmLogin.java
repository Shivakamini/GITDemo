package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class paytmLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.paytm.com");
		driver.manage().window().maximize();
		System.out.println("YES");
		driver.findElement(By.xpath("//input[@id='radio1']")).click();
		System.out.println("YES");
		//Actions s = new Actions(driver);
		//s.moveToElement(driver.findElement(By.xpath("//input[@id='radio0']"))).click();
		//System.out.println("YES");

	}

}
		