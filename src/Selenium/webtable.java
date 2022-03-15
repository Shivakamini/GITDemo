package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/WebTable.html");
		driver.manage().window().maximize();
		WebElement S=driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]"));
		System.out.println(S.getText());
		List<WebElement> rows=driver.findElements(By.xpath("/html/body/table/tbody/tr"));
		System.out.println(rows.size());
		List<WebElement> headrs=driver.findElements(By.xpath("/html/body/table/tbody/tr/th"));
		System.out.println(headrs.size());
		for(int i=2;i<=rows.size();i++)
		{
			List<WebElement> cols=driver.findElements(By.xpath("/html/body/table/tbody/tr["+i+"]/td"));
			System.out.println(cols.size());
			for(int j=1;j<=cols.size();j++)
			{
			WebElement cell=driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]"));
			System.out.println(cell.getText());
			}
		}
	}
	}
