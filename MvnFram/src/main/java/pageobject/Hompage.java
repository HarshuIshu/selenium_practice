package pageobject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import frames.BaseClass;


public class Hompage {
	

/*you can call method using 2 ways
 * 1>inheritance using extend keyword
 * 2>by creating object of a particular class and calling the method
 
 */
	
	/*public class Hompage extends BaseClass {
	public WebDriver d;
	
	@Test
	public void loadPage() throws IOException {
		//BaseClass.properties();
		BaseClass b=new BaseClass();
		b.properties();
		//this.d=driver;
		driver.get(url);
		}
		}
		
		*/
	
	/*public WebDriver d;	
public void loadPage(WebDriver driver) throws IOException {
	BaseClass b=new BaseClass();
	b.properties();
	this.d=driver;
	driver.get(BaseClass.url); 
	
	}*/
	
/*To pass argument(logiTest page you created parameter in loadpage method instead you can create a constructor
	*
	*/
	
	

	public WebDriver d;
	By feature= By.xpath("//h2[text()='Featured Courses']");//*[@id="content"]/div/div/h2
	By Nav=By.cssSelector("ul[class*='navbar-right']");
	By CloseButton=By.xpath("//div[contains(@class,'close-button')]");
	
public Hompage(WebDriver driver) { //constructor
		
	this.d=driver;
	
	}
	
	public  void loadPage( ) throws IOException {
		 d.get(BaseClass.url);//url is static variable hence no need of object
		 d.navigate().refresh();
		
		
		 if(d.findElements(By.xpath("//div[contains(@class,'close-button')]")).size()>0)
		 {//isenabled
			 d.findElement((CloseButton)).click();
		    
		/*if(d.findElement(By.xpath("//div[contains(@class,'close-button')]")) != null) {
			d.findElement(By.xpath("//div[contains(@class,'close-button')]")).click();*/
		 }
		 /*else {
			 System.out.println("adds are not visible");
		 }*/
		//if else doubt abhilash
	}

	public WebElement Text() {
		return d.findElement(feature);		
	}

	public WebElement NavBar() {
		return d.findElement(Nav);
		
	}

	
}
	
