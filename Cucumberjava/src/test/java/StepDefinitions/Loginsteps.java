package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {

	@Given("User is on Login page")
	public void verifylogin_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User is on Login page");
		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User enters user name and password");
		
	}

	@And("click on login button")
	public void click_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User click on login page");
	
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User Landing to home page");
		
	}

}
