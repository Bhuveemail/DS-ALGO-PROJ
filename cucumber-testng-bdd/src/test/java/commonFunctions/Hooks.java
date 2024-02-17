package commonFunctions;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends commonMethods {
//	@Before
//    public static void setUp() {
// 
//       commonFunctions.setUpDriver();
//    }
     
    @AfterStep
    public static void screenshot(Scenario scenario) throws IOException {
    	
         File sourcePath=    ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
         scenario.attach(fileContent, "image/png", "image");
         
    	
    }
    @AfterTest
    public static void tearDown(Scenario scenario) {
 
        //validate if scenario has failed
        
       
         
        commonMethods.tearDown();
    }
    
}
