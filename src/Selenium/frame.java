package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class frame {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.getTitle();
		driver.findElement(By.id("identifierId")).sendKeys("bharathashivakamini@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/span/span")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);       
		driver.findElement(By.id("yDmH0d")).sendKeys("Anusurya@14");
		//driver.switchTo().frame("I");
		//driver.findElement(By.xpath("//*[@id='passwordNext']/div[2]")).click();
	}

}
