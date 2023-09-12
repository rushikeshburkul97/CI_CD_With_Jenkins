package org.POM_TestCases;

import java.time.Duration;
import java.util.Properties;

import org.POM_Pages.PushPaMovieDetailsFromWickipediaSource;
import org.Utilities.GenericMethods;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PushPaMovieDetailsFromWickipediaSourceTC {
	GenericMethods gm = new GenericMethods();
	WebDriver driver = null;
	Properties prop = gm.getProp();

	@BeforeMethod
	public void initializeBrowse() {
		driver = gm.startUP(prop.getProperty("Browsername"), prop.getProperty("URLWicki"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void verifyMovieInformation() {

		PushPaMovieDetailsFromWickipediaSource obj = new PushPaMovieDetailsFromWickipediaSource(driver);
		Assert.assertEquals(obj.getCountryName(), "India");
		Reporter.log("country name is =" + obj.getCountryName());
		Assert.assertEquals(obj.getReleaseDate(), "17 December 2021");
		Reporter.log("release date is =" + obj.getReleaseDate());
	}

	@AfterMethod
	public void CloseBrowser() {
		driver.quit();

	}
}
