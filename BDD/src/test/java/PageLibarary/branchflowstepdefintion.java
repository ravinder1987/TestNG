package PageLibarary;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Actions.branchbuttonaction;
import Actions.branchflowaction;

import Helpers.datahelper;
import PageObjects.branchbutton;
import PageObjects.branchflow;


import cucumber.api.java.en.Then;

public class branchflowstepdefintion {
	public WebDriver driver;
	
	public List<HashMap<String,String>> map;
	public branchflowstepdefintion(){
	 driver=Hooks.driver;	
	 map=datahelper.data("D:\\seleniumclass\\eclipse neon\\automation testing\\BDD\\excelfiles\\cucumberexcel.xlsx","Sheet1");
	 
	}
	@Then("^click on the branch button$")
	public void click_on_the_branch_button() throws Throwable {
		PageFactory.initElements(driver, branchbutton.class);
	    branchbuttonaction.execute(driver);
	}

	@Then("^click on the new branch and enter the branch details with \"([^\"]*)\" data set$")
	public void click_on_the_new_branch_and_enter_the_branch_details_with_data_set(String arg1) throws Throwable {
		
		int index=Integer.parseInt(arg1)-1;
		PageFactory.initElements(driver, branchflow.class);
	    branchflowaction.execute(driver, map, index);
	    
	    
	    
		
	}
	    
	
	    
	


}
