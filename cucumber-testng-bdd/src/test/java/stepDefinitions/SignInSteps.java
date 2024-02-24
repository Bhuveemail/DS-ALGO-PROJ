package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
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

public class SignInSteps extends Utility{
	Scenario scenario;


	 @When("I login to ds-algo portal")
	    public void i_login_to_ds_algo_portal() throws InvalidFormatException, IOException {
		  
	    	implicitWait(10);
	    	click(SignIn.signInLink);
	    	
	    	List<Map<String, String>> excelRows=BaseTest.getData(configProps.getProperty("testData"),"sheet1");
	    	    	
	    	sendText(SignIn.userName, excelRows.get(0).get("User Name"));
	    	sendText(SignIn.password, excelRows.get(0).get("Password"));
	    	click(SignIn.loginButton);
	    	
	    	
	    }
	 @Then("I log out")
	    public void I_log_out() {
	        
	    	  click(SignIn.signOutLink);
	       	
	    }
	    
	
    

	
	
    
}

