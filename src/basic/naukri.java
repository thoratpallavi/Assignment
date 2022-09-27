package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri {
	public static void main (String[]args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://www.naukri.com/");
    driver.findElement(By.id("login_Layer")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[placeholder='Enter your active Email ID / Username']")).sendKeys("Qspider");
    

    
}
}

//in this program scenario is click on login,after login pass value to username textfield.
//click on naukari.com then first inspect the login button after inspectin we get tag name.if there is no other locators is present like id,name.so we use tag.
//so we have to first find duplicate values. for that ctrl+flike tagname[key attribute='attribute value'] inside that we get more duplicates values.so we use previous line 
//which show login click.so use that line. in this line id is presnt (login_Layer)use that id and put it into line no.15
//next scenario is pass value to username textfield.so inspect that username text field there tag name is present so we have to first find duplicate values.
//for that ctrl+f inside that we get more duplicates values like tagname[key attribute='attribute value']& find duplicate values
//here we get 1of1 so we use css selector copy that and paste here line no.17 and send some value.
//here we get nosuchelementexception becoze browser speed is high browser dont wait until value to pass for that we 
//use thred.sleep exception.
