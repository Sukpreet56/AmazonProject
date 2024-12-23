package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateAccount {

	 WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        // Setup WebDriver to manage the Chrome driver
	    	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
}
	    @Test
	    public void createAccountTest() {
	        // Navigate to Amazon's sign-up page
	        driver.get("https://www.amazon.com/ap/register");

	        // Enter Name in YourNAME FIELD
	        WebElement YourNamefield = driver.findElement(By.id("ap_customer_name"));
	        YourNamefield.sendKeys("testuser1234@example.com");

	        //Enter complete email address  in "Mobile number or email" field
	        WebElement MobileNumberOrEmail = driver.findElement(By.id("ap_email"));
	        MobileNumberOrEmail.sendKeys("sukhharpreet56@gmail.com");

	        // Enter Password in "Password" field	upto 6 characters
	        WebElement passwordField = driver.findElement(By.id("ap_password"));
	        passwordField.sendKeys("Roopkaur");

	        WebElement passwordCheckField = driver.findElement(By.id("ap_password_check"));
	        passwordCheckField.sendKeys("Roopkaur");

	        // Submit the form to create the account
	        WebElement createAccountButton = driver.findElement(By.id("continue"));
	        createAccountButton.click();

	    }
	    @AfterClass
	    public void closebrowser() {
	        // Close the browser
	         driver.close();
	    }}
