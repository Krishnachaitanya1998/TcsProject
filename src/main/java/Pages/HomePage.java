package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class HomePage{
	public WebDriver driver;
	
	
	By From = By.id("ctl00_mainContent_ddl_originStation1_CTXT");
	By From_Web_Table = By.xpath("//a[@value='BLR']");
	By To = By.id("ctl00_mainContent_ddl_destinationStation1_CTXT");
	By To_Web_Table = By.xpath("//div[contains(@id,'ctl00_mainContent_ddl_destinationStation1_CTNR')] //a[@value='HYD']");
	By Depart_Date = By.id("ctl00_mainContent_view_date1");
	By Date_Pick = By.xpath("//a[@class='ui-state-default' and text() = '1']");
	By Passengers = By.id("divpaxinfo");
	By Adult_Dropdown = By.id("ctl00_mainContent_ddl_Adult");
	By Child_Dropdown = By.id("ctl00_mainContent_ddl_Child");
	By Infant_Dropdown = By.id("ctl00_mainContent_ddl_Infant");
	By Currency_Dropdown = By.id("ctl00_mainContent_DropDownListCurrency");
	By Search = By.id("ctl00_mainContent_btn_FindFlights");
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void One_Way_Search()  {

	  driver.findElement(From).click();
	  driver.findElement(From_Web_Table).click();
	  driver.findElement(To).click();
      driver.findElement(To_Web_Table).click();
      driver.findElement(Depart_Date).click();
      driver.findElement(Date_Pick).click();
      driver.findElement(Passengers).click();
      new Select(driver.findElement(Adult_Dropdown)).selectByVisibleText("3");
      new Select(driver.findElement(Child_Dropdown)).selectByVisibleText("2");
      new Select(driver.findElement(Infant_Dropdown)).selectByVisibleText("1");
      new Select(driver.findElement(Currency_Dropdown)).selectByVisibleText("INR");
      driver.findElement(Search).click();
      }
	
	public void verify_first_Select() {
	String str = driver.findElement(Passengers).getText();
	if(str.equalsIgnoreCase("1 Adult")) {
		System.out.println("1 Adult is available");
	}else{
		System.out.println("1 Adult is not available");
		
	}
	}
	public void verify_default_select(){
	WebElement str = new Select(driver.findElement(Currency_Dropdown)).getFirstSelectedOption();
	if(str.getText().equalsIgnoreCase("INR")) {
		System.out.println("The default tect is INR");
		
	}
	else {
		System.out.println("The default value is not INR");
	}
	
	}

	

}
