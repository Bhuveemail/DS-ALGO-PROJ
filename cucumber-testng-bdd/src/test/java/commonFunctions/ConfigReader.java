package commonFunctions;

public class ConfigReader {

	private static String browserType = null;

	public static void setBrowserType(String browser) {

		browserType = browser;
//
	}

	public static String getBrowserType() throws Throwable {

		if (browserType != null)

			return browserType;
		
		return browserType;


	}
}