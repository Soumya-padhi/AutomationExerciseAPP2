package utilities;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Basetest {

	public  WebDriver driver;


	public  void launchwebpage() throws MalformedURLException, IOException {
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + ("\\src\\testData\\GlobalInput.properties"));
		prop.load(fs);
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(); // intializing
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver(); // intializing
		}				
	
	}
	
	public void gotoURL() throws IOException {
		Properties prop = new Properties();// this method is already there in util class
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + ("\\src\\testData\\GlobalInput.properties"));
		prop.load(fs);
		String url = prop.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
//	public WebDriver driver;
//	
//	public WebDriver intializebrowser() throws IOException {
//		Properties prop = new Properties();
//		FileInputStream	fs = new FileInputStream(System.getProperty("user.dir")+("\\src\\testData\\GlobalInput.properties"));
//		prop.load(fs);
//		String browser=prop.getProperty("browser");
//		if(browser.equalsIgnoreCase("chrome")) {
//	    	 driver= new ChromeDriver(); // intializing 
//	     }
//	     else if(browser.equalsIgnoreCase("firefox")) {
//	    	 driver= new FirefoxDriver(); // intializing 
//	     }
//		
//		return driver;
//	}
//	
//	
//	public void LaunchApplication() throws IOException {
//		driver=intializebrowser();
//		LandingPage lp = new LandingPage(driver);
//		lp.GoTo();
//		//return lp;
//	}

//	@AfterTest
//	public void CloseBrowser() {
//		
//		driver.close();
//	}
}
