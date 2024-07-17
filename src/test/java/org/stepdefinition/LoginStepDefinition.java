package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utility.BaseClass;
import org.utility.PojoClass;


import io.cucumber.java.en.*;

public class LoginStepDefinition extends BaseClass {
	PojoClass p;
	
	@Given("To launch the browser and maximize window")
	public void to_launch_the_browser_and_maximize_window() {
	    chromeBrowser();
	    maxWindow();
	}
	@When("To launch the target.com Webapplication")
	public void to_launch_the_target_com_webapplication() {
	    launchUrl("https://www.target.com/");
	}
	@When("To Click the account Icon")
	public void to_click_the_account_icon() {
	     p = new PojoClass();
	     p.getSignLogo().click();
	    
	}
	@When("To Click Signin link")
	public void to_click_signin_link() throws InterruptedException {
		p= new PojoClass();
		Thread.sleep(3000);
	    p.getSigninLink().click();
	}
	@When("To pass invalid EmailId in Email address field")
	public void to_pass_invalid_email_id_in_email_address_field() throws InterruptedException {
		p=new PojoClass();
		Thread.sleep(3000);
	    p.getTxtEmail().sendKeys("abc123@gmail.com");
	}
	@When("To pass invalid Password in password field")
	public void to_pass_invalid_password_in_password_field() {
		p=new PojoClass();
		p.getTxtPass().sendKeys("abc@123");
	   
	}
	@When("To click a Login button")
	public void to_click_a_login_button() {
		p= new PojoClass();
		p.getBtnLog().click();
	    
	}
	@Then("To validate the Login button navigate to HomePage")
	public void to_validate_the_login_button_navigate_to_home_page() {
		String actualUrl = pageUrl();
		Assert.assertTrue(actualUrl.contains("create_session_signin"));
		
		System.out.println("PASSED");
	}

}
