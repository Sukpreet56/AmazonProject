

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SortingAndFiltration {

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
		// open drop down menu and sort it by beauty
		Select obj = new Select(driver.findElement(By.cssSelector("#searchDropdownBox")));
		obj.selectByVisibleText("Beauty");
		//Step 7.Go to search engine and search any product with partial text
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("liptick");
		//Step 8. press search button
		driver.findElement(By.id("nav-search-submit-button")).click();
		//click sort by :Feature to filter
		driver.findElement(By.cssSelector("#a-autoid-0-announce > span.a-dropdown-label")).click();
		// click low to high
		driver.findElement(By.cssSelector("#s-result-sort-select_1")).click();

	}

}
