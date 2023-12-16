package pageElements;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.AbstractMethods1;
import utilities.Commonclass;

public class Recommendeditems extends AbstractMethods1{

	WebDriver driver;

	public Recommendeditems(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//i[@class='material-icons card_travel']/parent::a")WebElement product;	

	@FindBy(xpath = "//i[@class='fa fa-home']/parent::a")WebElement homepage;	

	@FindBy(xpath = "(//*[contains(text(),'All Products')])[2]")WebElement allproductpage;	

	@FindBy(xpath = "//div[@class='features_items']")WebElement productlist;
	
	@FindBy(xpath = "(//*[contains(text(),'View Product')])[1]")WebElement firstproduct;
	
	public void add_recommeneditems() throws IOException {
		implicitlywaitmethod();
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + ("\\src\\testData\\GlobalInput.properties"));
		prop.load(fs);
		try {			
			Commonclass rc = new Commonclass(driver);
			homepage.click();
			Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/");
			
			System.out.println("Testcase17--> executed succesfully");

		} catch (Exception e) {
			System.out.println("Exception occured in testcase17 execution");
		}
	}
}