package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.quackit.com/javascript/javascript_alert_box.cfm");
		driver.switchTo().frame("result1");
		driver.findElement(By.xpath("/html/body/input")).click();
		String msg=driver.switchTo().alert().getText();
		System.out.println(msg);
		driver.switchTo().alert().accept();
	}

}
