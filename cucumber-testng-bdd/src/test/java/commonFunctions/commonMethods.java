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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.cli.Main;
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
	public static Properties envProps = new Properties();
	
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws Throwable {	
		try {	   
			Main.main(new String[] { 	    
					"-g","ccommonFunctions",	    
					"-g","stepDefinitions",	     
					"-g","Runners.TestRunner",	  
					"classpath:features", 	        
					"-t","@SmokeTest",	        
					"-p", "pretty", 	   
					"-p", "json:target/cucumber-reports/cucumber.json", 	
					"-p", "html:target/cucumber-reports/cucumberreport.html",	  
					"-p","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",	
					"-m"	 
					}	    );
			} catch (Exception e) {	
				e.printStackTrace();	    
				System.out.println("Main method exception : " + e);	}	
		}
	
	 public static WebDriver driver;
	
		/*
		 * public static void setUpDriver(String browser) { invokeBrowser (browser); }
		 */
		
		 public static void tearDown() {
		  
		  driver.quit(); 
		  }
		 
		 
	
	 
	public static void invokeBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
	    	System.setProperty("webdriver.chrome.driver",envProps.getProperty("chromePath"));
	        driver = new ChromeDriver();
	        System.out.println("Invoke Browser - "+browser);
	    	}
	    	else if (browser.equalsIgnoreCase("Firefox")) {
	    		System.setProperty("webdriver.chrome.driver",envProps.getProperty("chromePath"));
		        commonMethods.driver = new ChromeDriver();
		        System.out.println("Invoke Browser - "+browser);
	        	}
		else if(browser.equalsIgnoreCase("Edge")){
			System.setProperty("webdriver.edge.driver",envProps.getProperty("EdgePath"));
			commonMethods.driver = new EdgeDriver();
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

	public static Properties loadProperties() throws FileNotFoundException, IOException {

		String configPath = "src/test/resources/config.properties";
		envProps.load(new FileInputStream(configPath));
		return envProps;
		
	}

	
    
	
}
