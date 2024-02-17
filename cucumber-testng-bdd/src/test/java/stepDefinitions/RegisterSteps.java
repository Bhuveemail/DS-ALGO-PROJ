package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

import commonFunctions.commonMethods;
import commonFunctions.constants;
import commonFunctions.envDetails;
import commonFunctions.objectRepo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class RegisterSteps extends commonMethods{
   
//	   @BeforeAll
//	    public static void before_all() throws Throwable {     
//		   invokeBrowser(envDetails.browser);
//	    }
	    @AfterTest
	    public static void after_all() throws Throwable {     
	    	driver.quit();
	    }
	
	    @Given("verify register")
	    public void verify_register() {
	        // Write code here that turns the phrase above into concrete actions
	       
	    	loadUI(constants.appURL);	    
	    	click(objectRepo.registerLink);
	    	
	    	
	    	
}
	    @When("verify postive flow")
	    public void verify_postive_flow() {
	        // Write code here that turns the phrase above into concrete actions
	       
	    }
}



