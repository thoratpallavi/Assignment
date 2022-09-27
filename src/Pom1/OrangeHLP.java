package Pom1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pom.LoginPage;
import Pom.OrangeLoginP;

public class OrangeHLP {
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		new OrangeLoginP(driver).OrangeLoginP("Admin","admin123").getLogoutbutton();

}
}
