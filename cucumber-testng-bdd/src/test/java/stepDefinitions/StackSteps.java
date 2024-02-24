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
import pages.Queue;
import pages.Stack;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;

public class StackSteps extends Utility {

//	@After
//	public static void afterAll() throws Throwable {
//		driver.quit();
//	}

	@Then("I verify the Stack box displays")
	public void i_verify_the_Stack_box_displays() {
		String StackBoxText = getText(Stack.StackCard);
		Assert.assertEquals("Stack", StackBoxText);
	}

	@When("I click on get started on Stack")
	public void i_click_on_get_started_on_Stack() {

		click(Stack.StackgetStarted);
		System.out.println("Stack Get Started Button Clicked");
		System.out.println("-------------------------------------------------------");

	}

	@Then("I verify the Stack Try here functionalities with input \"(.*)\"$")
	public void i_verify_the_Stack_try_here_functionalities_with_input(String input) {

		tryEditor(input);

	}

	@Then("I verify the valid result for Stack positive scenario for \"(.*)\"$")
	public void i_verify_the_valid_result_for_Stack_positive_scenario_for(String input) {

		String actual = getText(Stack.output);
		Assert.assertEquals("hello", actual);

		implicitWait(10);
		System.out.println("Positive Flow is verified successfully for " + input);
		backWindow();
		implicitWait(10);

	}

	@Then("I validate the Stack pop up and error message \"(.*)\" for negative scenario for \"(.*)\"$")
	public void i_validate_the_Stack_pop_up_and_error_message_for_negative_scenario(String errorMessage, String input) {
		String alertErrorMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(errorMessage, alertErrorMessage);
		closePopUp();
		System.out.println("Negative Flow is verified successfully for " + input);
		System.out.println("-------------------------------------------------------");
		backWindow();
		implicitWait(10);

	}

	@Then("I click on Operations in Stack")
	public void i_click_on_Operations_in_Stack() {
		click(Stack.operationsstack);
	}

	@Then("I click on Implementation")
	public void i_click_on_Implementation() {
		click(Stack.Implementation);
	}
	@Then("I click on Applications")
	public void i_click_on_Applications() {
		click(Stack.Applications);
	}
      
	@Then("I click on Practice Questions of Stack")
	public void i_click_on_Practice_Questions_of_Stack() {
		click(Stack.practicequestions);
	}


	@Then("I verify the Stack blank page for \"(.*)\"$")
	public void i_verify_the_Stack_blank_page_for(String input) {

		String actual = getText(Stack.blankPage);
		Assert.assertEquals("", actual);

		implicitWait(10);
		System.out.println("Positive Flow is verified successfully for " + input);
		backWindow();
		implicitWait(10);

	}
	@Then("I verify the Stack valid result for positive scenario")
	public void i_verify_the_Stack_valid_result_for_positive_scenario() {

		String actual = getText(Stack.output);
		Assert.assertEquals("hello", actual);
	}
}
