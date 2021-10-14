package addpropertyAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class addpropertyannotation {
	public static WebDriver driver;
	@Before
  public void initialization() throws InterruptedException
  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Subhash\\Documents\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://realty-real-estatem1.upskills.in/");
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		//Thread.sleep(2000);
  }
	@After
  
  public void close()
  {
	  driver.quit();
  }
}
