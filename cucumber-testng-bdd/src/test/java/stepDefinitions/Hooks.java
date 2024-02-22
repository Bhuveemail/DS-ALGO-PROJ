package stepDefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import commonFunctions.Utility;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Utility {

	@After(order = 2) 
	public void takeScreenShotOnFailedScenario(Scenario scenario) {
		System.out.println("Taking screenshot from Cucumber After hook with order=2 if the scenario fails");

		if ((scenario.isFailed())) {
			takeScreenshot(scenario);
		}
	}
	@AfterStep
	public void takeScreenScreenshotScenario(Scenario scenario) {
		if(envProps.getProperty("takePassScreenshot").equalsIgnoreCase("Y")) {
			System.out.println("Taking screenshot for each Pass step");
			takeScreenshot(scenario);
		}
	}

	@After(order = 1)
	public void tear() {
		Utility.tearDown();
	}


}
