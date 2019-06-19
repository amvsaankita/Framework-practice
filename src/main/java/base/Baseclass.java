package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Baseclass {
	WebDriver driver;
	
	
	
	public void openbrowser(String browsername ,String url) {
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankita\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.get(url);
		}

		if(browsername.equalsIgnoreCase("ie")) {
			
			System.out.println("browser is ie");
			System.setProperty("webdriver.ie.driver", "C:\\Users\\ankita\\Downloads\\chromedriver_win32\\chromedriver.exe");

			driver = new InternetExplorerDriver();
			
			
		
		}
		if(browsername.equalsIgnoreCase("browserstack")) {
			
			System.out.println("browser is browserstack");
			final String USERNAME = "ankita177";
			  final String AUTOMATE_KEY = "LzmpsJNXrYpkddWtR2wo";
			  final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

			
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("os_version", "11");
			caps.setCapability("device", "iPhone 8 Plus");
			caps.setCapability("real_mobile", "true");
			caps.setCapability("browserstack.local", "false");
		
	//	 driver= new ChromeDriver(caps);
		
		    try {
				 driver = new RemoteWebDriver(new URL(URL), caps);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	
	
	
	
		}
	
	
	
		}
	
	
	public void switchToFrame(String  value ,String configFile) {
		String value2 = readpropertyfile(value, configFile);
		WebElement ele = driver.findElement(By.xpath(value2));
		driver.switchTo().frame(ele);
	}
	
	
	public void clickToElement(String value) {
		driver.findElement(By.xpath(value)).click();
	}
	public void sendElement(String value3, String xpath) {
		driver.findElement(By.xpath(xpath)).sendKeys(value3);
		
	}
	
	
	public String readpropertyfile(String value,String propertfilename) {
        try (InputStream input = new FileInputStream("C:\\Users\\ankita\\eclipse-workspace\\New_framework\\"+ propertfilename))
        		{

	            Properties prop = new Properties();

	          

	            //load a properties file from class path, inside static method
	            prop.load(input);

	            //get the property value and print it out
	         String str=   prop.getProperty(value);
	           return str;

	        } catch (IOException ex) {
	        	ex.printStackTrace();

	        	return "failed";
	        }
		
	}
}
