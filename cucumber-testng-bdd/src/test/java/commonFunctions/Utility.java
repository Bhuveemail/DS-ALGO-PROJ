package commonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.time.Duration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.cli.Main;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import pages.Array;
import pages.Queue;
import pages.SignIn;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility extends BaseTest {

	public void loadUI(String url) {

		BaseTest.getDriver().get(url);
	}

	public static void tearDown() {
		BaseTest.getDriver().quit();
	}
	public void implicitWait(long time) {

		BaseTest.getDriver().manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public void maximizeWindow() {

		BaseTest.getDriver().manage().window().maximize();
	}

	public void refreshWindow() {

		BaseTest.getDriver().navigate().refresh();
	}

	public void backWindow() {
		BaseTest.getDriver().navigate().back();
	}

	public void click(By element) {

		BaseTest.getDriver().findElement(element).click();
	}

	public void sendText(By element, String keys) {

		BaseTest.getDriver().findElement(element).sendKeys(keys);
	}

	public String getText(By element) {

		String text = BaseTest.getDriver().findElement(element).getText();
		return text;
	}

	public int getElementSize(By element) {
		int elementSize=BaseTest.getDriver().findElements(element).size();
		return elementSize;
	}
	public Boolean isDisplayed(By element) {

		Boolean presents = BaseTest.getDriver().findElement(element).isDisplayed();
		return presents;

	}
public void highlightElement(WebElement element) throws InterruptedException {
	 
     JavascriptExecutor jse = (JavascriptExecutor) getDriver();
     jse.executeScript("arguments[0].style.border='3px solid red'", element);
     Thread.sleep(500);
}
	public String readText(String filePath) {
		String data = "";
		try {
			File myObj = new File(filePath);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				data = data + "\n" + myReader.nextLine();
				// System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return data;

	}

	public void tryEditor(String input) {
		Boolean actual = isDisplayed(Queue.tryHere);
		Assert.assertEquals(true, actual);
		click(Queue.tryHere);

		waitTillElementVisible(Queue.run, 30);
		BaseTest.getDriver().switchTo().activeElement().sendKeys(Keys.chord(Keys.chord(Keys.CONTROL + "A")));
		BaseTest.getDriver().switchTo().activeElement().sendKeys(Keys.CLEAR);
		BaseTest.getDriver().switchTo().activeElement().sendKeys(input);

		click(Queue.run);

	}

	public void IdentationEditorBox() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_X);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_X);
		

	}

	public void ArrayRunEditor(String input) {
		BaseTest.getDriver().switchTo().activeElement().sendKeys(input);
		click(Array.run);
		
	}

	public void closePopUp() {
		BaseTest.getDriver().switchTo().alert().accept();
	}
	public void closePopUpIfExists() {
		try {
		BaseTest.getDriver().switchTo().alert().accept();
		}
		catch(NoAlertPresentException ex) {
			System.out.println("No alert");
		}
	}

	public static Properties loadProperties() throws FileNotFoundException, IOException {

		String configPath = "src/test/resources/config.properties";
		configProps.load(new FileInputStream(configPath));
		return configProps;
//
	}

	public void takeScreenshot(Scenario scenario) {
		TakesScreenshot ts = (TakesScreenshot) getDriver();

		byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(src, "image/png", "screenshot");
	}
	
	public void waitTillElementVisible(By element, int time) {
//		 WebDriverWait wait = new WebDriverWait((WebDriver) DriverManager.getDrivers(), Duration.ofSeconds(time));
//		 wait.until(ExpectedConditions.visibilityOfElementLocated(element)); 	
	}

}
