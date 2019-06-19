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
		bc.sendElement("ankita jain", hm.searchTextBox);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bc.clickToElement(hm.googleSearchButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void create_Opportunity() {
		
	}
	
	
	
	@AfterClass
	public void closebrowser() {
		
	}
	
	

}
