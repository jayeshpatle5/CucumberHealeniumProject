package stepdefinitions;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass
{
	
	


	@Before
	public static void launchDriver() {
		
		try {
			setupdriver();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@After
	public static void closeDriver() {

		quitDriver();

	}
}
