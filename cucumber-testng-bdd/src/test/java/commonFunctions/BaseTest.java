package commonFunctions;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.io.File;
import java.io.FileNotFoundException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static Properties configProps = new Properties();
	public static Scenario scenario;
	public static WebDriver driver = null;



	public static WebDriver invokeBrowser(String browser) throws FileNotFoundException, IOException {
		
		BaseTest.configProps=Utility.loadProperties();
		

			if (browser.equalsIgnoreCase("firefox")) {

				//Loggerload.info("Testing on firefox");
				if(BaseTest.configProps.getProperty("headless").equalsIgnoreCase("Y"))
				{				
				FirefoxOptions options = new FirefoxOptions();
		        options.addArguments("-headless");
		        driver = new FirefoxDriver(options);
		        System.out.println("Launching Headless - "+browser.toUpperCase()+" Browser");
				}
				else {
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					System.out.println("Launching - "+browser.toUpperCase()+" Browser");
				}
				
				} else if (browser.equalsIgnoreCase("chrome")) {

				//Loggerload.info("Testing on chrome");
					if(BaseTest.configProps.getProperty("headless").equalsIgnoreCase("Y"))
					{				
					ChromeOptions options = new ChromeOptions();
			        options.addArguments("-headless");
			        driver = new ChromeDriver(options);	
			        System.out.println("Launching Headless - "+browser.toUpperCase()+" Browser");
					}
					else {
						WebDriverManager.chromedriver().browserVersion("108.0.0").setup();
						driver = new ChromeDriver();
						System.out.println("Launching - "+browser.toUpperCase()+" Browser");
					}
					

			} else if (browser.equalsIgnoreCase("safari")) {
				
					WebDriverManager.safaridriver().setup();
					driver = new SafariDriver();
					System.out.println("Launching - "+browser+" Browser");

			} else if (browser.equalsIgnoreCase("edge")) {

				if(BaseTest.configProps.getProperty("headless").equalsIgnoreCase("Y"))
				{				
				EdgeOptions options = new EdgeOptions();
		        options.addArguments("-headless");
		        driver = new EdgeDriver(options); 
		        System.out.println("Launching Headless - "+browser.toUpperCase()+" Browser");
				}
				else {
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
					System.out.println("Launching - "+browser.toUpperCase()+" Browser");
				}
				 

			}

			// Set Page load timeout

			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

			driver.manage().window().maximize();

			return driver;

		
	}

	public static List<Map<String, String>> getData(String excelFilePath, String sheetName)
			throws InvalidFormatException, IOException {
		Sheet sheet = getSheetByName(excelFilePath, sheetName);
		return readSheet(sheet);
	}

	public List<Map<String, String>> getData(String excelFilePath, int sheetNumber)
			throws InvalidFormatException, IOException {
		Sheet sheet = getSheetByIndex(excelFilePath, sheetNumber);
		return readSheet(sheet);
	}

	private static Sheet getSheetByName(String excelFilePath, String sheetName)
			throws IOException, InvalidFormatException {
		Sheet sheet = getWorkBook(excelFilePath).getSheet(sheetName);
		return sheet;
	}

	private Sheet getSheetByIndex(String excelFilePath, int sheetNumber) throws IOException, InvalidFormatException {
		Sheet sheet = getWorkBook(excelFilePath).getSheetAt(sheetNumber);
		return sheet;
	}

	private static Workbook getWorkBook(String excelFilePath) throws IOException, InvalidFormatException {
		return WorkbookFactory.create(new File(excelFilePath));
	}
//
	private static List<Map<String, String>> readSheet(Sheet sheet) {
		Row row;
		int totalRow = sheet.getPhysicalNumberOfRows();
		List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();
		int headerRowNumber = getHeaderRowNumber(sheet);
		if (headerRowNumber != -1) {
			int totalColumn = sheet.getRow(headerRowNumber).getLastCellNum();
			int setCurrentRow = 1;
			for (int currentRow = setCurrentRow; currentRow <= totalRow; currentRow++) {
				row = getRow(sheet, sheet.getFirstRowNum() + currentRow);
				LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();
				for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {
					columnMapdata.putAll(getCellValue(sheet, row, currentColumn));
				}
				excelRows.add(columnMapdata);
			}
		}
		return excelRows;
	}

	private static int getHeaderRowNumber(Sheet sheet) {
		Row row;
		int totalRow = sheet.getLastRowNum();
		for (int currentRow = 0; currentRow <= totalRow + 1; currentRow++) {
			row = getRow(sheet, currentRow);
			if (row != null) {
				int totalColumn = row.getLastCellNum();
				for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {
					Cell cell;
					cell = row.getCell(currentColumn, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);

					return row.getRowNum();

				}
			}
		}
		return (-1);
	}

	private static Row getRow(Sheet sheet, int rowNumber) {
		return sheet.getRow(rowNumber);
	}

	private static LinkedHashMap<String, String> getCellValue(Sheet sheet, Row row, int currentColumn) {
		LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();
		Cell cell;
		if (row == null) {

			String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn).getStringCellValue();
			columnMapdata.put(columnHeaderName, "");

		} else {
			cell = row.getCell(currentColumn, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
			String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(cell.getColumnIndex())
					.getStringCellValue();
			columnMapdata.put(columnHeaderName, cell.getStringCellValue());
		}

		return columnMapdata;
	}

}
