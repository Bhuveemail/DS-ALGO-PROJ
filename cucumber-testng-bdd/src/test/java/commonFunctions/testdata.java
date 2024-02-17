package commonFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class testdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//obtaining input bytes from a file  
		FileInputStream fis=new FileInputStream(new File("C:/Users/baalu/eclipse-workspace/cucumber-testng-bdd/src/test/resources/testData/testData1.xls"));  
		//creating workbook instance that refers to .xls file  
		HSSFWorkbook wb=new HSSFWorkbook(fis);   
		//creating a Sheet object to retrieve the object  
		HSSFSheet sheet=wb.getSheetAt(0);  
		//evaluating cell type   
		HSSFFormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();  
		for(Row row: sheet)     //iteration over row using for each loop  
		{  
		for(Cell cell: row)    //iteration over cell using for each loop  
		{  

		System.out.print(cell.getStringCellValue()+ "\t\t");  
		 
		}  
		}  
		System.out.println();  
		
		 
	}

}
