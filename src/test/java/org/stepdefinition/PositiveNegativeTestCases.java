package org.stepdefinition;

import org.junit.Assert;
import org.utility.BaseClass;
import org.utility.PojoClass;

import io.cucumber.java.en.*;

public class PositiveNegativeTestCases extends BaseClass{
	
	PojoClass p;
	@Given("To launch chrome browser and maximize")
	public void to_launch_chrome_browser_and_maximize() {
	    chromeBrowser();
	    maxWindow();
	}
	@When("To launch the application")
	public void to_launch_the_application() {
	   launchUrl("https://www.target.com/");
	}
	@When("To click the SignIn icon in webpage")
	public void to_click_the_sign_in_icon_in_webpage() {
		 p = new PojoClass();
	     p.getSignLogo().click();
	}
	@When("To click SignIn Link in webpage")
	public void to_click_sign_in_link_in_webpage() throws InterruptedException {
		p= new PojoClass();
		Thread.sleep(3000);
	    p.getSigninLink().click();
	}
	@When("To enter the user name {string} in email field")
	public void to_enter_the_user_name_in_email_field(String email) throws InterruptedException {
		 p = new PojoClass();
		 Thread.sleep(3000);
		 fillText(p.getTxtEmail(), email);
	}

    @When("To enter the password {string}in password field")
    public void to_enter_the_password_in_password_field(String password) {
    	 fillText(p.getTxtPass(), password);
    }
	@When("To click signIn button")
	public void to_click_sign_in_button() {
		p= new PojoClass();
		p.getBtnLog().click();
	}
	@Then("To validate the entered values")
	public void to_validate_the_entered_values() {
		String actualUrl = pageUrl();
		Assert.assertTrue(actualUrl.contains("create_session_signin"));
		
		System.out.println("PASSED");
	}



}
