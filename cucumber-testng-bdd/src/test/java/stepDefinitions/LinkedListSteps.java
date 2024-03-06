package stepDefinitions;

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
import pages.SignIn;
import pages.Home;
import pages.LinkedList;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class LinkedListSteps extends Utility{
	
	@Then("I verify the linkedList box displays")
	public void i_verify_the_linkedList_box_displays() {
		String linkedListBoxText = getText(LinkedList.llistCard);
		Assert.assertEquals("LinkedList", linkedListBoxText);

	}

	@Then("I click on get started on linkedList")
	public void i_click_on_get_started_on_linkedList() {
		click(LinkedList.GetStarted);
		System.out.println("LinkedList Get Started Button Clicked");
		System.out.println("-------------------------------------------------------");
	}

	@Then("I verify the topic covered list linkedList")
	public void i_verify_the_topic_covered_list_linkedList() {

		String introduction = getText(LinkedList.introduction);
		Assert.assertEquals("Introduction", introduction);
		String creatingll = getText(LinkedList.creatingll);
		Assert.assertEquals("Creating Linked List", creatingll);
		String typesofll  = getText(LinkedList.typesofll);
		Assert.assertEquals("Types Of Linked List", typesofll);
		String implementllinpython = getText(LinkedList.implementllinpython);
		Assert.assertEquals("Implement Linked List In Python", implementllinpython);
		String traversal = getText(LinkedList.traversal);
		Assert.assertEquals("Traversal", traversal);
		String insertion = getText(LinkedList.insertion);
		Assert.assertEquals("Insertion", insertion);
		String deletion = getText(LinkedList.deletion);
		Assert.assertEquals("Deletion", deletion);
		//String practiceQtn = getText(LinkedList.practiceQtn);
		//Assert.assertEquals("Practice Question", practiceQtn);
		
	}

	@Then("I verify the  linkedList Try here functionalities with code file \"(.*)\"$")
	public void i_verify_the_linkedList_try_here_functionalities(String file) {

		Boolean actual = isDisplayed(LinkedList.tryHere);
		Assert.assertEquals(true, actual);
		click(LinkedList.tryHere);
		String text = readText(file);
		waitTillElementVisible(LinkedList.run, 30);
		getDriver().switchTo().activeElement().sendKeys(text);
		click(LinkedList.run);
	

	}

	@Then("I verify the linkedList Try here functionalities with input \"(.*)\"$")
	public void i_verify_the_linkedList_try_here_functionalities_with_input(String input) {
		tryEditor(input);
	}

	@Then("I verify the valid result for linkedList positive scenario for \"(.*)\"$")
	public void i_verify_the_valid_result_for_linkedList_positive_scenario_for(String input) {

		String actual = getText(LinkedList.output);
		Assert.assertEquals("hello", actual);

		
		System.out.println("Positive Flow is verified successfully for " + input);
		backWindow();

	}

	@Then("I validate the linkedList pop up and error message \"(.*)\" for negative scenario for \"(.*)\"$")
	public void i_validate_the_linkedList_pop_up_and_error_message_for_negative_scenario(String errorMessage, String input) {
		String alertErrorMessage = getDriver().switchTo().alert().getText();
		Assert.assertEquals(errorMessage, alertErrorMessage);
		closePopUp();
		System.out.println("Negative Flow is verified successfully for " + input);
		System.out.println("-------------------------------------------------------");
		backWindow();
	

	}

	@Then("I click on Introduction")
	public void i_click_on_introduction() {
		click(LinkedList.introduction);
	}
	
	@Then("I click on Creating Linked List")
	public void i_click_on_creating_linked_list() {
		click(LinkedList.creatingll);
	   
	}
	
	@Then("I click on Types Of Linked List")
	public void i_click_on_types_of_linked_list()  {
		click(LinkedList.typesofll);
	}
    
	@Then("I click on Implement Linked List In Python")
	public void i_click_on_implement_linked_list_in_python() {
		click(LinkedList.implementllinpython);
	   
	}

	@Then("I click on Traversal")
	public void i_click_on_traversal() {
		click(LinkedList.traversal);
	   
	}

	@Then("I click on Insertion")
	public void i_click_on_insertion() {
		click(LinkedList.insertion);
	   
	}

	@Then("I click on Deletion")
	public void i_click_on_deletion() {
		click(LinkedList.deletion);
	   
	}

	@Then("I click on Practice Questions of LinkedList")
	public void i_click_on_Practice_Questions_of_DataStructure() {
		click(LinkedList.practiceQuestions);
	}

	
	
}
