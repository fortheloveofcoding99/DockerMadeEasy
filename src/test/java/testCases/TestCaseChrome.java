package testCases;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCaseChrome {
	
	@Test
	public void chrometest() throws MalformedURLException
	{
		ChromeOptions options = new ChromeOptions();
		
		URL url = new URL ("http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver = new RemoteWebDriver(url,options);
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		System.setProperty("webDriver.edge.driver", "C:\\Users\\befor\\New folder\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		String firstTitle = driver.getTitle();
		String exptitle = "Facebook – log in or sign up";
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(firstTitle, exptitle);
		
		//Assert.assertEquals(firstTitle, exptitle);
		
		System.out.println("First window :"+driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://twitter.com/");
		
		String exptitle2 = "Twitter";
		String secondTitle = driver.getTitle();
		sa.assertEquals(exptitle2, secondTitle);
		
		System.out.println("Second window :"+driver.getTitle());
		driver.quit();
		sa.assertAll();
	}

}
