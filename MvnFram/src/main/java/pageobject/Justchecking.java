package pageobject;




	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import frames.BaseClass;



   


	public class Justchecking extends BaseClass{
		
		
	
		//public static WebDriver dr;//or webdriver driver=new chrome driver 
		static String aTitle="https://mail.google.com";
		
		
		
		
		 
	@Test
		
        public static void browser() {
		
			System.setProperty("webdriver.chrome.driver",(dir+ "\\driver\\chromedriver.exe"));
			driver=new ChromeDriver();//ChromeDriver driver =new ChromeDriver is the class name driver is the object -actually importing all this from webdriver methods -webdriver is the interface 
			driver.get(aTitle);

}
	          @AfterTest
	          public static void closeBrowser() {
	        	  driver.close();
	       
	      		}	
	      }
