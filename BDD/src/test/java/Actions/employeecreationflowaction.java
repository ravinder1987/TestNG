package Actions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;

import PageObjects.employeecreationflow;

public class employeecreationflowaction {
	public static void execute(WebDriver driver,List<HashMap<String,String>> map)
	{   
	    //int index=Integer.parseInt(arg1);
	    employeecreationflow.newemployeebutton.click();
	    employeecreationflow.employername.sendKeys(map.get(0).get("employername"));
	    employeecreationflow.emploginpassword.sendKeys(map.get(0).get("loginpwd"));
	    employeecreationflow.empRole_listbox.selectByVisibleText(map.get(0).get("role"));
	    employeecreationflow.empBranch_listbox.selectByVisibleText(map.get(0).get("Branch"));
	    employeecreationflow.empsubmit.click();
		
	}
}
