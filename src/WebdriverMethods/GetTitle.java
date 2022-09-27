package WebdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	ChromeDriver driver= new ChromeDriver();
	
	driver.get("https://www.google.com/");
	String actualtitle = driver.getTitle();                     //to get the title of webpage
	String expectedtitle = "Google";
	
    if(actualtitle.equals(expectedtitle)) {
    	System.out.println("PASS: Title is correct");
    }
    else {
    	System.out.println("Fail:Title is incorrect");
    }
    }
	}

