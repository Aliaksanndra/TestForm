package by.htp.formtest.ta;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import by.htp.formtest.pages.MainPage;
import by.htp.formtest.steps.Steps;


public class BookingAutomationTest
{
	private Steps steps;	
	private final String SEARCHSTRING = "Минск";	

	@BeforeMethod(description = "Init browser")
	public void setUp()
	{
		steps = new Steps();
		steps.initBrowser();
	}

	@Test(description = "Open page")
	public void insertInfoInHomePage()
	{				
		steps.insertSearchSrtring(SEARCHSTRING);
	}

	@Test
	public void ComparePrice() {
		steps.ComparePrice();
	}

	@AfterMethod(description = "Stop Browser")
	public void stopBrowser()
	{
		//steps.closeDriver();
	}

}
