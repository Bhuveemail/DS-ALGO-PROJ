package stepDefinitions;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import commonFunctions.commonMethods;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends commonMethods {

	
	@After(order=1) // Cucumber After Hook with order 1 
	public void
	  takeScreenShotOnFailedScenario(Scenario scenario) { 
		System.out.println("Taking screenshot from Cucumber After hook with order=2 if the scenario fails"); 
		if ((scenario.isFailed())) { 
			
			final byte[] screenshot = ((TakesScreenshot)
					commonMethods.driver).getScreenshotAs(OutputType.BYTES); scenario.attach(screenshot,
	  "image/png", scenario.getName()); } }

			
			  @After(order=2) public void tear() { commonMethods.tearDown(); }
			  
			 
//	@Before
//    public static void setUp() {
// 
//       commonFunctions.setUpDriver();
//    }
	
	
	    	
	/*
	 * @After(order=1) //Cucumber hook - runs for each scenario public static void
	 * quitDriver() throws Exception { commonMethods.tearDown(); }
	 * 
	 * @After(order = 2) // Cucumber After Hook with order 1 public void
	 * takeScreenShotOnFailedScenario(Scenario scenario) { System.out.
	 * println("Taking screenshot from Cucumber After hook with order=2 if the scenario fails"
	 * ); if ((scenario.isFailed())) { final byte[] screenshot = ((TakesScreenshot)
	 * driver).getScreenshotAs(OutputType.BYTES); scenario.attach(screenshot,
	 * "image/png", scenario.getName()); } }
	 */
	    	
	    
				/*
				 * @AfterTest public static void tearDown(Scenario scenario) {
				 * 
				 * //validate if scenario has failed
				 * 
				 * 
				 * 
				 * commonMethods.tearDown(); }
				 */
}
