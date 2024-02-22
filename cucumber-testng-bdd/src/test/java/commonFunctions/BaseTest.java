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
import pages.LinkedList;
import pages.Queue;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseTest {
	
	public static Properties envProps = new Properties();
	public static Scenario scenario;	
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
		        BaseTest.driver = new ChromeDriver();
		        System.out.println("Invoke Browser - "+browser);
	        	}
		else if(browser.equalsIgnoreCase("Edge")){
			System.setProperty("webdriver.edge.driver",envProps.getProperty("EdgePath"));
			BaseTest.driver = new EdgeDriver();
		}
	}


	
	
}
