package baseclass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.epam.healenium.SelfHealingDriver;
import com.google.common.base.Objects;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{
	static String nodeURL = "http://localhost:8085";
	public static  SelfHealingDriver driver;
	public static WebDriver delegate;
	
	
	public static void setupdriver() throws MalformedURLException {
		System.out.println("______________");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver delegate = new RemoteWebDriver(new URL(nodeURL), options);
		driver= SelfHealingDriver.create(delegate);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		
	}
	
	
	public static void quitDriver() {
		if(!driver.equals(null)) {
		driver.quit();
		}
		
	}
	
	
}
