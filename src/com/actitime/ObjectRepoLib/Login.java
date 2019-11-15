package com.actitime.ObjectRepoLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Madhulika
 *
 */

public class Login {

	//Identification or initialization of elements
	@FindBy(name="username")
	private WebElement usernameEdt;
	@FindBy(name="pwd")
	private WebElement passwordEdt;
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	//usage
   public WebElement getUsernameEdt() {
		return usernameEdt;
	}
	public WebElement getPasswordEdt() {
		return passwordEdt;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	//Business method
	public void loginToApp(String username, String password)
	{
		usernameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginButton.click();
	}
}
	