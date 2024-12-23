package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class yourOrderModule {
WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Setup WebDriver to manage the Chrome driver
    	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
}
    @Test(priority=1)
    public void YourOrders() throws InterruptedException {
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
        
        //click on HelloMessage
        WebElement HelloMessage = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        HelloMessage.click();
        
        //click on Your Orders
        WebElement YouOrderButton =driver.findElement(By.cssSelector("#a-page > div.a-container > div > ul:nth-child(2) > li:nth-child(1) > span > a > div > div > div > div.a-column.a-span9.a-span-last > h2"));
        YouOrderButton.click();

       // click on Add Address option
}
    @Test(priority=2)
    public void testAmazonOrders() {
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
        
        //click on HelloMessage
        WebElement HelloMessage = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        HelloMessage.click();
        
        //click on Your Orders
        WebElement YouOrderButton =driver.findElement(By.cssSelector("#a-page > div.a-container > div > ul:nth-child(2) > li:nth-child(1) > span > a > div > div > div > div.a-column.a-span9.a-span-last > h2"));
        YouOrderButton.click();

        // Verify Buy Again tab exists and is clickable
        WebElement buyAgainElement = driver.findElement(By.cssSelector("#a-page > section > div.your-orders-content-container__content.js-yo-main-content > div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(2) > a"));
        buyAgainElement.isDisplayed();
        buyAgainElement.click();
        
        //Verify notYetShipped tab exists and is clickable
        WebElement notYetShippedTabElement = driver.findElement(By.cssSelector("#a-page > section > div.your-orders-content-container__content.js-yo-main-content > div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(3) > a"));
        notYetShippedTabElement.isDisplayed();
        notYetShippedTabElement.click();
        
        //verify CancelledOrders tab exists and is clickable
        WebElement cancelledOrderElement = driver.findElement(By.cssSelector("#a-page > section > div.your-orders-content-container__content.js-yo-main-content > div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(4) > a"));
        cancelledOrderElement.isDisplayed();
        cancelledOrderElement.click();
    }
    @AfterClass
    public void closebrowser() {
        // Close the browser
        
            driver.close();
    }}

