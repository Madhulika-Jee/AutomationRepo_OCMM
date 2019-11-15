package com.actitime.ObjectRepoLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {

	@FindBy(xpath="//img[@class='sizer']")
	private WebElement taskImg;

	@FindBy(xpath="//div[text()='Users']")
	private WebElement userImg;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLnk;
	
	public WebElement getTaskImg() {
		return taskImg;
	}

	public WebElement getUserImg() {
		return userImg;
	}

	public WebElement getLogoutLnk() {
		return logoutLnk;
	}
	
	public void logout()
	{
		logoutLnk.click();
	}
	

}
