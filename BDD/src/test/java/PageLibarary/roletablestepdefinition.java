package PageLibarary;

import org.openqa.selenium.WebDriver;

import Actions.roletableaction;
import cucumber.api.java.en.Then;

public class roletablestepdefinition {
	
	public WebDriver driver;
	public roletablestepdefinition(){
		driver=Hooks.driver;
	}
	@Then("^update the role table$")
	public void update_the_role_table() throws Throwable {
		roletableaction.execute(driver);   
	}

}
