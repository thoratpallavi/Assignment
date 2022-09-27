package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooltip {
	@SuppressWarnings("unused")
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://demo.actitime.com/login.do");
	    String expectedtooltip = "Do not select if this computer is shared";
	    String actualtooltip =driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
	   //String element =driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
	   //System.out.println(element);
	    if(actualtooltip!=null) {
	    
	    if(actualtooltip.equals(expectedtooltip)) {
	    	
	    	System.out.println("Pass:Tooltip is correct");
	    }
	    else {
	    	
	    	System.out.println("Fail:Tooltip is not incorrect");
	    }
	    }
	    else {
	    	System.out.println("fail:actualtooltip attribute is not present ");
	    }

}
}
//tooltip is present always in title in the src code.if instead of title,we write pune then we get o/p as actualtooltip attribute is not present.becoz it
//is not in the src code.
