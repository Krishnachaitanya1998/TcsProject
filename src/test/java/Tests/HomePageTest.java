package Tests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Resources.Url_Page;
public class HomePageTest extends Url_Page{
	        
	@Test
	public void Test001() throws Exception {
		
		Open_Url();
		HomePage hp = new HomePage(driver);
		hp.One_Way_Search();
		Close_Url();
	}	
	@Test
	public void Test002() throws Exception {
		Open_Url();
		HomePage hp = new HomePage(driver);
		hp.verify_first_Select();
		Close_Url();
		
	}
	@Test
	public void Test003() throws Exception {
		Open_Url();
		HomePage hp = new HomePage(driver);
		hp.verify_default_select();
		Close_Url();
	}
		
		
	}
	


