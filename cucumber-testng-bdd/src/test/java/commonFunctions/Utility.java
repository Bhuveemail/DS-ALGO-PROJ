package commonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.cli.Main;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import pages.Array;
import pages.Queue;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility extends BaseTest {

	public void loadUI(String url) {

		driver.get(url);
	}

	public static void tearDown() {
		driver.quit();
	}
	public void implicitWait(long time) {

		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public void maximizeWindow() {

		driver.manage().window().maximize();
	}

	public void refreshWindow() {

		driver.navigate().refresh();
	}

	public void backWindow() {
		driver.navigate().back();
	}

	public void click(By element) {

		driver.findElement(element).click();
	}

	public void sendText(By element, String keys) {

		driver.findElement(element).sendKeys(keys);
	}

	public String getText(By element) {

		String text = driver.findElement(element).getText();
		return text;
	}

	public int getElementSize(By element) {
		int elementSize=driver.findElements(element).size();
		return elementSize;
	}
	public Boolean isDisplayed(By element) {

		Boolean presents = driver.findElement(element).isDisplayed();
		return presents;

	}
public void highlightElement(WebElement element) throws InterruptedException {
	 
     JavascriptExecutor jse = (JavascriptExecutor) driver;
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

		implicitWait(10);
		driver.switchTo().activeElement().sendKeys(Keys.chord(Keys.chord(Keys.CONTROL + "A")));
		driver.switchTo().activeElement().sendKeys(Keys.CLEAR);
		driver.switchTo().activeElement().sendKeys(input);

		click(Queue.run);

		implicitWait(10);
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
		implicitWait(0);

	}

	public void ArrayRunEditor(String input) {
		driver.switchTo().activeElement().sendKeys(input);
		click(Array.run);
		implicitWait(10);
	}

	public void closePopUp() {
		driver.switchTo().alert().accept();
	}

	public static Properties loadProperties() throws FileNotFoundException, IOException {

		String configPath = "src/test/resources/config.properties";
		configProps.load(new FileInputStream(configPath));
		return configProps;

	}

	public void takeScreenshot(Scenario scenario) {
		TakesScreenshot ts = (TakesScreenshot) driver;

		byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(src, "image/png", "screenshot");
	}

}