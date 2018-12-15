package frames;



import org.openqa.selenium.WebDriver;



public class CloseBrowser {
	
	public WebDriver d1;
	
	
	public CloseBrowser(WebDriver driver) {//this is constructor ,used instead of extend keyword
		this.d1=driver;
	}
	
	public void close() {
		d1.close();
	}
	

}
