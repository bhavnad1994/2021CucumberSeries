package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class formAuthentication {
	
	WebDriver driver;

@When("^user clicks on Form Authentication link$")
public void user_clicks_on_Form_Authentication_link() throws Throwable {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("http://the-internet.herokuapp.com/");
	 driver.manage().window().maximize();
   driver.findElement(By.xpath("//a[contains(text(),'Form Authentication')]")).click();
}

@Then("^user lands on Form Authentication page$")
public void user_lands_on_Form_Authentication_page() throws Throwable {
    String title=driver.findElement(By.xpath("//div/h2[text()='Login Page']")).getText();
    Assert.assertEquals(title, "Login Page");
    System.out.println("lands on Login page");
}

@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_and(String arg1, String arg2) throws Throwable {
   driver.findElement(By.id("username")).sendKeys(arg1);
   driver.findElement(By.id("password")).sendKeys(arg2);
   Thread.sleep(2000);
  
}

@When("^user clicks on login button$")
public void user_clicks_on_login_button() throws Throwable {
    driver.findElement(By.xpath("//button/i[text()=' Login']")).click();
}

@Then("^user lands on landing page$")
public void user_lands_on_landing_page() throws Throwable {
  System.out.println("success");
   driver.quit();
}

}
