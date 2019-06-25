package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Baseclass;
import page.Home;
import page.Level1_home;

public class Level1 {
	
	Baseclass bc;
	Level1_home hm = new Level1_home();
 public Level1() {
	
bc = new Baseclass();

}
	

	
	@BeforeClass
	public  void openbrowser() {
		
	String browsername=	bc.readpropertyfile("BrowserName", "codelevel.properties");
	String url=bc.readpropertyfile("URL", "codelevel.properties");
		bc.openbrowser(browsername, url);
	
	}
	
	@Test
	public void formfill() {
		System.out.println("test ");
	bc.sendElement("Learing kicksoff", hm.msgtextbox);
	bc.pause(5000);
		
		bc.action_Mousehover(hm.sendmsgbutton);
		bc.pause(5000);
	Assert.assertTrue(bc.verifytext(hm.gettext, "Learing kicksoff"),"Test pass");
	
	
	
	
		/*
		 * if(test == true) { System.out.println("test pass"); } else {
		 * System.out.println("test fail"); }
		 */
	
	
	

	}
	@AfterClass
	public void closesetup() {
		
		bc.closebrowser();
	}
}
