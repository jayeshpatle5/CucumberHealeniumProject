package com.inetbanking.PageObjects;



import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SampleFormPage {

	WebDriver driver;
	
	By nameby= By.id("name");
	By mailby= By.id("mail");
	By passwordby= By.id("password");
	By under13by= By.id("under_13");
	By over13by= By.id("over_13");
	By userbioby= By.xpath("//textarea[@name='user_bio']");
	By jobby= By.id("job");
	By checkboxby=By.xpath("//input[@type='checkbox']//following-sibling::label[@class='light']");
	By sumbitby=By.xpath("//button[@type='submit']");
	
	public SampleFormPage(WebDriver driver) {
		this.driver=driver;
	}
	public void userDetails(String name, String email, String password, String age, String userbio, String jobtype, String interest) {
		
		List<String> interests=Arrays.asList(interest.split("&"));
		driver.findElement(nameby).sendKeys(name);
		driver.findElement(mailby).sendKeys(email);
		driver.findElement(passwordby).sendKeys(password);
		
		Integer value = Integer.valueOf(age);
		if(value<13) {
			driver.findElement(under13by).click();
		}else {
			driver.findElement(over13by).click();
		}
		
		driver.findElement(userbioby).sendKeys(userbio);

		WebElement dropdown=driver.findElement(jobby);
		Select select=new Select(dropdown);
		select.selectByVisibleText(jobtype);

		List<WebElement> list=driver.findElements(checkboxby);
		for(int i=0;i<list.size();i++) {

			String str=list.get(i).getText();
			if(interests.contains(str)) {
				list.get(i).click();
			}
		}

		
	}
	public boolean verifySubmitbutton() {
		
		return driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		
	}
}
