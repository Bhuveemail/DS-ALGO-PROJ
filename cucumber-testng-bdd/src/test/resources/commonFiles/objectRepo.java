package commonFunctions;

import org.openqa.selenium.By;

public class objectRepo extends CommonFunctions {
	//Login Page
	public static By logoImg=By.xpath("//*[@alt='Google']");
	public static By search=By.xpath("//*[@aria-label='Search']");
	public static By signInLink=By.xpath("//*[@href='/login']");
	public static By userName=By.name("username");
	public static By password=By.name("password");
	public static By loginButton=By.xpath("//*[@value='Login']");
	public static By signOutLink=By.xpath("//*[@href='/logout']");
	
	//Register Page
	public static By registerLink=By.xpath("//*[@href='/register']");
	
	//Homepage
	public static By arrayCard=By.xpath("//*[@class='card-title'][text()='Array']");
	public static By arrayGetStarted=By.xpath("//*[@href='array']");

	
	//Array Page
	public static By arrays=By.xpath("//*[@href='/array/arrays-in-python/']");
	public static By arrayList=By.xpath("//*[@href='/array/arrays-using-list/']");
	public static By basicoperlist=By.xpath("//*[@href='/array/basic-operations-in-lists/']");
	public static By appofarray=By.xpath("//*[@href='/array/applications-of-array/']");
	public static By practiceQues=By.xpath("//*[@href='/array/practice']");
	
	
	//Homepage
		public static By QueueCard=By.xpath("//*[@class='card-title'][text()='Queue']");
		public static By QueueGetStarted=By.xpath("//*[@href='queue']");
		public static By linkedListGetStarted=By.xpath("//*[@href='linked-list']");
		
	//queue Page
	public static By impList=By.xpath("//*[@href='implementation-lists']");
	public static By impCollection=By.xpath("//*[@href='implementation-collections']");
	public static By impArray=By.xpath("//*[@href='Implementation-array']");
	public static By queueOp=By.xpath("//*[@href='QueueOp']");
	public static By tryHere=By.xpath("//*[@href='/tryEditor']");
	public static By textEditor=By.xpath("//*[@class='CodeMirror-sizer']");
	public static By run=By.xpath("//*[contains(@onclick, 'runit')]");
	public static By output=By.xpath("//*[@id='output']");
	
	
	
	
	
	
	
	
}
