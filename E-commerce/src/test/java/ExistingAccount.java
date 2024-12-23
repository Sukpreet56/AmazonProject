import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ExistingAccount {

	public static void main(String[] args) {
		
		
		// step 1 open the browser
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
// Step 2 open sign in page for existing account.
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/ap/signin/ref=ap_mase_back_to_signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&prevRID=90B7DZKBN8KJHY05KCAN&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=caflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&timestamp=1734545296000&email=sukhharpreet56%40gmail.com");
		
//STEP 3 Enter complete email address  in "E-mail address or mobile phone number" field
		//driver.findElement(By.id("ap_email")).sendKeys("sukhharpreet56@gmail.com");
		
//step 4 click on continue
		driver.findElement(By.id("continue")).click();
	}
	
	
}
