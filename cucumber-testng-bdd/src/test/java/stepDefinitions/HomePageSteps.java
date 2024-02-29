package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Random;

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
import pages.LinkedList;
import pages.Queue;
import pages.SignIn;

import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;

public class HomePageSteps extends Utility {
	Scenario scenario;

	@Given("I Launch the Application")
	public void i_launch_the_application() {

		maximizeWindow();
		implicitWait(10);
		loadUI(configProps.getProperty("appURL"));
		click(Home.homeGetStarted);
		implicitWait(10);
	}

	@Then("I verify the error message when click on Data structure options Randomly without logged in")
	public void i_verify_the_error_message_when_click_on_Data_structure_options_randomly_without_logged_in()
			throws InterruptedException {
		click(Home.datastructureDropdown);
		int dropdownSize = getElementSize(Home.dropdownList);
		int randomNum = 0;
		  for(int i=1; i<=2; i++) { Random rand = new Random();
		  randomNum=rand.nextInt(dropdownSize-1+1) + 1; 
		  String link=driver.findElement(By.xpath("//*[@class='dropdown-menu show']/a["+randomNum+"]")).getText(); 
		  highlightElement(driver.findElement(By.xpath("//*[@class='dropdown-menu show']/a["+randomNum+"]")));
		  driver.findElement(By.xpath("//*[@class='dropdown-menu show']/a["+randomNum+"]")).click();
		  		  
		  String actual = getText(Home.alertMessage).replaceAll("\n","").replaceAll("\r", ""); 
		  Assert.assertEquals("You are not logged in", actual);
		  
		  implicitWait(10);
		  System.out.println("Negative Flow is verified successfully for " + link);
		  click(Home.datastructureDropdown); 
		  }
		
	}

@Then("I verify the error message when click on Data structure options by order without logged in")
public void i_verify_the_error_message_when_click_on_Data_structure_options_by_order_without_logged_in() throws InterruptedException {
	//click(Home.datastructureDropdown);
	
	for(int i=1; i<=6; i++) {
	String link=driver.findElement(By.xpath("//*[@class='dropdown-menu show']/a["+i+"]")).getText();
	highlightElement(driver.findElement(By.xpath("//*[@class='dropdown-menu show']/a["+i+"]")));
	driver.findElement(By.xpath("//*[@class='dropdown-menu show']/a["+i+"]")).click();
	
	String actual = getText(Home.alertMessage).replaceAll("\n", "").replaceAll("\r", "");
	Assert.assertEquals("You are not logged in", actual);

	implicitWait(10);
	System.out.println("Negative Flow is verified successfully for " + link);
	click(Home.datastructureDropdown);
	}
}
	@Then("I verify the error message when click on Get Started options by order without logged in")
	public void i_verify_the_error_message_when_click_on_Get_Started_options_by_order_without_logged_in() throws InterruptedException {
	
		
		int homeCardsSize = getElementSize(Home.getStarted);
	
		  for(int i=1; i<=homeCardsSize-1; i++) { 
			
		  highlightElement( driver.findElements(By.xpath("//*[text()='Get Started']")).get(i));
		  driver.findElements(By.xpath("//*[text()='Get Started']")).get(i).click();
		  		  
		  String actual = getText(Home.alertMessage).replaceAll("\n","").replaceAll("\r", ""); 
		  Assert.assertEquals("You are not logged in", actual);
		  
		  implicitWait(10);
	}
	}


@Then("I verify the error message when click on Get Started options Randomly without logged in")
public void i_verify_the_error_message_when_click_on_Get_Started_options_Randomly_without_logged_in() throws InterruptedException {
	
		
		int homeCardsSize = getElementSize(Home.getStarted)-1;
		int randomNum = 0;
		  for(int i=1; i<=2; i++) { 
			  Random rand = new Random();
		  	  randomNum=rand.nextInt(homeCardsSize-1+1) + 1; 
		  
		  highlightElement( driver.findElements(By.xpath("//*[text()='Get Started']")).get(randomNum));
		  driver.findElements(By.xpath("//*[text()='Get Started']")).get(i).click();
		  		  
		  String actual = getText(Home.alertMessage).replaceAll("\n","").replaceAll("\r", ""); 
		  Assert.assertEquals("You are not logged in", actual);
		  
		  implicitWait(10);
	}
	}
	
	@Then("I click on get started on home")
	public void i_click_on_get_started_on_home() {
		click(Home.homeGetStarted);
		System.out.println("Home Get Started Button Clicked");
		System.out.println("-------------------------------------------------------");

	}
//@When("I click Data Structures drop down")
//public void i_click_data_structures_drop_down() {
//	click(Home.dropdown);
//}
//
//@When("I click array on drop menu")
//public void i_click_array_on_drop_menu() {
//	click(Home.dropdown);
//	click(Home.arraydropdown);
//}
//
//@When("I click linkedList on drop menu")
//public void i_click_linked_list_on_drop_menu() {
//	//click(Home.dropdown);
//	click(Home.LinkedListdropdown);
//}
//
//@When("I click stack on drop menu")
//public void i_click_stack_on_drop_menu() {
//	click(Home.dropdown);
//	click(Home.stackdropdown);
//}
//
//@When("I click queue on drop menu")
//public void i_click_queue_on_drop_menu() {
//	click(Home.dropdown);
//	click(Home.queuedropdown);
//}
//
//@When("I click tree on drop menu")
//public void i_click_tree_on_drop_menu() {
//	click(Home.dropdown);
//	click(Home.treedropdown);
//}
//
//@When("I click graph on drop menu")
//public void i_click_graph_on_drop_menu() {
//	click(Home.dropdown);
//	click(Home.graphdropdown);
//}

	@Then("I should get the alert with a message You are not logged in\"<You_are_not_logged_in>\"")
	public void i_should_get_the_alert_with_a_message_you_are_not_logged_in_you_are_not_logged_in() {

	}
}