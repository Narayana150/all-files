package scripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import all.Base_class;
import object_repository.Home_page;

public class TS_01 {
	/**@throws Throwable 
	 * @Test
	 
	public void script_check_helpline() {
	Home_page hp=new Home_page();
	//hp.getHelpline().click();
	WebElement elem = hp.getHelp_link();
		elem.click();**/
	public static void main(String[] arg) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://pmkisan.gov.in/");
		driver.manage().window().maximize();
		Thread.sleep(400);
		driver.findElement(By.xpath("//img[@src='new_images/chatc.png']")).click();
		String Multclas = driver.getWindowHandle();
		Set<String> parids = driver.getWindowHandles();
		Iterator<String> itr=parids.iterator();
		while(itr.hasNext()) {
		 String ids = itr.next();
		String allids = driver.switchTo().window(ids).getTitle();
		if(allids.contains(Multclas)){
			break;
		}
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@aria-hidden='true']")).click();
		driver.findElement(By.xpath("//button[text()='English']")).click();
		WebElement element = driver.findElement(By.xpath("//textarea[@id='userQuestionTextBox']"));
			element.sendKeys("age eligible");
		driver.findElement(By.xpath("//button[@id='sendTextButton']")).click();
		Thread.sleep(4000);
       driver.switchTo().window(Multclas);		
		driver.close();
	}
}
