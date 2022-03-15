package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
public class Mouserightclick {
	public static void main(String[] args) throws AWTException
	{
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		StringSelection str=new StringSelection("Selenium");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);
		WebElement txt=driver.findElement(By.name("q"));
		Actions a=new Actions(driver);
		a.contextClick(txt);
		a.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER);
	    a.build().perform();
		/*Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);*/
		
		
	}

}
