package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class employeebutton {
	@FindBy(how=How.XPATH, using="//img[@src='images/emp_btn.jpg']")
	public static WebElement empbutton;

}
