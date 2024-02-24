package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

import commonFunctions.BaseTest;
import commonFunctions.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Home;
import pages.Register;
import pages.SignIn;

import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;

public class RegisterSteps extends Utility {

	@When("I click on register link")
	public void i_click_on_register_link() throws InvalidFormatException, IOException {
		click(Register.registerLink);
	}

	@Then("I verify the user name password confirm password register button and Login link on Register page")
	public void i_verify_the_user_name_password_confirm_password_register_button_and_login_link_on_register_page() {
		String actualPageContent = getText(Register.pageContent).replaceAll("\\r", " ").replaceAll("\\n", " ");
		System.out.println(actualPageContent);
		String ExpectedPageContent = "Username: Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. Password: Your password can’t be too similar to your other personal information. Your password must contain at least 8 characters. Your password can’t be a commonly used password. Your password can’t be entirely numeric. Password confirmation: Enter the same password as before, for verification.";
		Assert.assertEquals(ExpectedPageContent, actualPageContent);

		Boolean userName = isDisplayed(Register.userName);
		Assert.assertEquals(true, userName);
		Boolean password = isDisplayed(Register.password);
		Assert.assertEquals(true, password);
		Boolean confirmPassword = isDisplayed(Register.confirmationPassword);
		Assert.assertEquals(true, confirmPassword);
		Boolean registerButton = isDisplayed(Register.registerButton);
		Assert.assertEquals(true, registerButton);
		Boolean loginLink = isDisplayed(Register.loginLink);
		Assert.assertEquals(true, loginLink);

	}

	@Then("I verify the successful Registration")
	public void i_verify_the_successful_registration() {
		sendText(Register.userName, "goninjas@dsalgo");
		sendText(Register.password, "project4algo");
		sendText(Register.confirmationPassword, "project4algo");
		click(Register.registerButton);

	}

	@Then("I verify the error message for invalid User Name \"(.*)\" and Valid Password \"(.*)\" and Valid confirmation password \"(.*)\"$")
	public void i_verify_the_error_message_for_invalid_user_name_and_valid_password_and_valid_confirmation_password(
		String username, String password, String confirmationpassword) {
		sendText(Register.userName, username);
		sendText(Register.password, password);
		sendText(Register.confirmationPassword, confirmationpassword);
		click(Register.registerButton);
		implicitWait(20);
		String actualError = getText(Register.errorMessge).replaceAll("\\n", "").replaceAll("\\r", "");
		System.out.println("Error Message - " + actualError);
		Assert.assertEquals("password_mismatch:The two password fields didn’t match.", actualError);

	}

	@Then("I verify the error message for Valid User Name \"(.*)\" and Invalid Password \"(.*)\" and Valid confirmation password \"(.*)\"$")
	public void i_verify_the_error_message_for_valid_user_name_and_invalid_password_and_valid_confirmation_password(
		String username, String password, String confirmationpassword) {
		sendText(Register.userName, username);
		sendText(Register.password, password);
		sendText(Register.confirmationPassword, confirmationpassword);
		click(Register.registerButton);
		implicitWait(20);
		String actualError = getText(Register.errorMessge).replaceAll("\\n", "").replaceAll("\\r", "");
		System.out.println("Error Message - " + actualError);
		Assert.assertEquals("password_mismatch:The two password fields didn’t match.", actualError);

	}

	@Then("I verify the error message for Valid User Name \"(.*)\" and Valid Password \"(.*)\" and Invalid confirmation password \"(.*)\"$")
	public void i_verify_the_error_message_for_valid_user_name_and_valid_password_and_Invalid_confirmation_password(
		String username, String password, String confirmationpassword) {
		sendText(Register.userName, username);
		sendText(Register.password, password);
		sendText(Register.confirmationPassword, confirmationpassword);
		click(Register.registerButton);
		implicitWait(20);
		String actualError = getText(Register.errorMessge).replaceAll("\\n", "").replaceAll("\\r", "");
		System.out.println("Error Message - " + actualError);
		Assert.assertEquals("password_mismatch:The two password fields didn’t match.", actualError);

	}

	@Then("I verify the error message for Invalid User Name \"(.*)\" and Invalid Password \"(.*)\" and Invalid confirmation password \"(.*)\"$")
	public void i_verify_the_error_message_for_Invalid_user_name_and_Invalid_password_and_Invalid_confirmation_password(
			String username, String password, String confirmationpassword) {
		sendText(Register.userName, username);
		sendText(Register.password, password);
		sendText(Register.confirmationPassword, confirmationpassword);
		click(Register.registerButton);
		implicitWait(20);
		String actualError = getText(Register.errorMessge).replaceAll("\\n", "").replaceAll("\\r", "");
		System.out.println("Error Message - " + actualError);
		Assert.assertEquals("password_mismatch:The two password fields didn’t match.", actualError);

	}

}
