package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Googlesearchsteps {

	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("User is inside the browser");
	System.setProperty("webdriver.chrome.driver","C:/Users/bj_je/Documents/Jerald Automation/Browser Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("User is on Google Search page");
		driver.navigate().to("Google.com");
	}

	@When("user enters the test in search box")
	public void user_enters_the_test_in_search_box() throws InterruptedException {
		System.out.println("User Enter the search Box");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		Thread.sleep(2000);
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("User his th enter Button");
	}

	@Then("user is navigated to search results.")
	public void user_is_navigated_to_dearch_results() {
		System.out.println("User Found search results");
	}
}
