package pageobject;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frames.Array;
import frames.BaseClass;


public class Email extends BaseClass {


	By xpathEmail=By.xpath("//a[contains(@href,'sign_in')]"); 
	public By idEmailId=By.id("user_email"); 
	public static By idPassword=By.id("user_password");
	public By xpathLogin=By.xpath("//input[@type='submit' and @value='Log In']");
	

		
	

	

	
	public  WebDriver login(String username, String passwordd, String text) throws IOException {//WebDriver driver,String username, String passwordd, String text
		
	  /*public  void login() throws IOException {
		Email e=new Email();//IMPORTANT method is static variable is non static,hence created object to access the variable
		BaseClass b=new BaseClass();
		b.properties();
		driver.findElement(e.xpathEmail).click();
        driver.findElement(e.idEmailId).sendKeys(email);
		driver.findElement(idPassword).sendKeys(password);//did not create object to access password 
		driver.findElement(xpathLogin).click();*/
		
	
		
		
		
		 Email e=new Email();
		driver.findElement(e.xpathEmail).click();
		driver.findElement(e.idEmailId).sendKeys(username);
		driver.findElement(idPassword).sendKeys(passwordd);//did not create object to access password 
		driver.findElement(xpathLogin).click();
		System.out.println(text);
		
		
		/*Actions n= new Actions(driver);
		n.keyDown(Keys.CONTROL).build().perform();*/
		driver.get(BaseClass.url);

		/*Set<String>wids=driver.getWindowHandles();
		Iterator<String>id1=wids.iterator();
		String ParentWindowId=id1.next();
		String ChildWindowId=id1.next();
	
		driver.switchTo().window(ChildWindowId);
		System.out.println(ParentWindowId);
		System.out.println(ChildWindowId);
	*/
		
		return driver;
		
	}


	
	



}



















