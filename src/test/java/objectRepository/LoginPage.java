package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	//create a constructor so that this class driver can be accessed by other class
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="input-email")
	private WebElement emailfield;
	
	@FindBy(id="input-password")
	private WebElement passwordfield;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	private WebElement loginBtn;
	
	
	
	//creating public method to access private variable outside the class
	
	public WebElement emailfield()
	{
		return emailfield;
	}
	
	public WebElement passwordfield()
	{
		return passwordfield;
	}
	
	public WebElement loginBtn()
	{
		return loginBtn;
	}
}
