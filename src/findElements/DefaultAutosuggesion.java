package findElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DefaultAutosuggesion {
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	    driver.get("https://www.google.com/");
	    driver.findElement(By.name("q")).click();
	    List<WebElement> autosuggetions = driver.findElements(By.xpath("//li[@data-view-type='1'and not(@id='YMXe')]"));
		for(WebElement ele : autosuggetions) {
	    	System.out.println(ele.getText());
	    }
		
		

}
}
//in default autosuggesion we use only click method.instead of 
