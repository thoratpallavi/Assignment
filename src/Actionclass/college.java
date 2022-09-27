package Actionclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class college {
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	    driver.get("https://collegedunia.com/college/2868-mallamma-marimallappa-womens-arts-and-commerce-college-mysore");
	   // Actions actions=new Actions(driver);
	   List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='jsx-1813360254 list-unstyled menu-option-parent d-flex m-0 align-items-center position-relative']//a"));
      //to click on multiple elements use find elements to write xpath for each element is to lengthy code so we have taken anscestor to select all elements
	   Actions actions=new Actions(driver);
	   actions.keyDown(Keys.CONTROL);  //press the control key down
	   for(WebElement ele:elements) {  //in find elements we are using for each loop that all element stored in ele
    	   actions.click(ele);         //click on all element so we use this
       }
	   actions.keyUp(Keys.CONTROL);    //release the control key
       actions.perform();   
       

}
}
//HERE scensrio is is to open info,reviews etc in new browser manually we are doing using ctrl key for doing automatically we have to use key down and key up
//in that we have to pass which key we have to press i.e control