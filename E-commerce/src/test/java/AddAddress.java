

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddAddress {

	public static void main(String[] args) {
		
		// step 1 open the browser
		
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				
		// Step 2 open sign in page for existing account.
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.ca/ap/signin/ref=ap_mase_back_to_signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&prevRID=90B7DZKBN8KJHY05KCAN&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=caflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&timestamp=1734545296000&email=sukhharpreet56%40gmail.com");
					Actions action = new Actions(driver);
		//STEP 3 Enter complete email address  in "E-mail address or mobile phone number" field
				//driver.findElement(By.id("ap_email")).sendKeys("sukhharpreet56@gmail.com");
		//step 4 click on continue
				driver.findElement(By.id("continue")).click();
		//Step 5 Enter correct password 
				driver.findElement(By.id("ap_password")).sendKeys("Roop@1212");
		//Step 6 click Sign-in button
			driver.findElement(By.id("auth-signin-button")).click();
		//Step 7 . click hello message
			driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		//step 8. click on Your Addresses option
			driver.findElement(By.cssSelector("#a-page > div.a-container > div > ul:nth-child(3) > li:nth-child(1) > span > a > div > div > div > div.a-column.a-span9.a-span-last > h2")).click();
        // step 9:click on Add Address option
			driver.findElement(By.cssSelector("#ya-myab-address-add-link > div")).click();
		//country/region is selected by default
		//Step 10:Enter fullname in "Full name (First and Last name)"field
			driver.findElement(By.id("address-ui-widgets-enterAddressFullName")).sendKeys("Harsukhpreet kaur");
	    //Step 11:Enter Phone number in "Phone number"field
			driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).sendKeys("4374341251");
		//Step 12:Enter Address in "Address" field
			driver.findElement(By.id("address-ui-widgets-enterAddressLine1")).sendKeys("30 commodore drive,");
		//step 13:enter city
			driver.findElement(By.id("address-ui-widgets-enterAddressCity")).sendKeys("Brampton");
		//Step 14: click on drop down menu of province/territory
			driver.findElement(By.cssSelector("#address-ui-widgets-enterAddressStateOrRegion > span > span")).click();
		//step 15: select province/territory
			driver.findElement(By.id("address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_8")).click();
		//step 16:Enter postal code
			driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).sendKeys("L6X 0S5");
	}

}
