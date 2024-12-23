package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlreadyExistingAccount {

	 WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        // Setup WebDriver to manage the Chrome driver
	    	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
}
	    @Test
	    public void testAmazonLogin() {
	        // open sign in page for existing account
	        driver.get("https://www.amazon.ca/ap/signin/ref=ap_mase_back_to_signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&prevRID=90B7DZKBN8KJHY05KCAN&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=caflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&timestamp=1734545296000&email=sukhharpreet56%40gmail.com");

	        // Click on the Sign In link
	        WebElement signInButton = driver.findElement(By.id("nav-link-accountList"));
	        signInButton.click();
	        
	 
	      // Enter complete email address  in "E-mail address or mobile phone number" field
	        WebElement EmailAddress = driver.findElement(By.id("ap_email"));
	        EmailAddress.sendKeys("sukhharpreet56@gmail.com");
	        
	     
	        //click on continue
	        WebElement continueButton = driver.findElement(By.id("continue"));
	        continueButton.click();
	        
	        //Enter Password
	        WebElement passwordField = driver.findElement(By.id("ap_password"));
	        passwordField.sendKeys("Roop@1212");
	        
	        // Click on Sign-In button
	        WebElement signInSubmitButton = driver.findElement(By.id("signInSubmit"));
	        signInSubmitButton.click();

}
	    @AfterClass
	    public void tearDown() {
	        // Close the browser
	        driver.close();
}}
