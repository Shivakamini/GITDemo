package Seleniumpractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	private static final Class NoSuchElementException = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com");
        //============================Implicit Wait=========================================
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        System.out.println("First");
        //============================Explicit wait==========================================
        WebDriverWait W=new WebDriverWait(driver,100);
        W.until(ExpectedConditions.invisibilityOfElementLocated(By.id("gh-ac")));
        System.out.println("Second");
        //============================Fluent Wait===============================================
        FluentWait F=new FluentWait(driver).withTimeout(15, TimeUnit.SECONDS).pollingEvery(15, TimeUnit.SECONDS)
        		.ignoring(NoSuchElementException);
        System.out.println("Third");
        F.until(ExpectedConditions.invisibilityOfElementLocated(By.id("gh-ac")));
        System.out.println("Fourth");

	}

}
