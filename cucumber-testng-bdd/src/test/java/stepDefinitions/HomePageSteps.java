package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import io.cucumber.java.Scenario;
import commonFunctions.BaseTest;
import commonFunctions.Utility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Home;
import pages.SignIn;

import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;

public class HomePageSteps extends Utility{
	Scenario scenario;
	
	
@Given("I Launch the Application")
public void i_launch_the_application() {

			maximizeWindow();
	    	implicitWait(10);
	    	loadUI(configProps.getProperty("appURL"));
	    	click(Home.homeGetStarted);
	    	implicitWait(10);
}


}