package myHooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import stepdefinitions.AddRemoveElement;
import testRunner.CucumberTestRunner;

public class AppHook {
	
	@Before
	public void setup() {
		System.out.println("implementing before hook");
		
	}

	@After
	public void kill() {
		System.out.println("implementing after hook");
		
	}

}
