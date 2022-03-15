package Seleniumpractise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	private static final String Outputtype = null;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		File fsource=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File fdest=new File("F:\\Practice\\Sample.png");
		FileUtils.copyFile(fsource, fdest);
	}

}
