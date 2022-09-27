package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectByVisible {
	public static void main(String[]args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/signup");
		
		WebElement element = driver.findElement(By.id("month" ));
		Select s=new Select(element);
		
		//s.selectByVisibleText("Jan");
		List<WebElement> allmonths = s.getOptions();
		for(WebElement ele:allmonths) {
		 s.selectByVisibleText(ele.getText());
		 System.out.println(ele.getText());
		 if(ele.isSelected()) {
			 System.out.println("pass:is selected");
		 }else {
			 System.out.println("fail:is not selected");
			 
		 }
		}
		
		

}
}