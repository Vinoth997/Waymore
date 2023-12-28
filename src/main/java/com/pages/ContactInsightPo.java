package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actions.Actions;

import static org.testng.Assert.assertEquals;

import basePackage.BasePo;

public class ContactInsightPo extends BasePo {

	public ContactInsightPo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	@FindBy(xpath = "//ul[@class=\"nav-sidebar scroll-sidebar\"]//span[text()='Contact  Insights']/ancestor::*[@class='ng-star-inserted'][1]")
//	private WebElement contactInsigtsSidemenu;
//
//	@FindBy(xpath = "//span[text()='Contact  Insights']/parent::span/parent::li//a//span[text()='Contact  Insights']")
//	private WebElement contactInsightSubmenu;
//
//	@FindBy(css = "button span[class='icon material-icons-round add-new-icon']")
//	private WebElement addnewbutton;
//
//	@FindBy(css = "#first-name")
//	private WebElement firstName;
//
//	@FindBy(css = "#last-name")
//	private WebElement lastName;
//
//	@FindBy(xpath = "//input[@name='Viber']/parent::span/span")
//	private WebElement viberToggle;
//
//	@FindBy(xpath = "//button[contains(text(),'SAVE')]")
//	private WebElement savebutton;
//
//	@FindBy(css = "[name='phoneNumber']")
//	private WebElement phoneNumber;
//
//	@FindBy(xpath = "//span[text()='New contact saved successfully']")
//	private WebElement contactSaved;
//
//	@FindBy(xpath = "//input[@type='search']")
//	private WebElement searchContact;
//
//	@FindBy(xpath = ".wm-table__body .wm-table__cell.contacts__name")
//	private WebElement savedFirstName;
//
//	@FindBy(xpath = ".wm-table__body .wm-table__cell.contacts__last-name")
//	private WebElement savedLastName;
	
	
//	public void addNewContact() {
//		String firstname = jsonValues("firstname");
//		String lastname = jsonValues("lastname");
//		String phonenumber = jsonValues("phonenumber");
//		String originalsavemessage = jsonValues("originalsavemessage");
//		Actions.buttonclick(contactInsigtsSidemenu);
//		buttonclick(contactInsightSubmenu);
//		buttonclick(addnewbutton);
//		enterText(firstName, firstname);
//		enterText(lastName, lastname);
//		enterText(phoneNumber, phonenumber);
//		buttonclick(viberToggle);
//		buttonclick(savebutton);
////		waitForLocator(contactSaved,originalsavemessage);
//		assertEquals(getText(contactSaved), originalsavemessage);
//	}
	
	

	
}
