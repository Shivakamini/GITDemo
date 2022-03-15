package Selenium;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.paytm.com");
		File fsource = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File fdest=new File("C:/Users/Shiva/Desktop/729776/paytmselenium1.PNG");
		FileUtils.copyFile(fsource, fdest);
		
		
	}

}
