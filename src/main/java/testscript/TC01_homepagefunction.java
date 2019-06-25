package testscript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Baseclass;
import page.Home;

public class TC01_homepagefunction {
	
	
	

	Baseclass bc;
	Home hm = new Home();;
public TC01_homepagefunction() {
	
bc = new Baseclass();

}
	


	@BeforeClass
	public  void openbrowser() {
		
	String browsername=	bc.readpropertyfile("BrowserName", "config.properties");
	String url=bc.readpropertyfile("URL", "config.properties");
		bc.openbrowser(browsername, url);
	
	}
	
	@Test
	public void loginwithvalidcredential() {
		System.out.println("test ");
	//	bc.sendElement("ankita jain", hm.searchTextBox);
		
	//	bc.clickToElement(hm.googleSearchButton);
		
	}
	
	@Test
	public void create_Opportunity() {
	
		
	String test =	bc.customizedxpath(hm.radioBtton, "2");
	System.out.println(test);
	bc.clickToElement(test);
		bc.pause(5000);
		
	bc.selectfromdrropdown(hm.continent, "Australia");	
	}
	
	
	
	@AfterClass
	public void closebrowser() {
		bc.closebrowser();
	}
	
	

}
