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

import commonFunctions.ExcelReader;
import commonFunctions.commonMethods;
import commonFunctions.constants;
import commonFunctions.envDetails;
import commonFunctions.objectRepo;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignIn;

import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;

public class SignInSteps extends commonMethods{

	 

	@Given("^Open Browser$")
    public void open_browser() throws Throwable {     
		 invokeBrowser(envDetails.browser);
       
    }
	  
	@Given("^login to the application$")
    public void login_to_the_application() throws Throwable {    
		invokeBrowser(envDetails.browser);
    	implicitWait(10);
    	loadUI(constants.appURL);
    	implicitWait(100);
       
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
	    	loadUI(envDetails.appURL);
	    	implicitWait(10);
	    	click(SignIn.signInLink);
	    	
	    	List<Map<String, String>> excelRows=ExcelReader.getData(constants.testData,"sheet1");
	    	    	
	    	sendText(SignIn.userName, excelRows.get(0).get("User Name"));
	    	sendText(SignIn.password, excelRows.get(0).get("Password"));
	    	click(SignIn.loginButton);
	    	
	    	
	    }
	 @Then("I log out")
	    public void I_log_out() {
	        
	    	  click(SignIn.signOutLink);
	       	
	    }
	    
	
    

	
	
    
}

