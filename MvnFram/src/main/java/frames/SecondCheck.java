package frames;

	import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;



import frames.CloseBrowser;
   





public class SecondCheck extends BaseClass{		 
	
		//public static  WebDriver dr;//or webdriver driver=new chrome driver 
	static String aTitle="https://www.facebook.com/";

 
	          
	
	       /*   public SecondCheck(WebDriver driver ){
	        	  dr=driver;
	          */
	          @Test        
        public static void Browser() throws IOException {
		
			System.setProperty("webdriver.chrome.driver",(dir+ "\\driver\\chromedriver.exe"));
	        driver=new ChromeDriver();//ChromeDriver driver =new ChromeDriver is the class name driver is the object -actually importing all this from webdriver methods -webdriver is the interface 
	        driver.get(aTitle);
	      //  driver.findElement(By.className("facebook"));
	   /*     File src=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(src,new File("C:\\Users\\Harshitha\\MvnFram\\Logs\\Screenshot.png"));*/
}
	         @AfterTest
	          public void closeBrowser() {
	      		
	             
	        	 driver.close();
	        	 driver=null;}
	      		}
