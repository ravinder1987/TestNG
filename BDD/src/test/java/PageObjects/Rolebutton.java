package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Rolebutton {
	
	@FindBy(how=How.XPATH, using="//img[@src='images/Roles_but.jpg']")
	public static WebElement rolebutton;

}
