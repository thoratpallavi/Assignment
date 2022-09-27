package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartSearchTextField {
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	   
	    driver.findElement(By.xpath("//a[text()='Explore']"));
	    driver.findElement(By.name("q")).sendKeys("oppo mobile");
  
	    driver.findElement(By.xpath("//span[text()='Cart']"));
	    
	
	  
}
}