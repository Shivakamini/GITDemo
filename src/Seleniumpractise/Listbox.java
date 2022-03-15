package Seleniumpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Listbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jquery.com/selectable");
		driver.manage().window().maximize();
		//driver.switchTo().frame(o);
		WebElement list1=driver.findElement(By.id("selectable"));
		List<WebElement> items=list1.findElements(By.tagName("li"));
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL).click(items.get(1)).click(items.get(2));
		a.build().perform();
	}

}
