package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.utility.BaseClass;
import org.utility.PojoClass;

import io.cucumber.java.en.*;

public class SignupMap extends BaseClass {
	PojoClass p;
	@Given("To Launch the browser and Maximize")
	public void to_Launch_the_browser_and_Maximize() {
	    chromeBrowser();
	    maxWindow();
	}

	@When("To Launch the Application")
	public void to_Launch_the_Application() {
	   launchUrl("https://www.target.com/");
	}

	@When("To click the signin icon present in homepage")
	public void to_click_the_signin_icon_present_in_homepage() {
		 p = new PojoClass();
	     p.getSignLogo().click();
	}

	@When("To click Create Account link")
	public void to_click_Create_Account_link() throws InterruptedException {
		Thread.sleep(3000);
	    p.getCreateAcc().click();
	}

	@When("To pass the values in first name field")
	public void to_pass_the_values_in_first_name_field(io.cucumber.datatable.DataTable d) throws InterruptedException {
		Thread.sleep(3000);
	   Map<String, String> mp = d.asMap(String.class, String.class);
	   fillText(p.getFirstName(), mp.get("First one"));
	}

	@When("To pass the values in last name field")
	public void to_pass_the_values_in_last_name_field(io.cucumber.datatable.DataTable d) {
	   List<Map<String, String>> m = d.asMaps();
	   fillText(p.getLastName(), m.get(0).get("Last three"));
	}

	@Then("To validate the values create account")
	public void to_validate_the_values_create_account() {
		 String title = pageTitle();
		 System.out.println(title);
		 Assert.assertTrue(title.contains("sign up"));
	}

}
