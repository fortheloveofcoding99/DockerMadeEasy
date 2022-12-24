package testCases;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class TestCaseEdge {
	@Test
	public void edgeTest() throws MalformedURLException
	{
		EdgeOptions options = new EdgeOptions();
		
		URL url = new URL ("http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver = new RemoteWebDriver(url,options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		System.out.println(driver.getTitle());
	}

}
