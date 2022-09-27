package WebdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
	
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://www.google.com/"; //from url getting that webpage
		if (actualurl.equals(expectedurl)) {
			System.out.println("PASS: url is correct");
	    }
	    else {
	    	System.out.println("Fail:url is incorrect");
	    }
		
	}

}
