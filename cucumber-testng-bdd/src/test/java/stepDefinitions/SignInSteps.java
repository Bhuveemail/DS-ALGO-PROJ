package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import io.cucumber.java.Scenario;

import commonFunctions.ExcelReader;
import commonFunctions.Utility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignIn;

import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;

public class SignInSteps extends Utility{
	Scenario scenario;

	 @Given("I load application")
	    public void i_load_application() throws InvalidFormatException, IOException {
		    
		    //invokeBrowser(envDetails.browser);
		  loadUI("https://www.google.com");
	    	
	    }

	
	@When("user enters <inv_username> and <inv_password>")
	public void user_enters_inv_username_and_inv_password(DataTable credentials) throws InterruptedException {
		 
		List<List<String>> data = credentials.cells();
		driver.findElement(By.id("id_username")).sendKeys(data.get(0).get(0));
		Thread.sleep(1000);
		driver.findElement(By.id("id_password")).sendKeys(data.get(0).get(1));
	}
	 @Given("I login to ds-algo portal")
	    public void i_login_to_ds_algo_portal() throws InvalidFormatException, IOException {
		    
		    //invokeBrowser(envDetails.browser);
		    maximizeWindow();
	    	implicitWait(10);
	    	loadUI(envProps.getProperty("appURL"));
	    	implicitWait(10);
	    	click(SignIn.signInLink);
	    	
	    	List<Map<String, String>> excelRows=ExcelReader.getData(envProps.getProperty("testData"),"sheet1");
	    	    	
	    	sendText(SignIn.userName, excelRows.get(0).get("User Name"));
	    	sendText(SignIn.password, excelRows.get(0).get("Password"));
	    	click(SignIn.loginButton);
	    	
	    	
	    }
	 @Then("I log out")
	    public void I_log_out() {
	        
	    	  click(SignIn.signOutLink);
	       	
	    }
	    
	
    

	
	
    
}

