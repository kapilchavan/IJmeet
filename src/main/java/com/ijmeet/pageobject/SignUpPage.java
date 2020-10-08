package com.ijmeet.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.config.Constants;

public final class SignUpPage {
	
	private static SignUpPage signUpPage = new SignUpPage();
	
	private SignUpPage() {
		// This is to Initializing the page Objects
		PageFactory.initElements(Constants.driver, this);
	}
	
	public static SignUpPage getsignUpPage() {
		
		return signUpPage;
	}
	
	@FindBy(xpath = "//a[@class='nav-link  nav-right-cutom-bg-1 font-weight-bold']")
	@CacheLookup
	private WebElement signup;
	
	@FindBy(xpath = "//a[@class='social-login-button social-login-button-google']")
	@CacheLookup
	private WebElement btngoogle;
	
	@FindBy(xpath = "//a[@class='social-login-button social-login-button-facebook']")
	@CacheLookup
	private WebElement btnfacebook;
	
	@FindBy(xpath = "//span[contains(text(),'Log in')]")
	@CacheLookup
	private WebElement lnkLog_in;
	
	
	// This Method is to verify visibility of Sign Up button
	public boolean SignUpButtonVisibility() {
		
		return signup.isDisplayed();
	}
	
	// This method to click on Sign Up link
	public void clickOnSignUp() {
		
		signup.click();
	}
	
	public void btn_google_click() {
		
		btngoogle.click();
	}
	
	public void btn_facebook_click() {
		
		btnfacebook.click();
	}
	
	public void lnkLog_in_click() {
		
		lnkLog_in.click();
	}

}
