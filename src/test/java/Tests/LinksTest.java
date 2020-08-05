package Tests;

import org.testng.annotations.Test;

import Pages.Links;
import Resources.Url_Page;

public class LinksTest extends Url_Page {
	
	@Test
	public void Test004() throws Exception {
		Open_Url();
		Links l = new Links(driver);
		l.verify_Add_ons();
		Close_Url();
	}
	@Test
	public void Test005() throws Exception {
		Open_Url();
		Links l = new Links(driver);
		l.verify_Deals();
		Close_Url();

}
	@Test
	public void Test006() throws Exception {
		Open_Url();
		Links l = new Links(driver);
		l.verify_Gift_Card();
		Close_Url();
	}
}
