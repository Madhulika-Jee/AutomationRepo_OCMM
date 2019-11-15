package com.actitime.ObjectRepoLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTasks {

	@FindBy(xpath="//a[text()='Projects & Customers']")
	private WebElement projectandCustomerLnk;

	public WebElement getProjectandCustomerLnk() {
		return projectandCustomerLnk;
	}
	
	
}
