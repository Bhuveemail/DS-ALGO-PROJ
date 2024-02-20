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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import commonFunctions.commonMethods;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepDefinitions"}, 
        plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        		"json:target/cucumber-reports/cucumber.json",
        		"html:target/cucumber-reports/cucumberreport.html"},
        tags = "@linkedList_page_all"
)
public class TestRunner extends AbstractTestNGCucumberTests {

   @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
    @BeforeMethod
    public void startBrowser() throws FileNotFoundException, IOException {
    	Properties envProps=commonMethods.loadProperties();
    	commonMethods.invokeBrowser(envProps.getProperty("browser"));
    }
    
    
    
    
}