package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebCalender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in");
		WebElement W=driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label"));
		W.click();
		//Select S=new Select(driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")));		
		//S.selectByVisibleText("Aug 2019");
		for(int i=6;i>=1;i--)
		{
		driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
		String month=driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText();
		if(month.equals("Nov 2019"))
		{
			WebElement link=driver.findElement(By.linkText("15"));
			link.click();
			break;
		}
		}
		
}
}