package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import commonFunctions.LoggerLoad;
import commonFunctions.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Array;
import pages.DataStructure;
import pages.Graph;
import pages.Queue;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;

public class QueueSteps extends Utility {


	@Then("I verify the queue box displays")
	public void i_verify_the_queue_box_displays() {
		String queueBoxText = getText(Queue.QueueCard);
		Assert.assertEquals("Queue", queueBoxText);
		
	}

	@Then("I click on get started on queue")
	public void i_click_on_get_started_on_queue() {
		click(Queue.QueueGetStarted);
		System.out.println("Queue Get Started Button Clicked");
		LoggerLoad.info("Queue Get Started Button Clicked");
		System.out.println("-------------------------------------------------------");
		
	}

	

	@Then("I verify the Queue Try here functionalities with input \"(.*)\"$")
	public void i_verify_the_Queue_try_here_functionalities_with_input(String input) {
		tryEditor(input);
	}

	@Then("I verify the valid result for queue positive scenario for \"(.*)\"$")
	public void i_verify_the_valid_result_for_queue_positive_scenario_for(String input) {

		String actual = getText(Queue.output);
		Assert.assertEquals("hello", actual);

		System.out.println("Positive Flow is verified successfully for " + input);
		backWindow();

	}

	

	@Then("I validate the queue pop up and error message \"(.*)\" for negative scenario for \"(.*)\"$")
	public void i_validate_the_queue_pop_up_and_error_message_for_negative_scenario(String errorMessage, String input) {
		String alertErrorMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(errorMessage, alertErrorMessage);
		closePopUp();
		System.out.println("Negative Flow is verified successfully for " + input);
		System.out.println("-------------------------------------------------------");
		backWindow();
	

	}

	@Then("I click on Implementation of Queue in Python")
	public void i_click_on_implementation_of_queue_in_python() {
		click(Queue.impList);
	}

	@Then("I click on Implementation using collections in Python")
	public void i_click_on_implementation_of_collections_in_python() {
		click(Queue.impCollection);
	}

	@Then("I click on Implementation using array")
	public void i_click_on_implementation_using_array() {
		click(Queue.impArray);
	}

	@Then("I click on Implementation queue operations")
	public void i_click_on_implementation_queue_operations() {
		click(Queue.queueOp);
	}
	
	@Then("I click on Practice Questions of Queue")
	public void i_click_on_Practice_Questions_of_Queue() {
		click(Queue.practiceQuestions);
	}


	@Then("I verify the Queue blank page for \"(.*)\"$")
	public void i_verify_the_queue_blank_page_for(String input) {

		String actual = getText(Queue.blankPage);
		Assert.assertEquals("", actual);

		System.out.println("Positive Flow is verified successfully for " + input);
		backWindow();

	}
	@Then("I verify the queue valid result for positive scenario")
	public void i_verify_the__queue_valid_result_for_positive_scenario() {

		String actual = getText(Queue.output);
		Assert.assertEquals("hello", actual);
	}
	
	

}
