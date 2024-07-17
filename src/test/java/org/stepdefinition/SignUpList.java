package org.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.utility.BaseClass;
import org.utility.PojoClass;

import io.cucumber.java.en.*;

public class SignUpList extends BaseClass{
	PojoClass p;
	@Given("To launch browser and maximize")
	public void to_launch_browser_and_maximize() {
		chromeBrowser();
		maxWindow();
	   
	}
	@When("To launch the target.com WebApplication")
	public void to_launch_the_target_com_web_application() {
	   launchUrl("https://www.target.com/");
	}
	@When("To Click signin icon in the homepage")
	public void to_click_signin_icon_in_the_homepage() {
		 p = new PojoClass();
	     p.getSignLogo().click();
	   
	}
	@When("To Click create account link")
	public void to_click_create_account_link() throws InterruptedException {
		Thread.sleep(3000);
	    p.getCreateAcc().click();
	}
	@When("To enter the values in emailId field")
	public void to_enter_the_values_in_email_id_field(io.cucumber.datatable.DataTable d) throws InterruptedException {
		Thread.sleep(3000);
	   List<String> li = d.asList();
	   fillText(p.getCreateEmail(), li.get(1));
	}
	@When("To enter the values in create password field")
	public void to_enter_the_values_in_create_password_field(io.cucumber.datatable.DataTable d) {
	   List<List<String>> l = d.asLists();
	   fillText(p.getCreatePassword(), l.get(1).get(2));
	}
	@When("To enter the mobile number in mobile number field")
	public void to_enter_the_mobile_number_in_mobile_number_field() {
		
	   
	}
	@Then("To validate the credentials create the account")
	public void to_validate_the_credentials_create_the_account() {
		 String title = pageTitle();
		 System.out.println(title);
		 Assert.assertTrue(title.contains("Target"));
	}

}
