package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsStepDefination {

	
	@Given("user open login page")
	public void user_open_login_page() {
	    System.out.println("user open login page");
	}

	@When("user enters valid data")
	public void user_enters_valid_data() {
	    
		System.out.println("user enters valid data");
	}

	@When("click on login")
	public void click_on_login() {
	    System.out.println("click on login");
	}

	@Then("user login successfully")
	public void user_login_successfully() {
	   System.out.println("user login successfully");
	}
	
}
