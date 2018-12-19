package frames;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	
	public static WebDriver driver;
	public static String url;
	public static String browser;
	//public String email="ishuabhi";//if u declare non static ishuabhi will not be taken from properties
	public static String email;
	public static String password;
	//public Properties p;
	
	public void properties( ) throws IOException
	{

		
		String dir=System.getProperty("user.dir");
		System.out.println("this is the path directory "+dir);
		// p=new Properties();
		Properties p=new Properties();
		FileInputStream f=new FileInputStream(dir+"\\src\\main\\java\\data.properties");
		p.load(f);
		browser=p.getProperty("Browser");
		url=p.getProperty("webpage");
		BaseClass b=new BaseClass();//declared global variable is non static hence created object b to access the variable.
		b.email=p.getProperty("email");
		password=p.getProperty("password");//declared variable is static,no need to create object to access the variable.
		
	}
	public static WebDriver openBrowser() throws IOException
	{
		//properties();//works when properties method is declared as static
      BaseClass b=new BaseClass();//properties method is declared as non static,hence created the object b with class name
       b.properties();

		if(browser.equalsIgnoreCase("chrome"))//browser=chrome is wrong as it will not compare,it will try to check the memory and allocates 
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Testing\\Eclipse\\Home\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\Testing\\Eclipse\\Home\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver","E:\\Testing\\Eclipse\\Home\\driver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;	
	}
	
	public WebDriver Screenshots(String resultName) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\Harshitha\\MvnFram\\Screenshots\\"+resultName +"Screenshot.png"));
		return driver;
	}
	
	
}
