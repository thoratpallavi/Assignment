package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Robotclass {
	public static void main(String[]args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://justdial.com"); 
		Robot rt=new Robot();
		//rt.mouseMove(50, 50);
		rt.keyPress(KeyEvent.VK_CONTEXT_MENU);
		rt.keyRelease(KeyEvent.VK_CONTEXT_MENU);
		rt.keyPress(KeyEvent.VK_WINDOWS);
		rt.keyPress(KeyEvent.VK_M);
	}

}
