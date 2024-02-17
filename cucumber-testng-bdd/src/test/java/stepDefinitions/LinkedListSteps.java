package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import commonFunctions.commonMethods;
import commonFunctions.objectRepo;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;

public class LinkedListSteps extends commonMethods{
	 @When("I click on get started on linked list")
	    public void i_click_on_get_started_on_linked_list() {
	      
	    	click(objectRepo.linkedListGetStarted);
	    	System.out.println("Linked List Get Started Button Clicked");
	    	
	    }
}




