package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.config.Constants;
import com.config.Keywords;
import com.ijmeet.pageobject.SignInPage;
import com.ijmeet.pageobject.SignUpPage;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpSteps {
	
	//public SignUpPage sp;
	WebElement pageElement;	
	
	@Given("launch chrome browser")
	public void launch_chrome_browser() {
		Keywords.openBrowser("Chrome");
		Keywords.maximizeBrowser();
		Keywords.loggerInfo("****** Launching chrome browser *****");
		//Constants.extent.createTest("Launching chrome browser");
	}
	@When("Opens URL {string}")
	public void opens_URL(String string) {
		Constants.driver.get(string);
		Constants.actual = Constants.driver.getCurrentUrl();
		String expectedUrl = "https://ijmeet.com/";
		Assert.assertEquals(Constants.actual, expectedUrl);
		Keywords.loggerInfo("****** Open URL *****");
		//Constants.extent.createTest("Open URL");
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
		
		Keywords.switchToWindow(0);
		String expectedUrl = Constants.driver.getCurrentUrl();
		Constants.actual = "https://ijmeet.com/register";
		Assert.assertEquals(Constants.actual, expectedUrl);
		Keywords.loggerInfo("****** Navigate to Sign Up Page *****");	    
	}

	@Then("Mouse hover on Full Name text box")
	public void mouse_hover_on_Full_Name_text_box() {
	    
	}

	@Given("Enter Full Name as {string}")
	public void enter_Full_Name_as(String string) {
		
		pageElement = Constants.driver.findElement(By.id("name"));
		pageElement.sendKeys("Arjun Reddy");
		Keywords.loggerInfo("****** User Enters Full Name *****");
	}

	@Then("^Mouse hover on Company Name text box$")
	public void mouse_hover_on_Company_Name_text_box() {		
	   
	}

	@Given("Enter Company Name as {string}")
	public void enter_Company_Name_as(String string) {
		
		pageElement = Constants.driver.findElement(By.id("company_name"));
		pageElement.sendKeys("ABC Ltd");
		Keywords.loggerInfo("****** User Enters Company Name *****");
	}

	@Then("Mouse hover on Email id text box")
	public void mouse_hover_on_Email_id_text_box() {
	   
	}

	@Given("Enter Email id as {string}")
	public void enter_Email_id_as(String string) {
		
	    pageElement = Constants.driver.findElement(By.id("email"));
	    pageElement.sendKeys("arjunreddy8254@gmail.com");
	    Keywords.loggerInfo("****** User Enters Email id *****");	    
	}

	@Then("Mouse hover on Mobile Number text box")
	public void mouse_hover_on_Mobile_Number_text_box() {
	    
	}

	@Given("Enter Mobile Number as {string}")
	public void enter_Mobile_Number_as(String string) {
		
	    pageElement = Constants.driver.findElement(By.id("contact"));
	    pageElement.sendKeys("9876543210");
	    Keywords.loggerInfo("****** User Enters Mobile Number *****");
	}

	@Given("User Enters Password as {string}")
	public void user_Enters_Password_as(String string) {
		
	   pageElement = Constants.driver.findElement(By.id("password"));
	   pageElement.sendKeys("abc@1234");
	   Keywords.loggerInfo("****** User Enters Password *****");
	} 	
	
	@Given("user validates captcha")
	public void user_validates_captcha() {  
		
	}

	@Given("User clicks on Sign Up button")
	public void user_clicks_on_Sign_Up_button() {
	    
		pageElement = Constants.driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn mirror-view-btn-primary']"));
		pageElement.click();
		Keywords.loggerInfo("****** User clicks on Sign Up button *****");
	}
	
	/*@Given("launch chrome browser")
	public void launch_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Opens URL {string}")
	public void opens_URL(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Check visibility of Sign Up button")
	public void check_visibility_of_Sign_Up_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Click on Sign Up button")
	public void click_on_Sign_Up_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Navigate to Sign Up Page")
	public void navigate_to_Sign_Up_Page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Mousehover on already have an account login link")
	public void mousehover_on_already_have_an_account_login_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Click on log in link")
	public void click_on_log_in_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User navigates to ijmeet login page")
	public void user_navigates_to_ijmeet_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("launch chrome browser")
	public void launch_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Opens URL {string}")
	public void opens_URL(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Check visibility of Sign Up button")
	public void check_visibility_of_Sign_Up_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Click on Sign Up button")
	public void click_on_Sign_Up_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Navigate to Sign Up Page")
	public void navigate_to_Sign_Up_Page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Click on Sign in with google account button")
	public void click_on_Sign_in_with_google_account_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("navigates to google account")
	public void navigates_to_google_account() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	/*@Given("launch chrome browser")
	public void launch_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Opens URL {string}")
	public void opens_URL(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Check visibility of Sign Up button")
	public void check_visibility_of_Sign_Up_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Click on Sign Up button")
	public void click_on_Sign_Up_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Navigate to Sign Up Page")
	public void navigate_to_Sign_Up_Page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Click on Sign in with facebook button")
	public void click_on_Sign_in_with_facebook_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("navigates to facebook page")
	public void navigates_to_facebook_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	/*@Then("Mousehover on already have an account login link")
	public void mousehover_on_already_have_an_account_login_link() {		
	    
	}

	@Given("Click on log in link")
	public void click_on_log_in_link() {
		
		pageElement = Constants.driver.findElement(By.xpath("//span[@class='sign-up-accounthave']"));
	    pageElement.click();
	    Keywords.loggerInfo("****** User clicks on Log in link *****");
	}

	@Then("User navigates to ijmeet login page")
	public void user_navigates_to_ijmeet_login_page() {		
		
		Keywords.loggerInfo("****** User navigates to ijmeet login page *****");		
		
	}
	
	@Given("Click on Sign in with google account button")
	public void click_on_Sign_in_with_google_account_button() {
	   
		pageElement = Constants.driver.findElement(By.xpath("//a[@class='social-login-button social-login-button-google']"));
		pageElement.click();
		Keywords.loggerInfo("****** Clicks on Sign in with Google+ *****");		
	}

	@Then("navigates to google account")
	public void navigates_to_google_account() {		
		
		Keywords.loggerInfo("****** navigates to google account *****");		
		
	}*/


}
