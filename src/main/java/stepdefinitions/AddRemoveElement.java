package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddRemoveElement {
	
WebDriver driver;	


@Given("^User already on landing Page$")
public void user_already_on_landing_Page() throws Throwable {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("http://the-internet.herokuapp.com/");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
    
}

@When("^user clicks on Add/Remove Elements link$")
public void user_clicks_on_Add_Remove_Elements_link() throws Throwable {
	
	 WebElement button= driver.findElement(By.xpath("//li/a[contains(text(),'Add/Remove Elements')]"));
	 button.click();	 
     Thread.sleep(3000);
  
}

@Then("^user lands on Add/Remove Elements page$")
public void user_lands_on_Add_Remove_Elements_page() throws Throwable {
   String title= driver.getTitle();
   title.contains("The Internet");
}

@Then("^user click one time on Add element button$")
public void user_click_one_time_on_Add_element_button() throws Throwable {
    driver.findElement(By.xpath("//div/button[text()='Add Element']")).click();
}

@Then("^one Delete button is displayed$")
public void one_Delete_button_is_displayed() throws Throwable {
   Boolean flag=driver.findElement(By.xpath("//div[@id='elements']/button[text()='Delete']")).isDisplayed();
   if(flag==true) {
	   System.out.println("Delete button is displayed");
   }
}

@Then("^user click on Delete button$")
public void user_click_on_Delete_button() throws Throwable {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='elements']/button[text()='Delete']")).click();
	System.out.println("delete button is not displayed ");
	}

@Then("^Delete button is un-displayed$")
public void delete_button_is_un_displayed() throws Throwable {
	System.out.println("deleet button is not displayed anymore");
	driver.close();
  }

@Then("^user click two times on Add element button$")
public void user_click_two_times_on_Add_element_button() throws Throwable {
	driver.findElement(By.xpath("//div/button[text()='Add Element']")).click();
	driver.findElement(By.xpath("//div/button[text()='Add Element']")).click();
}

@Then("^two Delete buttons are displayed$")
public void two_Delete_buttons_are_displayed() throws Throwable {
	Boolean f=driver.findElement(By.xpath("//div[@id='elements']/button[text()='Delete']")).isDisplayed();
	if(f==true)
 System.out.println("2 delete buttons are displayed");   
}

@Then("^user clicks on one Delete button$")
public void user_clicks_on_one_Delete_button() throws Throwable {
	driver.findElement(By.xpath("//div[@id='elements']/button[text()='Delete']")).click();
}

@Then("^one Delete button is un-displayed and another Delete button is still displayed$")
public void one_Delete_button_is_un_displayed_and_another_Delete_button_is_still_displayed() throws Throwable {
	Boolean flag=driver.findElement(By.xpath("//div[@id='elements']/button[text()='Delete']")).isDisplayed();
	if(flag==true) {
	System.out.println("One Delete button displayed");	
	}
}

@Then("^user again click on delete button$")
public void user_again_click_on_delete_button() throws Throwable {
	driver.findElement(By.xpath("//div[@id='elements']/button[text()='Delete']")).click();   
}

@Then("^All delete button is un-displayed$")
public void all_delete_button_is_un_displayed() throws Throwable {
  System.out.println("no deleet button displayed");
  driver.quit();
}

}
