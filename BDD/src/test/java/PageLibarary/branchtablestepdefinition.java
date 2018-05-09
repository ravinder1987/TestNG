package PageLibarary;

import org.openqa.selenium.WebDriver;

import Actions.branchtableaction;

import cucumber.api.java.en.Then;

public class branchtablestepdefinition {
	public WebDriver driver;
	public branchtablestepdefinition(){
		driver=Hooks.driver;
	}

	@Then("^update the branch table$")
	public void update_the_branch_table() throws Throwable {
	
		branchtableaction.execute(driver);
		
	    
	}

}
