package webelement;

import org.openqa.selenium.By;

import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRect3 {
	@SuppressWarnings("unused")
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://demo.actitime.com/login.do");
	     Thread.sleep(2000);
	    Rectangle username = driver.findElement(By.id("username")).getRect();
	    Rectangle password = driver.findElement(By.name("pwd")).getRect();
	    int usernameEndpoint = username.getX()+username.getWidth();
	    int PasswordEndpoint = password.getX()+password.getWidth();
	    if(usernameEndpoint==PasswordEndpoint) {
	   	 System.out.println("endpoint alignment is same");
	     }else {
	    	 
	    	 System.out.println("endpoint alignment is different");
	     }
	    
	    
	    
	    
	    
	
	   
	    	
	  


}
}


