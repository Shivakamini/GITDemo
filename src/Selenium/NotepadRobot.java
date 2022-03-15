package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.Robot;
import java.awt.Toolkit;
import java.io.IOException;
import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

public class NotepadRobot {

	public static void main(String[] args)  throws IOException,AWTException,InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:/java/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Runtime.getRuntime().exec("Notepad.exe");
		StringSelection str=new StringSelection("Shiva");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_CONTROL);
		StringSelection path=new StringSelection("C://Users//Shiva//Desktop//729776//robot.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);	
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);
		
		
		

	}

}
