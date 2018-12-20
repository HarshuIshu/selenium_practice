package frames;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frames.BaseClass;
import pageobject.Email;
import pageobject.Hompage;
import frames.Array;


public class LogiTest extends Array {
	
	public static Logger log=LogManager.getLogger(LogiTest.class.getName());
	
	@BeforeTest
	
	public void execution() throws IOException {
	
	//driver=openBrowser();	
	//BaseClass.openBrowser();//static method hence no need of objection creation to call the method
	
	/*if you write this method here you have to open the webpage again in email class,it is repetatio to avoid it
	 * write it in @Test execute method
	 *  Hompage h=new Hompage(driver);//non staitic method hence created object h to call the method 
	h.loadPage();//passed driver as argument
*/
		
	 log.info("Initiating Browser");
		BaseClass.openBrowser();
		log.info("Opening Webpage");
		Hompage h=new Hompage(driver);//non staitic method hence created object h to call the method 
		h.loadPage();//passed driver as argument
		log.info("checked for ads");
		
	log.info("checking if Featured Coursed text is same on webpage");
		String l=h.Text().getText();
		System.out.println( l);// prints the value but donot compare with expected result,therefore use assert
		Assert.assertEquals(l, "FEATURED COURSES");
	
		log.info("Printing texts from navigation bar");
		String j=h.NavBar().getText();
		System.out.println("Navigation Bar has following ELEMENTS " + j);
		log.info("test passes if navigation bar is present");
		Assert.assertTrue(h.NavBar().isDisplayed());//always it should be true for false statement you can use Assert.assertFalse(false);
		
}
	
	@Test(dataProvider="getdata")

	
	public void execute(String username, String passwordd, String text) throws IOException {
	
	/*@Test
	public void execute() throws IOException {*/
		
		/*BaseClass.openBrowser();//static method hence no need of objection creation to call the method
		
		Hompage h=new Hompage(driver);//non staitic method hence created object h to call the method 
		h.loadPage();//passed driver as argument
		
		String l=h.Text().getText();
		System.out.println( l);// prints the value but donot compare with expected result,therefore use assert
		Assert.assertEquals(l, "FEATURED COURSES");
		
		String j=h.NavBar().getText();
		System.out.println("Navigation Bar has following ELEMENTS " + j);
		Assert.assertTrue(h.NavBar().isDisplayed());//always it should be true for false statement you can use Assert.assertFalse(false);
		
		*/
		
		
		log.info("collecting input data from array class and signing in");
		Email e=new Email();
		e.login( username,  passwordd, text);
		//e.window();
	}
	
	
	@AfterTest
	
	public void closeBrowser() {
		log.info("closing browser after test execution is passed");
       /* CloseBrowser b=new CloseBrowser(driver);
			b.close();*/
		driver.close();
			driver=null;
		}
	
	
	
}
		
		
	/*
	 * Static method/variable-to access outside class,write class name.method or variable name;
	    inside class just write variable or method name.
	 * any declared variable or method inside a class can be used in other classes 
	 
	 * Non static method or variable-To access outside or inside the class,create object.
	 * variable declared inside a class will not have assigned value in different class 
	  
	 *The scope of non-static variable is limited to the method in which it is accessed.
	 *However the scope of a static variables is throughout the class.
     *
	 *Below is an example. The scope of serialNumber is only within the method. However the scope of itemNumber
	 *is throughout the class Number and the value is retained.
	     * public class Number {
		 * 
		 * public static int itemNumber = 1;
		 * public int serialNumber = 1;
		 * 
		 * public static setItemStaticMethod() {
		 *  Number num = new Number();
		 *  num.serialNumber ++;  serialNumber will have value = 2
		 *  Number.itemNumber++;  itemNumber will have value = 2
		 * 
		 * 
		 * }
		 * 
		 * 
		 * public setItemNonStaticMethod() {
		 * Number num = new Number();
		 *  num.serialNumber ++;  serialNumber will have value = 2
		 *  Number.itemNumber++;  itemNumber will have value = 3
		 * 
		 * }
		 * 
		 * 
		 * }
		 * 
		 * 
		 */
		


