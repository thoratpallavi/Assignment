package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectByValue1 {
	public static void main(String[]args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		WebElement element = driver.findElement(By.id("Form_submitForm_Country" ));
		Select s=new Select(element);
		s.selectByValue("Afghanistan");
		List<WebElement> allmonths = s.getOptions();
		for(WebElement ele:allmonths) {
			s.selectByValue(ele.getAttribute("value"));
			System.out.println(ele.getAttribute("value"));
		
}
}
}
