package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Youtube {
	WebDriver driver;
	
		@Given("^Open Chrome browser with URL$")
	public void open_Chrome_browser_with_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();	
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);	 	   
	}

		
	@When("^Search selenium tutorial \"([^\"]*)\"$")
	public void search_selenium_tutorial(String arg1) throws Throwable {
		driver.findElement(By.id("search")).sendKeys(arg1);		
		Thread.sleep(1000);	 	
	}

	@When("^Click enter$")
	public void click_enter() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();;	
		Thread.sleep(1000);	 	
		driver.quit();
	}

	



}
