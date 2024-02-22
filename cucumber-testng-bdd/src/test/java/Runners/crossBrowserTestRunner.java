package Runners;
import io.cucumber.java.AfterStep;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import commonFunctions.Utility;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepDefinitions"}, 
        plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        		"json:target/cucumber-reports/cucumber.json",
        		"html:target/cucumber-reports/cucumberreport.html"}, publish=true,
        tags = "@test"
)
public class crossBrowserTestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
    @BeforeMethod
    @Parameters("Browser")
    public void startBrowser(String Browser) throws FileNotFoundException, IOException {
    	Properties configProps=Utility.loadProperties();
    	if(Browser.equalsIgnoreCase("Chrome")) {
	    		System.setProperty("webdriver.chrome.driver",configProps.getProperty("chromePath"));
	    		Utility.driver = new ChromeDriver();
	    		System.out.println("Invoke Browser - "+Browser);
	    	}
	    	else if (Browser.equalsIgnoreCase("Firefox")) {
	    		System.setProperty("webdriver.gecko.driver", configProps.getProperty("FireFoxPath"));
	    		Utility.driver = new FirefoxDriver();
	    		System.out.println("Invoke Browser - "+Browser);
	        	}
	    	else if(Browser.equalsIgnoreCase("Edge")){
	    		System.setProperty("webdriver.edge.driver",configProps.getProperty("EdgePath"));
	    		Utility.driver = new EdgeDriver();
	    		System.out.println("Invoke Browser - "+Browser);
	    	}
    }
    
    
    
    
}