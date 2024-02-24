package pages;

import org.openqa.selenium.By;

public class Register {
	
	//Register Page
	public static By registerLink=By.xpath("//*[@href='/register']");
	public static By pageContent= By.xpath("//*[@method='post']");
	public static By userName=By.name("username");
	public static By password=By.name("password1");
	public static By confirmationPassword=By.name("password2");
	public static By registerButton=By.xpath("//*[@value='Register']");
	public static By loginLink=By.xpath("//*[@href='/login'][text()='Login ']");
	public static By errorMessge=By.xpath("//*[@class='alert alert-primary']");
}
