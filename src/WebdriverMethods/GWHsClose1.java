package WebdriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GWHsClose1 {
public static void main(String[]args)  {
		
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("http://leafground.com/pages/Window.html");
		//this is another selenium method to close the child window
		String parentwindowID = driver.getWindowHandle();                //first we have to get the parent window bcoz after get windowhandles we get cant use gethandle
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		 Set<String> window = driver.getWindowHandles();
		 window.remove(parentwindowID);             // we have to remove the parent window 
		 for(String st: window) {
			 driver.switchTo().window(st); 
			 driver.close();                      
		 }		
		driver.switchTo().window(parentwindowID);
		String title = driver.getTitle();
		System.out.println(title);
		 
}

}
