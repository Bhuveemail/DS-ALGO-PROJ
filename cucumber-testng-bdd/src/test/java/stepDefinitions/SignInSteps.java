package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import io.cucumber.java.Scenario;
import commonFunctions.BaseTest;
import commonFunctions.Utility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Home;
import pages.LinkedList;
import pages.SignIn;

import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;

public class SignInSteps extends Utility{
	Scenario scenario;


	 @When("I login to ds-algo portal")
	    public void i_login_to_ds_algo_portal() throws InvalidFormatException, IOException {
		  
	    	//
	    	waitTillElementVisible(SignIn.signInLink, 30);
	    	
	    	click(SignIn.signInLink);
	    	
	    	List<Map<String, String>> excelRows=BaseTest.getData(configProps.getProperty("testData"),"sheet1");
	    	    	
	    	sendText(SignIn.userName, excelRows.get(0).get("User Name"));
	    	sendText(SignIn.password, excelRows.get(0).get("Password"));
	    	click(SignIn.loginButton);
	    	
	    	
	    }
	 @Then("I click on signin link")
	    public void i_click_on_signin_link() {
	        
	    	  click(SignIn.signInLink);
	       	
	    }
	 
	 @Then("I verify the user name password login button on signin page")
	 public void i_verify_the_user_name_password_login_button_on_signin_page() {
			    	
	    	isDisplayed(SignIn.userName);
	    	isDisplayed(SignIn.password);
	        isDisplayed(SignIn.loginButton);
	        isDisplayed(SignIn.registerLink);
	    		
   }
	 
	 
	 @Then("I verify the successful signin")
	 public void i_verify_the_successful_signin() throws InvalidFormatException, IOException {
	    	
		 List<Map<String, String>> excelRows=BaseTest.getData(configProps.getProperty("testData"),"sheet1");
	    	
	    	sendText(SignIn.userName, excelRows.get(0).get("User Name"));
	    	sendText(SignIn.password, excelRows.get(0).get("Password"));
	    	click(SignIn.loginButton);
	    	
	    	String actual = getText(SignIn.roleAlert).replaceAll("\n", "").replaceAll("\r", "");
			Assert.assertEquals("You are logged in", actual);

	    		
}
	 @When("I log out")
	    public void I_log_out() {
	        
	    	  click(SignIn.signOutLink);
	       	
	    }
	 @When("I go back to the screen")
	    public void i_go_back() {
		 try {
			  Alert alert = getDriver().switchTo().alert();
			  alert.accept(); 
			} catch (NoAlertPresentException e) {
			  //System.out.println("No alert was present");
			}
	        getDriver().navigate().back();
	    }
	    
	 @Then("I verify the successful log out message")
	 public void i_verify_the_successful_log_out_message() {
		 String actual = getText(SignIn.roleAlert).replaceAll("\n", "").replaceAll("\r", "");
			Assert.assertEquals("Logged out successfully", actual);
		 
		 
	 }
	
    @Then("I verify the error message for invalid UserName \"(.*)\" and invalid Password \"(.*)\"$")
    public void I_verify_the_error_message_for_invalid_UserName_and_invalid_Password(String username, String password) {
    	sendText(SignIn.userName, username);
    	sendText(SignIn.password, password);
    	click(SignIn.loginButton);
    	String actual = getText(SignIn.roleAlert).replaceAll("\n", "").replaceAll("\r", "");
		Assert.assertEquals("Invalid Username and Password", actual);
    	
    	
    }

	
	
    
}

