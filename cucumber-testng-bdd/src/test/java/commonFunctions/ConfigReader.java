package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private static String browserType = null;

	public static void setBrowserType(String browser) {

		browserType = browser;

	}

	public static String getBrowserType() throws Throwable {

		if (browserType != null)

			return browserType;
		
		return browserType;


	}

	public void loadProperties() throws IOException {
		// TODO Auto-generated method stub
		Properties props=new Properties();
		FileInputStream fis= new FileInputStream("src/test/resources/config.properties");
		props.load(fis);
		
		
		
		
	}
}