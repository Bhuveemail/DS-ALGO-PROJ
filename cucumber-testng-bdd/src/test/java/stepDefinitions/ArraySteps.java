package stepDefinitions;

import java.awt.AWTException;
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


import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;

public class ArraySteps extends Utility {


	@Then("I verify the array box displays")
	public void i_verify_the_array_box_displays() {
		String  arrayBoxText = getText(Array.ArrayCard);
		Assert.assertEquals("Array", arrayBoxText);
		
	}

	@Then("I click on get started on array")
	public void i_click_on_get_started_on_array() {
		click(Array.ArrayGetStarted);
		System.out.println("Array Get Started Button Clicked");
		System.out.println("-------------------------------------------------------");
		
	}

	

	@Then("I verify the Array Try here functionalities with input \"(.*)\"$")
	public void i_verify_the_Array_try_here_functionalities_with_input(String input) {
		tryEditor(input);
	}
	
	
	@Then("I clear Editor box$")
	public void i_clear_editor_box() throws AWTException {
		IdentationEditorBox();
	}

	@Then("I verify the Array Run functionalities with input \"(.*)\"$")
	public void i_verify_the_Array_run_here_functionalities_with_input(String input) {
		ArrayRunEditor(input);
	}
	
	@Then("I verify the valid result for Array positive scenario for \"(.*)\"$")
	public void i_verify_the_valid_result_for_Array_positive_scenario_for(String input) {
		implicitWait(10);
		String actual = getText(Array.output);
		Assert.assertEquals("hello", actual);

		implicitWait(10);
		System.out.println("Positive Flow is verified successfully for " + input);
		backWindow();
		implicitWait(10);
		
	}
	
	@Then("I verify the valid input for Array positive scenario for \"(.*)\"$")
	public void i_verify_the_valid_input_for_Array_positive_scenario_for(String input) {
		implicitWait(10);
		String actual = getText(Array.output);
		Assert.assertEquals("hello", actual);

		implicitWait(10);
		System.out.println("Positive Flow is verified successfully for " + input);
	
		
	}
	@Then("I verify the error \"(.*)\" occured while submit for \"(.*)\"$")
	public void i_verify_the_error_occured_while_submit_for(String error, String input) throws InterruptedException {
		implicitWait(30);
		click(Array.submit);
		Thread.sleep(2000);
		String actual = getText(Array.output).trim();
		Assert.assertEquals(error, actual);
		System.out.println("Error - "+error+" is verified successfully for " + input);
		backWindow();
		implicitWait(10);

	}
	 
	

	@Then("I validate the Array pop up and error message \"(.*)\" for negative scenario for \"(.*)\"$")
	public void i_validate_the_Array_pop_up_and_error_message_for_negative_scenario(String errorMessage, String input) {
		String alertErrorMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(errorMessage, alertErrorMessage);
		closePopUp();
		System.out.println("Negative Flow is verified successfully for " + input);
		System.out.println("-------------------------------------------------------");
		backWindow();
		implicitWait(10);

	}

	@Then("I click on Arrays in Python")
	public void i_click_on_Arrays_in_Python() {
		click(Array.arraysinpython);
	}
	@Then("I click on Arrays in Python Link")
	public void i_click_on_Arrays_in_Python_link() {
		click(Array.arraysinpythonLink);
	}
	

	@Then("I click on Arrays Using List")
	public void i_click_on_Arrays_Using_List() {
		click(Array.arrayList);
	}

	@Then("I click on Basic Operations in Lists")
	public void i_click_on_Basic_Operations_inLists() {
		click(Array.basicoperlist);
	}

	@Then("I click on Applications of Array")
	public void i_click_on_Applications_of_Array() {
		click(Array.appofarray);
	}
	
	@Then("I click on Practice Questions of Array")
	public void i_click_on_Practice_Questions_of_Arraay() {
		click(Array.practiceQues);
	}

	
	@Then("I click on Search the Array")
	public void i_click_on_Search_the_Array() {
		click(Array.searchArray);
		
	}	

	@Then("I click on Max Consecutive Ones")
	public void i_click_on_max_consecutive_ones() {
		click(Array.maxConsecutiveOnes);
	}
	@Then("I click on Find Numbers with Even Numbers of Digit")
	public void i_click_on_find_nummbers_with_even_numbers_of_digit() {
		click(Array.findNos);
	}
	@Then("I click on Squares of Sorted Array")
	public void i_click_on_squares_of_sorted_array() {
		click(Array.squaresSortedArray);
	}
	

}
