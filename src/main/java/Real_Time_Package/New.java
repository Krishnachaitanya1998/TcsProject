package Real_Time_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\library\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    	driver.get("https://www.spicejet.com/");
    	driver.manage().window().maximize();
    	String str = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).getAttribute("value");
    	System.out.println(str);
    	
    	
    	
    	
    	
    	

	}

}
