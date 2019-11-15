package com.actitime.CustomerTest;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.ObjectRepoLib.ActiveProAndCust;
import com.actitime.ObjectRepoLib.CreateCustomer;
import com.actitime.ObjectRepoLib.Home;
import com.actitime.ObjectRepoLib.OpenTasks;
import com.actitime.genericlib.BaseClass;

public class CreateCustomerWithDespTest extends BaseClass {


	@Test
	public void createCustomerWithDespTest() throws IOException
	{
		/* read data from excel*/
		String customerName= flib.getExcelData("Sheet1",2,2);
		String customerDesp=flib.getExcelData("Sheet1",2,3);
		/*step 2: navigate to Task page*/
		Home hp= PageFactory.initElements(driver, Home.class);
		hp.getTaskImg().click();
		
		/*step 3: Click on Project and Customers Link*/
		OpenTasks op= PageFactory.initElements(driver, OpenTasks.class);
		op.getProjectandCustomerLnk().click();
		
		/*step 4: Click create new customer Button*/
		ActiveProAndCust act= PageFactory.initElements(driver, ActiveProAndCust.class);
		act.getCreateNewCustomerBtn().click();
		
		/*Step 5: create customer*/
		CreateCustomer ccp= PageFactory.initElements(driver, CreateCustomer.class);
		ccp.createCustomer(customerName, customerDesp);
		
		/*Verify*/
		String actMsg= act.getCustomerSuccessmsg().getText();
		boolean stat= actMsg.contains("successfully created");
		Assert.assertTrue(true);
		
	}	
}


