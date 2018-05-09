package PageLibarary;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Actions.Rolebuttonaction;
import Actions.Rolecreationflowaction;
import Helpers.datahelper;
import PageObjects.Rolebutton;
import PageObjects.rolecreationflow;
import cucumber.api.java.en.Then;

public class roleflowstepdefinition {
	
	public List<HashMap<String,String>> map;
    public WebDriver driver;
	public roleflowstepdefinition(){
	 driver=Hooks.driver;	
	 map=datahelper.data("D:\\seleniumclass\\eclipse neon\\automation testing\\BDD\\excelfiles\\bddexcel.xlsx", "Sheet2");
	}
	
	@Then("^click on the role button$")
	public void click_on_the_role_button() throws Throwable {
		PageFactory.initElements(driver, Rolebutton.class);
	    Rolebuttonaction.execute(driver);
	   
	}

	@Then("^click on the new role button and enter the role creation details with \"([^\"]*)\" data set$")
	public void click_on_the_new_role_button_and_enter_the_role_creation_details_with_data_set(String arg1) throws Throwable {
		PageFactory.initElements(driver, rolecreationflow.class);
	    Rolecreationflowaction.execute(driver, map);
	}

}
