package org.POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class PushPaMovieDetailsFromWickipediaSource {

	// WebElements

	@FindBy(xpath = "//tbody/tr[15]/td[1]/div[1]/ul[1]/li[1]")
	private WebElement releaseDate;

	@FindBy(xpath = "//td[text()='India']")
	private WebElement country;

	// constructor

	public PushPaMovieDetailsFromWickipediaSource(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// page action methods.

	public String getReleaseDate() {
		return releaseDate.getText();
	}

	public String getCountryName() {
		return country.getText();
	}

}
