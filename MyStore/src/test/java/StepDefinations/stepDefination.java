package StepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import com.test.base.TestBase;
import com.test.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
	public class stepDefination extends TestBase 
	{

	    @Given("Initialize the browser and navigate to the {string} site")
	    public void initialize_the_browser_and_navigate_to_the_site(String string) {
	        // Write code here that turns the phrase above into concrete actions
	    	initialization();
	        driver.get(string);
	    }
	    
	    @When("Click on Login button and enter {string} & {string} and logs in")
	    public void click_on_login_button_and_enter_and_logs_in(String string, String string2) 
	    {
	    	driver.findElement(By.xpath("//a[@class='login']")).click();
	    	driver.findElement(By.id("email")).sendKeys(string);
	    	driver.findElement(By.id("passwd")).sendKeys(string2);
	    	
	    	driver.findElement(By.id("SubmitLogin")).click();
	    }
	    
	    @Then("Verify that the user is Successfully logged in")
	    public void verify_that_the_user_is_successfully_logged_in() 
	    {
//	    	driver.findElement(By.xpath("//*[@class='logo img-responsive']")).click();
	    	System.out.println("Logged in successfully");
	    }
}
