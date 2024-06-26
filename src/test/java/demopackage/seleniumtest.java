package demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class seleniumtest {
	 
	public static WebDriver driver;
	public String baseUrl;
	
	@BeforeClass
	public void initbrowser()
	{
		 System.setProperty("webdriver.chrome.driver", "lib//chromedriver.exe");
		 String environment = System.getProperty("env", "dev");
	        switch (environment.toLowerCase()) {
	            case "qa":
	                baseUrl = "https://demo.automationtesting.in/Register.html";
	                break;
	            case "dev":
	            default:
	                baseUrl = "https://demo.automationtesting.in/Register.html";
	                break;
	        }
	
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Hello Sanjay");
		
		//driver.findElement(By.className("pass")).sendKeys("Hello Sanjay");
		Thread.sleep(6000);
		
	}
	
	@AfterClass
	public void quit()
	{
		driver.quit();
	}
	

}
