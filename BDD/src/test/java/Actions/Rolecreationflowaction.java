package Actions;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.WebDriver;

import PageObjects.rolecreationflow;


public class Rolecreationflowaction {

	public static void execute(WebDriver driver,List<HashMap<String,String>> map)
	{   
	    //int index=Integer.parseInt(arg1);
		rolecreationflow.NewRolebutton.click();
		rolecreationflow.Rolename.sendKeys(map.get(0).get("Rolename"));
		rolecreationflow.Roledesc.sendKeys(map.get(0).get("Roledesc"));
		rolecreationflow.Roletype.selectByVisibleText(map.get(0).get("Roletype"));
		rolecreationflow.rolesubmit.click();
		
		
	}
}
