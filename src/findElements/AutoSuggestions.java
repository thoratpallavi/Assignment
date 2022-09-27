package findElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestions {
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	    driver.get("https://www.google.com/");
	    driver.findElement(By.name("q")).sendKeys("Selenium");
	    List<WebElement> autosuggetions = driver.findElements(By.xpath("//li[@class='sbct' and not(@id='YMXe')]"));
	    // int ele1 = autosuggetions.size();
		for(WebElement ele : autosuggetions) {
	    	System.out.println(ele.getText());
	    }
		int ele1 = autosuggetions.size();                  //count the autosuggestion
		System.out.println(ele1);
		if(ele1<=10) {
			System.out.println("Pass");
		}
		else {
			
			System.out.println("Fail");
		}
		

	}
}

	

