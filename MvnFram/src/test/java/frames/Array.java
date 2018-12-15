package frames;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frames.BaseClass;
import pageobject.Email;
import pageobject.Hompage;

public class Array extends BaseClass {
	
	/*@Test(dataProvider="getdata")
	public void execute(String username,String passwordd,String text) throws IOException {
	BaseClass.openBrowser();//static method hence no need of objection creation to call the method
	
	Hompage h=new Hompage(driver);//non staitic method hence created object h to call the method 
	h.loadPage();//passed driver as argument
	//h.loadPage();
	
	
	Email e=new Email();
	e.login();
	driver.findElement(By.xpath("//a[contains(@href,'sign_in')]")).click();
	driver.findElement(By.id("user_email")).sendKeys(username);
	driver.findElement(By.id("user_password")).sendKeys(passwordd);//did not create object to access password 
	driver.findElement(By.xpath("//input[@type='submit' and @value='Log In']")).click();
	System.out.println(text+" logged in");
	
	}*/
	
	
	
	//public static String username; public static String passwordd;public static String text;
	@DataProvider
	public static Object[][] getdata(){
		//[][]
		//1st Row stands for number of data types or number of times 
		//2nd ,column stands for number of values 
		Object[][]data=new Object[2][3];
		
		data[0][0]= "ishu@gmail.com";
	    data[0][1]="1456";
	    data[0][2]="Harshithalovesyou";
		
	    data[1][0]="abhilash@gmail.com";
		data[1][1]="12345";
		data[1][2]="abhilashlovesu";						
										
		return data;														
		
		
		
		
		
		
	}
}
