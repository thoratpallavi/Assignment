package WebdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl1 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.go0gle.com/");
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://www.gogle.com/";
		if (actualurl.equals(expectedurl)) {
			System.out.println("PASS: url is correct");
	    }
	    else {
	    	System.out.println("Fail:url is incorrect");
	    }
		
	}
}
