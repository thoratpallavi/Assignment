package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartImgXPath {
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("https://www.flipkart.com/");
	   // driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[3]/a/div[1]/div/img"));
	   // driver.findElement(By.className("_2KpZ6l _2doB4z"));
        // driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']"));
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[3]/a/div[1]/div/img")).click();
         
}
}
//here 
