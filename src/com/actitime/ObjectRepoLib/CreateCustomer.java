package com.actitime.ObjectRepoLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCustomer {

	@FindBy(name="name")
	private WebElement customerNameEdt;
	
	@FindBy(xpath="//input[@name='createCustomerSubmit']")
	private WebElement createCustomerBtn;
	
	@FindBy(name="description")
	private WebElement createDespEdt;

	public WebElement getCustomerNameEdt() {
		return customerNameEdt;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	public WebElement getCreateDespEdt() {
		return createDespEdt;
	}
	
	public void createCustomer(String customerName)
	{
		customerNameEdt.sendKeys(customerName);
		createCustomerBtn.click();
		
	}
	
	public void createCustomer(String customerName, String desp)
	{
		customerNameEdt.sendKeys(customerName);
		createDespEdt.sendKeys(desp);
		createCustomerBtn.click();
		
	}
	

}
