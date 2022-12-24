package testCases;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestCaseFirefox {
	
	@Test
	public void geckoTest() throws MalformedURLException
	{
		FirefoxOptions options = new FirefoxOptions();
		
		URL url = new URL ("http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver = new RemoteWebDriver(url,options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.selenium.dev/");
		System.out.println(driver.getTitle());
	
	}

}
