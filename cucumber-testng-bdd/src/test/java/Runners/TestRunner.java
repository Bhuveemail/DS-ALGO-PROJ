package Runners;
import io.cucumber.java.AfterStep;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import commonFunctions.BaseTest;
import commonFunctions.Utility;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepDefinitions"}, 
        plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
            	"json:target/cucumber-reports/cucumber.json",
            	"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
        		"html:target/cucumber-reports/cucumberreport.html"},
        tags = "@signin_page_positive"
        		
)
public class TestRunner extends AbstractTestNGCucumberTests {

	/*
	 * @Override
	 * 
	 * @DataProvider(parallel = false) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */
    @BeforeMethod
    public void loadConfig() throws FileNotFoundException, IOException {
    	BaseTest.configProps=Utility.loadProperties();
    	
    }
    @AfterTest
	public void tear() {
		Utility.tearDown();
	}
    
    
    
    
}