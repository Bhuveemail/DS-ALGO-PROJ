package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import commonFunctions.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Graph;
import pages.Queue;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;

public class GraphSteps extends Utility {

//	@After
//	public static void afterAll() throws Throwable {
//		driver.quit();
//	}

	@Then("I verify the Graph box displays")
	public void i_verify_the_Graph_box_displays() {
		String GraphBoxText = getText(Graph.GraphCard);
		Assert.assertEquals("Graph", GraphBoxText);
	}

	@When("I click on get started on Graph")
	public void i_click_on_get_started_on_Graph() {

		click(Graph.GraphGetStarted);
		System.out.println("Graph Get Started Button Clicked");
		System.out.println("-------------------------------------------------------");

	}


	
	
	@Then("I verify the Graph Try here functionalities with input \"(.*)\"$")
	public void i_verify_the_Graph_try_here_functionalities_with_input(String input) {

		tryEditor(input);

	}

	@Then("I verify the valid result for Graph positive scenario for \"(.*)\"$")
	public void i_verify_the_valid_result_for_Graph_positive_scenario_for(String input) {

		String actual = getText(Graph.output);
		Assert.assertEquals("hello", actual);

		System.out.println("Positive Flow is verified successfully for " + input);
		backWindow();

	}
	

	

	@Then("I validate the Graph pop up and error message \"(.*)\" for negative scenario for \"(.*)\"$")
	public void i_validate_the_Graph_pop_up_and_error_message_for_negative_scenario(String errorMessage, String input) {
		String alertErrorMessage = getDriver().switchTo().alert().getText();
		Assert.assertEquals(errorMessage, alertErrorMessage);
		closePopUp();
		System.out.println("Negative Flow is verified successfully for " + input);
		System.out.println("-------------------------------------------------------");
		backWindow();
		

	}

	@Then("I click on Graph")
	public void i_click_on_Graph() {
		click(Graph.graph);
	}
	@Then("I click on Graphlink")
	public void i_click_on_GraphLink() {
		click(Graph.graphlink);
	}
	@Then("I click on Graph Representations")
	public void i_click_on_Graph_Representations() {
		click(Graph.graphRep);
	}

	@Then("I click on Practice Questions of Graph")
	public void i_click_on_Practice_Questions_of_Graph() {
		click(Graph.practiceQuestions);
	}


	@Then("I verify the Graph blank page for \"(.*)\"$")
	public void i_verify_the_Graph_blank_page_for(String input) {

		String actual = getText(Graph.blankPage);
		Assert.assertEquals("", actual);

		System.out.println("Positive Flow is verified successfully for " + input);
		backWindow();

	}

}
	