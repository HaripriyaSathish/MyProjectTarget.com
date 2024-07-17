package org.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {
	
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@aria-label='Account, sign in']")
	private WebElement signLogo;
	
	@FindBy(xpath="(//span[text()='Sign in'])[2]")
	private WebElement signinLink;
	
	@FindBy(id="username")
	private WebElement txtEmail;
	
	@FindBy(id="password")
	private WebElement txtPass;
	
	@FindBy(id="login")
	private WebElement btnLog;
	
	@FindBy(xpath="//span[text()='Create account']")
	private WebElement createAcc;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement createPassword;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement createEmail;
	
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement lastName;
	
	public WebElement getCreateAcc() {
		return createAcc;
	}

	public WebElement getCreatePassword() {
		return createPassword;
	}

	public WebElement getCreateEmail() {
		return createEmail;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getSignLogo() {
		return signLogo;
	}

	public WebElement getSigninLink() {
		return signinLink;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLog() {
		return btnLog;
	}

}
