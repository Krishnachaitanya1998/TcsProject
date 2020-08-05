package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Links {
	public WebDriver driver;
	
	By Add_ons = By.id("higaddons");
	By Deals = By.linkText("DEALS");
	By Gift_Card = By.id("highlight");
	
	public Links(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verify_Add_ons() {
		driver.findElement(Add_ons).click();
	}
	
	public void verify_Deals() {
		driver.findElement(Deals).click();
	}
	
	public void verify_Gift_Card() {
		driver.findElement(Gift_Card).click();	
		
	}

	

}
