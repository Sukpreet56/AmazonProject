import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialMobileNumber {

	public static void main(String[] args) {
		// step 1 open the browser
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
// Step 2 open amazon website.
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		// step3 Enter name in "Your Name" field
		driver.findElement(By.id("ap_customer_name")).sendKeys("Harsukhpreet Kaur");
		
//STEP 4 Enter Partial mobile number  in "Mobile number or email" field
		driver.findElement(By.id("ap_email")).sendKeys("43743412");
		
//Step 5 Enter Password in "Password" field	upto 6 characters
		driver.findElement(By.id("ap_password")).sendKeys("Roopkaur");
		
//Step 6 Enter password in "Password again" field
		driver.findElement(By.id("ap_password_check")).sendKeys("Roopkaur");

//click on "Continue" button
		driver.findElement(By.id("auth-continue")).click();
	}

}
