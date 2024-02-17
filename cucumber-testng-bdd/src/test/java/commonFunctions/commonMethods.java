package commonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
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
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import pages.Queue;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class commonMethods {
	 public static WebDriver driver;
	
		/*
		 * public static void setUpDriver(String browser) { invokeBrowser (browser); }
		 */
	public static void tearDown() {
	
		driver.quit();
	}
	
	
	public static void invokeBrowser(String browser) {
		
		if(envDetails.browser.equalsIgnoreCase("Chrome")) {
	    	System.setProperty("webdriver.chrome.driver",constants.chromePath);
	        driver = new ChromeDriver();
	        System.out.println("Invoke Browser - "+browser);
	    	}
	    	else if (envDetails.browser.equalsIgnoreCase("Firefox")) {
				/*
				 * System.setProperty("webdriver.chrome.driver",constants.chromePath); driver =
				 * new FirefoxDriver();
				 */
	        	}
	    	else if (envDetails.browser.equalsIgnoreCase("IE")) {
				/*
				 * System.setProperty("webdriver.chrome.driver",constants.chromePath); driver =
				 * new FirefoxDriver();
				 */
	        	}
	}


	public void loadUI(String url) {
		
		driver.get(url);
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
		
		String text=driver.findElement(element).getText();
		return text;
	}
	public Boolean isDisplayed(By element) {
		
		Boolean presents=driver.findElement(element).isDisplayed();
		return presents;

	}
	public String readText(String filePath) {
		String data = "";
		try {
		      File myObj = new File(filePath);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        data = data+"\n"+myReader.nextLine();
		        //System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		return data;
		
		  }
	public void tryEditor(String input) {
		Boolean actual=isDisplayed(Queue.tryHere);
		Assert.assertEquals(true, actual);
		click(Queue.tryHere);
		

		implicitWait(10);
		driver.switchTo().activeElement().sendKeys(Keys.CLEAR);
		driver.switchTo().activeElement().sendKeys(input);
				
		click(Queue.run);
		
		implicitWait(10);
	}
	public void closePopUp() {
	driver.switchTo().alert().accept();
	}
    
	
}
