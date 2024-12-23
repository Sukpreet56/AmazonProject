package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GuestAccount {

	WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Setup WebDriver to manage the Chrome driver
    	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        
}
    @Test
    public void testGuestLogin() {
    	
    	 WebElement signInButton = driver.findElement(By.id("nav-link-accountList"));
         signInButton.click();
         
         //leave the email field empty
         WebElement emailField = driver.findElement(By.id("ap_email"));
         emailField.sendKeys("");
         
         //press continue button
         WebElement continueButton = driver.findElement(By.id("continue"));
         continueButton.click();
         
}
    @AfterClass
    public void closebrowser() {
        // Close the browser
        
            driver.close();
}}
