package stepDefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import commonFunctions.ConfigReader;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import commonFunctions.BaseTest;
import commonFunctions.Utility;
import io.cucumber.java.After;
import io.cucumber.java.*;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Utility {

	@After(order = 2)
	public void takeScreenShotOnFailedScenario(Scenario scenario) {
		if ((scenario.isFailed())) {
			System.out.println("Taking screenshot from Cucumber After hook with order=2 if the scenario fails");
			takeScreenshot(scenario);
		}
	}

	@AfterStep
	public void takeScreenScreenshotScenario(Scenario scenario) {
		if (configProps.getProperty("takePassScreenshot").equalsIgnoreCase("Y")) {
			System.out.println("Taking screenshot for each Pass step");
			takeScreenshot(scenario);
		}
	}

	@After(order = 1)
	public void tear() {
		if(driver!=null)
		driver.quit();
	}

	@Before
	public static void before() throws Throwable {

		
		String browser = ConfigReader.getBrowserType();
		if (browser != null)
			ConfigReader.setBrowserType(browser);
		else {
			BaseTest.configProps = Utility.loadProperties();
			browser = BaseTest.configProps.getProperty("browser");
			
		}
		BaseTest.invokeBrowser(browser);

	}

}
