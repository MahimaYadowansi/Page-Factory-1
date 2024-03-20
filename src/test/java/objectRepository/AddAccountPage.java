package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAccountPage {
WebDriver driver;

public AddAccountPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//*[@id=\"account-account\"]/ul/li[2]/a")
private WebElement account;

public WebElement account()
{
	return account;
}
}
