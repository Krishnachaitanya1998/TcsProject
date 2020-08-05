package Tests;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Resources.Url_Page;

public class Listeners implements ITestListener{
	Url_Page u = new Url_Page();
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("The test case is started :"+result.getName());
	}
    public void onTestSuccess(ITestResult result) {
    	// TODO Auto-generated method stub
    	System.out.println("The test case is passed :"+result.getName());
    }
   
    public void onTestFailure(ITestResult result) {
    	
    try {
		u.getScreenshot(result.getName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    	    
    }
   
   
     }


