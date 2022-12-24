package testCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class setup_DockerGrid {
	
	@BeforeTest
	void startDockerGrid() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec("cmd /c start start_dockerGrid.bat");
		Thread.sleep(20000);
	}
	
	@AfterTest
	void stopDockerGrid() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec("cmd /c start stop_dockerGrid.bat");
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
	}

}
