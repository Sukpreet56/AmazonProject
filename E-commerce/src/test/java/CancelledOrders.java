

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CancelledOrders {

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
//step 8. click on Your Orders
	driver.findElement(By.cssSelector("#a-page > div.a-container > div > ul:nth-child(2) > li:nth-child(1) > span > a > div > div > div > div.a-column.a-span9.a-span-last > h2")).click();
//step 9.Click on Cancelled orders
    driver.findElement(By.cssSelector("#a-page > section > div.your-orders-content-container__content.js-yo-main-content > div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(4) > a")).click();

	}

}
