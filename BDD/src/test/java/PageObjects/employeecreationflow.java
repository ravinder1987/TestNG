package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class employeecreationflow {
	
	@FindBy(how=How.ID, using="BtnNew")
	public static WebElement newemployeebutton;
	
	@FindBy(how=How.ID, using="txtUname")
	public static WebElement employername;
	
	@FindBy(how=How.ID, using="txtLpwd")           
	public static WebElement emploginpassword;
	
	@FindBy(how=How.XPATH,using="//*[@id='lst_Roles']")
	public static Select empRole_listbox;
	
	@FindBy(how=How.XPATH, using="//*[@id='lst_Branch']")
	public static Select empBranch_listbox;
	
	@FindBy(how=How.ID, using="BtnSubmit")
	public static WebElement empsubmit;
	
}
