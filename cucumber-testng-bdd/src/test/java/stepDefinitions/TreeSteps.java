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
import pages.Tree;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;

public class TreeSteps extends Utility {

//	@After
//	public static void afterAll() throws Throwable {
//		driver.quit();
//	}

	@Then("I verify the Tree box displays")
	public void i_verify_the_Tree_box_displays() {
		String treeBoxText = getText(Tree.TreeCard);
		Assert.assertEquals("Tree", treeBoxText);
	}

	@Then("I click on get started on Tree")
	public void i_click_on_get_started_on_Tree() {

		click(Tree.TreeGetStarted);
		System.out.println("Tree Get Started Button Clicked");
		System.out.println("-------------------------------------------------------");

	}

	

	@Then("I verify the Tree Try here functionalities with input \"(.*)\"$")
	public void i_verify_the_Tree_try_here_functionalities_with_input(String input) {

		tryEditor(input);

	}

	@Then("I verify the valid result for Tree positive scenario for \"(.*)\"$")
	public void i_verify_the_valid_result_for_tree_positive_scenario_for(String input) {

		String actual = getText(Queue.output);
		Assert.assertEquals("hello", actual);

		System.out.println("Positive Flow is verified successfully for " + input);
		backWindow();

	}

	@Then("I validate the Tree pop up and error message \"(.*)\" for negative scenario for \"(.*)\"$")
	public void i_validate_the_tree_pop_up_and_error_message_for_negative_scenario(String errorMessage, String input) {
		String alertErrorMessage = getDriver().switchTo().alert().getText();
		Assert.assertEquals(errorMessage, alertErrorMessage);
		closePopUp();
		System.out.println("Negative Flow is verified successfully for " + input);
		System.out.println("-------------------------------------------------------");
		backWindow();

	}

	@Then("I click on Overview of Trees")
	public void i_click_on_Overview_of_Trees() {
		click(Tree.overview);
	}

	@Then("I click on Terminologies")
	public void i_click_on_Terminlogies() {
		click(Tree.terminologies);
	}

	@Then("I click on Types of Trees")
	public void i_click_on_Types_of_Trees() {
		click(Tree.typesoftrees);
	}

	@Then("I click on Tree Traversals")
	public void i_click_on_Tree_Traversals() {
		click(Tree.treetraversals);
	}

	@Then("I click on Traversals Illustration")
	public void i_click_on_Traversals_Illustration() {
		click(Tree.traversalsillu);
	}

	@Then("I click on Binary Trees")
	public void i_click_on_Binary_Trees() {
		click(Tree.binarytree);
	}

	@Then("I click on Types of Binary Trees")
	public void i_click_on_Types_of_Binary_Trees() {
		click(Tree.typesofbinary);
	}

	@Then("I click on Implementation in Python")
	public void i_click_on_Implementation_in_python() {
		click(Tree.typesofbinary);
	}

	@Then("I click on Binary Tree Traversals")
	public void i_click_on_Binary_Tree_Traversals() {
		click(Tree.binarytreetraver);
	}

	@Then("I click on Implementation of Binary Trees")
	public void i_click_on_Implementation_of_Binary_Trees() {
		click(Tree.impofbinary);
	}

	@Then("I click on Applications of Binary trees")
	public void i_click_on_Applications_of_Binary_trees() {
		click(Tree.appofbinary);
	}

	@Then("I click on Binary Search Trees")
	public void i_click_on_Binary_search_Trees() {
		click(Tree.binarysearch);
	}

	@Then("I click on Implementation Of BST")
	public void i_click_on_Implementation_of_BST() {
		click(Tree.impofbst);
	}

	@Then("I verify the Tree valid result for positive scenario")
	public void i_verify_the_Tree_valid_result_for_positive_scenario() {

		String actual = getText(Tree.output);
		Assert.assertEquals("hello", actual);
	}
}
