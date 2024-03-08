package stepDefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import commonFunctions.ConfigReader;
import commonFunctions.LoggerLoad;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;


import commonFunctions.BaseTest;
import commonFunctions.Utility;
import io.cucumber.java.*;

public class Hooks extends Utility {private WebDriver driver;


private static String browserName;

public static void setBrowserName(String browser) {
	browserName = browser;
}

public static String getBrowserName(String browser) {
	
	return browserName;
}

@Before(order=0)
public void getProperty() {
	configProps = ConfigReader.loadProperty();
}


@Before(order=1)
public void launchBrowser() {
	
	if(BaseTest.runnerName.equalsIgnoreCase("Runners.crossBrowserTestRunner"))
			driver = BaseTest.intializeDriver(browserName);
}

@BeforeStep
public void beforeStepLog(Scenario sc) {
	LoggerLoad.info("Before Step : " + sc.getName() +" " + sc.getLine());
	
}

@AfterStep
public void afterStepLog(Scenario sc) {
	LoggerLoad.info("After Step : " + sc.getName() +" " + sc.getLine());
	//sc.getSourceTagNames().stream().forEach(a -> LoggerLoad.info("SourceTagName " + a));
	
}

@After(order=0)
public void quitBrowser() {
	if(driver!=null)
	driver.quit();
	LoggerLoad.info("driver is closed");
}

@After(order=1)
public void tearDown(Scenario scenario) {
	
	if (scenario.isFailed()) {
		String screenshotName = scenario.getName().replaceAll(" "," _" );
		byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcePath, "image/png", screenshotName);
	}
}
}
