package org.POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class PushPaMovieDetailsFromIMDBSource {

	// WebElements

	@FindBy(css = "li[data-testid='title-details-releasedate']>div a")
	private WebElement releaseDate;

	@FindBy(css = "li[data-testid='title-details-origin']>div a ")
	private WebElement country;

	// constructor

	public PushPaMovieDetailsFromIMDBSource(WebDriver driver) {
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
