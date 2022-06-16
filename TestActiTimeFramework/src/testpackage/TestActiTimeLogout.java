package testpackage;

import org.testng.annotations.Test;

import generic.Flib;
import pagepackage.HomePage;
import pagepackage.LoginPage;

public class TestActiTimeLogout extends BaseTest {
	
       @Test
	public void actiTimeValidLogin()
	{

		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		validusername=flib.readPropertyFile(PROP_PATH, "username");
		validpassword=flib.readPropertyFile(PROP_PATH, "password");
		lp.actitimeinvalidlogin(validusername, validpassword);
		
		Thread.sleep(3000);
		
		HomePage hp = new HomePage(driver);
		hp.clickLogout();
	}

}
