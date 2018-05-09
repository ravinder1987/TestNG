package PageLibarary;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Actions.employeebuttonaction;
import Actions.employeecreationflowaction;
import Helpers.datahelper;
import PageObjects.employeebutton;
import PageObjects.employeecreationflow;
import cucumber.api.java.en.Then;

public class employeeflowstepdefiniton {
	public List<HashMap<String,String>> map;  
	public WebDriver driver;
		public employeeflowstepdefiniton(){
		 driver=Hooks.driver;
		 map=datahelper.data("D:\\seleniumclass\\eclipse neon\\automation testing\\BDD\\excelfiles\\bddexcel.xlsx", "Sheet3");
		}
	@Then("^click on the employee button$")
	public void click_on_the_employee_button() throws Throwable {
		PageFactory.initElements(driver, employeebutton.class);
	    employeebuttonaction.execute(driver);
	   
	}

	@Then("^click on the new employee button and enter the employee creation details with \"([^\"]*)\" data set$")
	public void click_on_the_new_employee_button_and_enter_the_employee_creation_details_with_data_set(String arg1) throws Throwable {
		PageFactory.initElements(driver, employeecreationflow.class);
	    employeecreationflowaction.execute(driver, map);   
	}

}
