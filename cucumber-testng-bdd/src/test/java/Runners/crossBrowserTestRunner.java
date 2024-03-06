package Runners;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import commonFunctions.BaseTest;
import commonFunctions.Utility;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import commonFunctions.BaseTest;
import commonFunctions.ConfigReader;
import commonFunctions.Utility;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepDefinitions","hooks"}, 
        plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        		"json:target/cucumber-reports/cucumber.json",
        		"html:target/cucumber-reports/cucumberreport.html"}, publish=true,
        tags = "@signin_page_positive"
)
public class crossBrowserTestRunner extends AbstractTestNGCucumberTests {

   
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
   

    @BeforeTest
    @Parameters("Browser")
    public void defineBrowser(String browser) throws Throwable {

    
		ConfigReader.setBrowserType(browser);
		BaseTest.configProps.setProperty("browser",browser);
		//BaseTest.invokeBrowser(browser);

	}
    
    @AfterTest
	public void tear() {
    	if(BaseTest.getDriver()!=null)
    		BaseTest.getDriver().quit();
	}
    
    
}