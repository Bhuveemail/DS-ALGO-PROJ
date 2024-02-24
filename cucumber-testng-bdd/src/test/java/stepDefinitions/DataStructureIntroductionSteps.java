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
import pages.Array;
import pages.Graph;
import pages.DataStructure;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;

public class DataStructureIntroductionSteps extends Utility {

	@Then("I verify the DataStructure box displays")
	public void i_verify_the_DataStructure_box_displays() {
		String DataStructureBoxText = getText(DataStructure.DataStructureCard);
		Assert.assertEquals("DataStructure", DataStructureBoxText);

	}

	@Then("I click on get started on DataStructure")
	public void i_click_on_get_started_on_DataStructure() {
		click(DataStructure.DataStructureGetStarted);
		System.out.println("DataStructure Get Started Button Clicked");
		System.out.println("-------------------------------------------------------");
	}

	


	@Then("I verify the DataStructure Try here functionalities with code file \"(.*)\"$")
	public void i_verify_the_DataStructure_try_here_functionalities(String file) {

		Boolean actual = isDisplayed(DataStructure.tryHere);
		Assert.assertEquals(true, actual);
		click(DataStructure.tryHere);
		String text = readText(file);
		implicitWait(10);
		driver.switchTo().activeElement().sendKeys(text);
		
		click(DataStructure.run);
		implicitWait(10);

	}

	@Then("I verify the DataStructure Try here functionalities with input \"(.*)\"$")
	public void i_verify_the_DataStructure_try_here_functionalities_with_input(String input) {
		tryEditor(input);
	}

	@Then("I verify the valid result for DataStructure positive scenario for \"(.*)\"$")
	public void i_verify_the_valid_result_for_DataStructure_positive_scenario_for(String input) {

		String actual = getText(DataStructure.output);
		Assert.assertEquals("hello", actual);

		implicitWait(10);
		System.out.println("Positive Flow is verified successfully for " + input);
		backWindow();
		implicitWait(10);

	}

	

	@Then("I verify the blank page for \"(.*)\"$")
	public void i_verify_the_blank_page_for(String input) {

		String actual = getText(DataStructure.blankPage);
		Assert.assertEquals("", actual);

		implicitWait(10);
		System.out.println("Positive Flow is verified successfully for " + input);
		backWindow();
		implicitWait(10);

	}


	@Then("I click on Time Complexity of DataStructure")
	public void i_click_on_Time_Complexity_of_DataStructure() {
		click(DataStructure.timeComplexity);
	}
	
	@Then("I click on Practice Questions of DataStructure")
	public void i_click_on_Practice_Questions_of_DataStructure() {
		click(DataStructure.practiceQuestions);
	}


	@Then("I verify the DataStructure valid result for positive scenario")
	public void i_verify_the__DataStructure_valid_result_for_positive_scenario() {

		String actual = getText(DataStructure.output);
		Assert.assertEquals("hello", actual);
	}
	
	@Then("I validate the DataStructure pop up and error message \"(.*)\" for negative scenario for \"(.*)\"$")
	public void i_validate_the_DataStructure_pop_up_and_error_message_for_negative_scenario(String errorMessage, String input) {
		String alertErrorMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(errorMessage, alertErrorMessage);
		closePopUp();
		System.out.println("Negative Flow is verified successfully for " + input);
		System.out.println("-------------------------------------------------------");
		backWindow();
		implicitWait(10);

	}

}
