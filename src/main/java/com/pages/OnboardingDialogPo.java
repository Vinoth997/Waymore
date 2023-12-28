package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import basePackage.BasePo;
import helpers.Waiters;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnboardingDialogPo extends BasePo {

	public OnboardingDialogPo(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "img.campaigns-loader__img")
	private WebElement onboardingLoaderImage;

	public void waitForOnboardingLoaderImageIsNotDisplayed() {

		Waiters.waitForElementToBeInvisible(onboardingLoaderImage, 10);
	}
}