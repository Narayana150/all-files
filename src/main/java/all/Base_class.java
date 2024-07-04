package all;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Base_class {
	WebDriver driver;
	@BeforeSuite
	public void datafromquery() {
		System.out.println("from query language");
	}
	@BeforeClass
	public void chromelaunch() {
		driver=new ChromeDriver();
		driver.navigate().to("https://pmkisan.gov.in/");
		driver.manage().window().maximize();
	}
@BeforeMethod
public void loginopt() {
	System.out.println("login is confirmed");
}
@AfterMethod
public void logout() {
	System.out.println("logou is confirmed");
}
@AfterClass
public void browserclose() throws Throwable {
	Thread.sleep(3000);
	//driver.quit();
}
@AfterSuite
public void databaseclose() {
	System.out.println("close the database connection");
}
}
