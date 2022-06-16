package testpackage;

import java.io.IOException;

import org.testng.Reporter;

import generic.BaseTest;
import generic.Flib;
import pagepackage.LoginPage;

public class TestActiTimeInvalidLogin extends BaseTest {

	public void ActiTimevalidLogin() throws IOException, InterruptedException 

	{
		LoginPage lp = new LoginPage(driver);

		Flib flib = new Flib();

		int rc=flib.getRowCount(EXCEL_PATH, "invalidcreds");

		Reporter.log(rc+"",true);

		for (int i=1;i<=rc;i++)
		{
			String invalidusername = flib.readExcelData(EXCEL_PATH, "invlidcreds", i,0);
			String invalidpassword = flib.readExcelData(EXCEL_PATH, "invlidcreds", i,1);

			lp.actitimeinvalidlogin(invalidusername, invalidpassword);



		}

	}
}
