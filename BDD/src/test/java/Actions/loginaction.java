package Actions;



import org.openqa.selenium.WebDriver;

import PageObjects.loginpage;

public class loginaction {

	public static void execute(WebDriver driver)
	{
		loginpage.userid.sendKeys("Admin");
		loginpage.password.sendKeys("Admin");
		loginpage.login.click();
		
		
	}
}
