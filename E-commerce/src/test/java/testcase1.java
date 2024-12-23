import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testcase1 {

	public static void main(String[] args) {
		// step 1 open the browser
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		//"https://www.amazon.ca/
		//step 2 open the url of amazon site
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca");
		//step 3 click start button
		driver.findElement(By.cssSelector("#nav-signin-tooltip > div > a")).click();
		
		//driver.close();
	
	}

}
