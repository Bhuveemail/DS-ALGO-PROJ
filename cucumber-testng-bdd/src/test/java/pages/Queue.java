package pages;

import org.openqa.selenium.By;

public class Queue {
	
	//queue Page
	public static By QueueCard=By.xpath("//*[@class='card-title'][text()='Queue']");
	public static By QueueGetStarted=By.xpath("//*[@href='queue']");
	public static By impList=By.xpath("//*[contains(@href, 'implementation-lists')]");
	public static By impCollection=By.xpath("//*[contains(@href, 'implementation-collections')]");
	public static By impArray=By.xpath("//*[contains(@href, 'Implementation-array')]");
	public static By queueOp=By.xpath("//*[contains(@href, 'QueueOp')]");
	public static By tryHere=By.xpath("//*[@href='/tryEditor']");
	public static By textEditor=By.xpath("//*[@class='CodeMirror-sizer']");
	public static By run=By.xpath("//*[contains(@onclick, 'runit')]");
	public static By output=By.xpath("//*[@id='output']");
	
	
	
	
	
}
