package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.config.Constants;
import com.config.Keywords;
import com.ijmeet.pageobject.SignUpPage;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpSteps {
	
	/*@After
	public void close_browser() {
		
		Constants.driver.close();
	}*/
	
	@Given("launch chrome browser")
	public void launch_chrome_browser() {
	    
		Keywords.openBrowser("Chrome");
		Keywords.maximizeBrowser();
		Keywords.loggerInfo("****** Launching chrome browser *****");
	}

	@When("Opens URL {string}")
	public void opens_URL(String string) {
	    
		Constants.driver.get(string);
		Constants.actual = Constants.driver.getCurrentUrl();
		String expectedUrl = "https://ijmeet.com/";
		Assert.assertEquals(Constants.actual, expectedUrl);
		Keywords.loggerInfo("****** Open URL *****");
	}

	@Then("Check visibility of Sign Up button")
	public void check_visibility_of_Sign_Up_button() {
	    
		Constants.signUpPage = SignUpPage.getsignUpPage();
	    Constants.signUpPage.SignUpButtonVisibility();	    
	    Assert.assertTrue(true);
	    Keywords.loggerInfo("*****Verify visibility of Sign Up button******");	
	}

	@Then("Click on Sign Up button")
	public void click_on_Sign_Up_button() {
	    
		Constants.signUpPage = SignUpPage.getsignUpPage();
		Constants.signUpPage.clickOnSignUp();
	}

	@Then("Navigate to Sign Up Page")
	public void navigate_to_Sign_Up_Page() {
	    
		String expectedUrl = Constants.driver.getCurrentUrl();
		Constants.actual = "https://ijmeet.com/register";
		Assert.assertEquals(Constants.actual, expectedUrl);
		Keywords.loggerInfo("****** Navigate to Sign Up Page *****");	
	}

	@When("Click on Sign in with google account button")
	public void click_on_Sign_in_with_google_account_button() {
	   
		Constants.signUpPage = SignUpPage.getsignUpPage();		
		Constants.signUpPage.btn_google_click();
		Keywords.loggerInfo("****** Clicks on Sign in with Google+ *****");
	}

	@Then("navigates to google account")
	public void navigates_to_google_account() {
	    
		Keywords.loggerInfo("****** navigates to google account *****");
	}
	
	@When("Click on Sign in with facebook button")
	public void click_on_Sign_in_with_facebook_button() {	    
		
		Constants.signUpPage = SignUpPage.getsignUpPage();
		Constants.signUpPage.btn_facebook_click();		
	}

	@Then("navigates to facebook login page")
	public void navigates_to_facebook_login_page() {
	   
		Keywords.loggerInfo("****** navigates to facebook login page *****");
	}

}
