package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import pagepackage.LoginPage;

public class TestActiTimeValidLogin extends BaseTest {


	@Test
	public void ActiTimevalidLogin() throws IOException, InterruptedException 

	{
		LoginPage lp = new LoginPage(driver);

		Flib flib = new Flib();
		String validusername = flib.readPropertyFile(PROP_PATH, "username");
		String validpassword = flib.readPropertyFile(PROP_PATH, "password");
		lp.actitimevalidlogin(validusername, validpassword);



	}

}

