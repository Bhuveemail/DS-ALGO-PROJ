package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import commonFunctions.commonMethods;
import commonFunctions.constants;
import commonFunctions.envDetails;
import commonFunctions.objectRepo;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Array;
import pages.Queue;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;

public class QueueSteps extends commonMethods {

	@Then("I verify the queue box displays")
	public void i_verify_the_queue_box_displays() {
		String queueBoxText = getText(Queue.QueueCard);
		Assert.assertEquals("Queue", queueBoxText);

	}

	@When("I click on get started on queue")
	public void i_click_on_get_started_on_queue() {
		click(Queue.QueueGetStarted);
		System.out.println("Queue Get Started Button Clicked");
		System.out.println("-------------------------------------------------------");
	}

	@Then("I verify the topic covered list queue")
	public void i_verify_the_topic_covered_list_queue() {

		String impList = getText(Queue.impList);
		Assert.assertEquals("Implementation of Queue in Python", impList);
		String impCollection = getText(Queue.impCollection);
		Assert.assertEquals("Implementation using collections.deque", impCollection);
		String impArray = getText(Queue.impArray);
		Assert.assertEquals("Implementation using array", impArray);
		String queueOp = getText(Queue.queueOp);
		Assert.assertEquals("Queue Operations", queueOp);
	}

	@Then("I verify the Try here functionalities with code file \"(.*)\"$")
	public void i_verify_the_try_here_functionalities(String file) {

		Boolean actual = isDisplayed(Queue.tryHere);
		Assert.assertEquals(true, actual);
		click(Queue.tryHere);
		String text = readText(file);
		implicitWait(10);
		driver.switchTo().activeElement().sendKeys(text);
		click(Queue.run);
		implicitWait(10);

	}

	@Then("I verify the Try here functionalities with input \"(.*)\"$")
	public void i_verify_the_try_here_functionalities_with_input(String input) {
		tryEditor(input);
	}

	@Then("I verify the valid result for queue positive scenario for \"(.*)\"$")
	public void i_verify_the_valid_result_for_queue_positive_scenario_for(String input) {

		String actual = getText(Queue.output);
		Assert.assertEquals("hello", actual);

		implicitWait(10);
		System.out.println("Positive Flow is verified successfully for " + input);
		backWindow();
		implicitWait(10);

	}

	

	@Then("I validate the queue pop up and error message \"(.*)\" for negative scenario for \"(.*)\"$")
	public void i_validate_the_queue_pop_up_and_error_message_for_negative_scenario(String errorMessage, String input) {
		String alertErrorMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(errorMessage, alertErrorMessage);
		closePopUp();
		System.out.println("Negative Flow is verified successfully for " + input);
		System.out.println("-------------------------------------------------------");
		backWindow();
		implicitWait(10);

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

}
