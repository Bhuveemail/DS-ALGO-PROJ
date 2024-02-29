package pages;

import org.openqa.selenium.By;

public class SignIn {
	public static By logoImg=By.xpath("//*[@alt='Google']");
	public static By search=By.xpath("//*[@aria-label='Search']");
	public static By signInLink=By.xpath("//*[@href='/login']");
	public static By userName=By.name("username");
	public static By password=By.name("password");
	public static By loginButton=By.xpath("//*[@value='Login']");
	public static By roleAlert=By.xpath("//*[@role='alert']");
	public static By signOutLink=By.xpath("//*[@href='/logout']");
	public static By registerLink=By.xpath("//*[@href='/register']");
	
}
