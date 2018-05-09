package PageLibarary;

import org.openqa.selenium.WebDriver;

import Actions.employeetableaction;

import cucumber.api.java.en.Then;

public class employeetablestepdefinition {
    
	public WebDriver driver;
	public employeetablestepdefinition(){
		driver=Hooks.driver;
	}
	@Then("^update the employee table$")
	public void update_the_employee_table() throws Throwable {
		employeetableaction.execute(driver);
	    
	}
}
