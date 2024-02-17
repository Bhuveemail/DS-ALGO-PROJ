package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import commonFunctions.commonMethods;
import commonFunctions.envDetails;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepDefinitions"}, plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@queue_page_all"
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
    @BeforeMethod
    public void startBrowser() {
    	commonMethods.invokeBrowser(envDetails.browser);
    }
    @AfterMethod
	 public void tear() {
    	commonMethods.tearDown();
	 }
}