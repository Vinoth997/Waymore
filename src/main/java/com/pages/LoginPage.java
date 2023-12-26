package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.Baseclass;

public class LoginPage extends Baseclass{
	//email= wmaqa@dc02.amdtelecom.net
	//pass= Support@123
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(css = "#password")
	private WebElement password;
	
	@FindBy(css ="button[type='submit']")
	private WebElement loginBtn;
	
	
	
	public void login() {
		
		String mail = jsonValues("mail");
		String pass = jsonValues("pass");
		enterText(email, mail);
		enterText(password, pass);
		buttonclick(loginBtn);
		
	}

}
