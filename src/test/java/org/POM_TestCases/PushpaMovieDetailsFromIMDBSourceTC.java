package org.POM_TestCases;

import java.time.Duration;
import java.util.Properties;

import org.POM_Pages.PushPaMovieDetailsFromIMDBSource;
import org.Utilities.GenericMethods;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PushpaMovieDetailsFromIMDBSourceTC {

	GenericMethods gm = new GenericMethods();
	WebDriver driver = null;
	Properties prop = gm.getProp();

	// using selenium 4.11 version .
	
	@BeforeMethod
	public void initializeBrowser() {
		driver = gm.startUP(prop.getProperty("Browsername"), prop.getProperty("URLIMDB"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void verifyPushpaMovieDetailsFromIMDB() {

		PushPaMovieDetailsFromIMDBSource obj = new PushPaMovieDetailsFromIMDBSource(driver);
		Assert.assertEquals(obj.getCountryName(), "India", "Contry Name is not matched");
		Reporter.log("country name is =" + obj.getCountryName());
		Assert.assertEquals(obj.getReleaseDate(), "December 17, 2021 (United States)", "Release date is not matched");
		Reporter.log("release date is =" + obj.getReleaseDate());
	}

	@AfterMethod
	public void CloseBrowser() {
		driver.quit();

	}
}
