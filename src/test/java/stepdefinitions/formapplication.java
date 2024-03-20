package stepdefinitions;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.inetbanking.PageObjects.SampleFormPage;

import baseclass.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class formapplication {
	
	WebDriver driver=BaseClass.driver;
	SampleFormPage sampleformpage=new SampleFormPage(driver);
	
	@Given("Navigate to the given url {string}")
	public void navigate_to_the_given_url(String string) {
		driver.get(string);
		System.out.println("given URL is " + string);
	}


	
	@When("I enter all the user details userDetails")
	public void i_enter_all_the_user_details_user_details(DataTable dataTable) {
		List<Map<String, String>> list=dataTable.asMaps();
		System.out.println(list.get(0).get("Name")+" "+list.get(0).get("Email")+" "+list.get(0).get("Password")+" "+list.get(0).get("Age")+" "+list.get(0).get("Userbio")+" "+list.get(0).get("Jobtype")+" "+list.get(0).get("Interests"));
		sampleformpage.userDetails(list.get(0).get("Name"),list.get(0).get("Email"),list.get(0).get("Password"),list.get(0).get("Age"),list.get(0).get("Userbio"),list.get(0).get("Jobtype"),list.get(0).get("Interests"));
	}
	
	
	@When("I enter all the user details1 Name , Email")
	public void i_enter_all_the_user_details1_name_and_email(DataTable datatable) {
	    List<Map<String,String>> list=datatable.asMaps();
	    System.out.println(list);
	}

	@Then("validate the submit button")
	public void validate_the_submit_button() {
	    
		System.out.println("this is submit button");
		
		assertTrue(sampleformpage.verifySubmitbutton());
	}

}
