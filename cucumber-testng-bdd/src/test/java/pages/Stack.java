package pages;

import org.openqa.selenium.By;

public class Stack {
	
	//Homepage Stack
		public static By StackCard=By.xpath("//*[@class='card-title'][text()='Stack']");
		public static By StackgetStarted=By.xpath("//*[@href='stack']");
		public static By operationsstack=By.xpath("//*[contains(@href, 'operations-in-stack')]");
		public static By Implementation=By.xpath("//*[contains(@href,'/stack/implementation/')]");
		public static By Applications=By.xpath("//*[@href='/stack/stack-applications/']");
		public static By practicequestions=By.xpath("//*[@href='/stack/practice']");
		public static By blankPage=By.xpath("//*[@class='container']");
		public static By tryHere=By.xpath("//*[@href='/tryEditor']");
		public static By textEditor=By.xpath("//*[@class='CodeMirror-sizer']");
		public static By run=By.xpath("//*[contains(@onclick, 'runit')]");
		public static By output=By.xpath("//*[@id='output']");
		
	
}
