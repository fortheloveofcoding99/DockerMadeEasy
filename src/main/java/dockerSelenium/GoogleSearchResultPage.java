package dockerSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchResultPage {

	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public GoogleSearchResultPage(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//img[@alt='Google']")
	private WebElement img;


	@FindBy(linkText="News")
	private WebElement newsLink;

	public boolean isDisplayed()
	{
		this.wait.until(ExpectedConditions.visibilityOf(newsLink));
		//this.img.click();
		//this.driver.close();
		return true;
	}
}
