package pages;

import org.openqa.selenium.By;

public class Tree {
	
	//Homepage tree
		public static By TreeCard=By.xpath("//*[@class='card-title'][text()='Tree']");
		public static By TreeGetStarted=By.xpath("//*[@href='tree']");
			
		//tree Page
		public static By overview=By.xpath("//*[contains(@href, 'overview-of-trees')]");
		public static By terminologies=By.xpath("//*[contains(@href, 'terminologies')]");
		public static By typesoftrees=By.xpath("//*[contains(@href, 'types-of-trees')]");
		public static By treetraversals=By.xpath("//*[contains(@href, 'tree-traversals')]");
		public static By traversalsillu=By.xpath("//*[contains(@href, 'traversals-illustration')]");
		public static By binarytree=By.xpath("//*[contains(@href, 'binary-trees')]");
		public static By typesofbinary=By.xpath("//*[contains(@href, 'types-of-binary-trees')]");
		public static By imppython=By.xpath("//*[contains(@href, 'implementation-in-python')]");
		public static By binarytreetraver=By.xpath("//*[contains(@href, 'binary-tree-traversals')]");
		public static By impofbinary=By.xpath("//*[contains(@href, 'implementation-of-binary-trees')]");
		public static By appofbinary=By.xpath("//*[contains(@href, 'applications-of-binary-trees')]");
		public static By binarysearch=By.xpath("//*[contains(@href, 'binary-search-trees')]");
		public static By impofbst=By.xpath("//*[contains(@href, 'implementation-of-bst')]");
		
		public static By tryHere=By.xpath("//*[@href='/tryEditor']");
		public static By textEditor=By.xpath("//*[@class='CodeMirror-sizer']");
		public static By run=By.xpath("//*[contains(@onclick, 'runit')]");
		public static By output=By.xpath("//*[@id='output']");
	
}
