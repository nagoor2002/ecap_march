package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationdemo {
         WebDriver driver;
	
		@Given("user is on login page")
		public void user_is_on_login_page() throws InterruptedException {
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   Thread.sleep(2000);
		   		}

//		@When("user enters the username & password")
//		public void user_enters_the_username_password() {
//			driver.findElement(By.name("username")).sendKeys("Admin");
//			driver.findElement(By.name("password")).sendKeys("admin123");
//
//		}
		@When("user enters the username as {string} & password {string}")
		public void user_enters_the_username_as_password(String un, String pass) {
			driver.findElement(By.name("username")).sendKeys("un");
			driver.findElement(By.name("password")).sendKeys("pass");
		}

		@When("click on login button")
		public void click_on_login_button() {
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}

		@Then("user should navigate to homepage")
		public void user_should_navigate_to_homepage() {
		    
			//driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).click();
			System.out.println("user is navigated to homepage");
		}



	}


