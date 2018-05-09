package PageLibarary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Actions.loginaction;
import PageObjects.loginpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginstepdefinition {
	
	public WebDriver driver;
	public loginstepdefinition(){
	 driver=Hooks.driver;	
	}
	
	@Given("^launch the site$")
	public void launch_the_site() throws Throwable {
		driver.get("http://srssprojects.in/home.aspx");	
	    
	}

	@When("^check the title with \"([^\"]*)\" data$")
	public void check_the_title_with_data(String arg1) throws Throwable {
		String actual = driver.getTitle();

		if (actual.contains("KEXIM Bank")) {
			System.out.println("Test is pass");
		} else {
			System.out.println("test is failed");
		}
	    
	}

	@Then("^home page should be displayed with login fields$")
	public void home_page_should_be_displayed_with_login_fields() throws Throwable {
		System.out.println("home page should be dispalyed with loginfileds ");    
	}

	@Then("^close the site$")
	public void close_the_site() throws Throwable {
	    driver.close();
	}

	@Then("^enter the user id and password fields$")
	public void enter_the_user_id_and_password_fields() throws Throwable {
	    PageFactory.initElements(driver, loginpage.class);
	    loginaction.execute(driver);
	}

	@Then("^branch button has to displayed$")
	public void branch_button_has_to_displayed() throws Throwable {
		System.out.println("bramch button has to dispalyed");
		
	}
	    

	
	    
	}


