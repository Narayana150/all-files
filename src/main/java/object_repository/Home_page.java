package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home_page {
	WebDriver driver;
	@FindAll({@FindBy(xpath = "//img[@src='new_images/chatc.png']"),@FindBy(xpath = "//img[@alt='PMKisan Chatbot']")})
	private WebElement helpline;
    @FindAll({@FindBy(xpath =" //a[text()='Home']"),@FindBy(xpath = "(//a[@class='nav-link'])[1]")})
    private WebElement help_link;
    
    public Home_page() {
    	PageFactory.initElements(driver,this);
    }
	public WebElement getHelpline() {
		return helpline;
	}
	
	public WebElement getHelp_link() {
		return help_link;
	}
}
