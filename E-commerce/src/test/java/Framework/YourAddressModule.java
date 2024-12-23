package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class YourAddressModule {

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
        
        //click on Your Address
        WebElement YourAddressElement =driver.findElement(By.cssSelector("#a-page > div.a-container > div > ul:nth-child(3) > li:nth-child(1) > span > a > div > div > div > div.a-column.a-span9.a-span-last > h2"));
        YourAddressElement.click();
        
        // click on Add Address option
        WebElement AddAddressElement =driver.findElement(By.cssSelector("#ya-myab-address-add-link > div"));
        AddAddressElement.click();
        
        ////country/region is selected by default
		//Enter fullname in "Full name (First and Last name)"field
        
        WebElement fullname = driver.findElement(By.id("address-ui-widgets-enterAddressFullName"));
        fullname.sendKeys("Harsukhpreet kaur");
        
        //Enter Phone number in "Phone number"field
        WebElement PhoneNumberfield = driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber"));
        PhoneNumberfield.sendKeys("4374341251");
        
        //Enter Address in "Address" field
        WebElement Addressfield = driver.findElement(By.id("address-ui-widgets-enterAddressLine1"));
        Addressfield.sendKeys("30 commodore drive,");
        
        //enter city
		WebElement Cityfield = driver.findElement(By.id("address-ui-widgets-enterAddressCity"));
		Cityfield.sendKeys("Brampton");
		
		//click on drop down menu of province/territory
		WebElement provinceDropDownMenu =driver.findElement(By.cssSelector("#address-ui-widgets-enterAddressStateOrRegion > span > span"));
		provinceDropDownMenu.click();
        
        // select province/territory
		WebElement provinceMenu = driver.findElement(By.id("address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_8"));
		provinceMenu.click();
		
		//Enter postal code
		WebElement postalcodefield = driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode"));
		postalcodefield.sendKeys("L6X 0S5");
		
		//choose checkbox
		WebElement Checkbox =driver.findElement(By.id("address-ui-widgets-use-as-my-default"));
		Checkbox.click();
		
		//Click onAdd Address Button
		WebElement AddAddressButton =driver.findElement(By.cssSelector("#address-ui-widgets-form-submit-button > span > input"));
		AddAddressButton.click();
		
		//click on AddDelivery Instruction
		WebElement AddDeliveryInstructions =driver.findElement(By.cssSelector("#address-ui-widgets-enterAddressFormContainer > div.a-section.a-spacing-none.aok-inline-block > label > span"));
		AddDeliveryInstructions.click();
		
		//click on AddAddressButton
		WebElement AddAddressElement1= driver.findElement(By.cssSelector("#address-ui-widgets-form-submit-button > span > input"));
		AddAddressElement1.click();
		
		
    }
    @AfterClass
    public void closebrowser() {
        // Close the browser
        
            driver.close();
    }}
