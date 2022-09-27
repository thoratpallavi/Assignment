package basic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	@SuppressWarnings("unused")
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		driver.findElement(By.id("loginButton")).click();
	   
	    
	    

}
	
}
