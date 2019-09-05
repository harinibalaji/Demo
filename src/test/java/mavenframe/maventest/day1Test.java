package mavenframe.maventest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1Test {

	WebDriver driver;

	
	 @BeforeTest 
 public void first()
	 
	 { System.out.println("Staring the Program");
	 
	 }
	 
	 @BeforeMethod 
	 public void bm()
		 
		 { System.out.println("I will run before every test method");
		 
		 }
	

	@BeforeClass
	public void start() {
		
		System.out.println("I am the first");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void openurl() throws InterruptedException {

		driver.get("http://facebook.com");

	}

	@Test(dependsOnMethods = { "openurl" })
	public void login() throws InterruptedException {
		// Thread.sleep(10000);
		driver.findElement(By.className("inputtext")).sendKeys("harini");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.linkText("Forgotten account?")).click();

	}

	
	  @AfterClass 
	  public void close() { 
		  System.out.println("I am the last");
		  driver.close();
	  
	  }
	 

	
	 @AfterTest 
	 public void end() { 
		 System.out.println("Ending the Program");
	  
	  }
	 
}