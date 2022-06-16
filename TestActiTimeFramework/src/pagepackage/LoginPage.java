package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement password;
	@FindBy(xpath="//a[text()='Login']") private WebElement loginbtn;
	@FindBy(xpath="//img[contains(@src,'sloagan')]") private WebElement keepontrack;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(xpath="//td[text()='Please identify yourself']") private WebElement identity;



	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	//utilization

	public WebElement getUsn() {
		return usn;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}


	public WebElement getKeepontrack() {
		return keepontrack;
	}


	public WebElement getLogo() {
		return logo;
	}


	public WebElement getIdentity() {
		return identity;
	}


	//generic reusable method

	public void actitimevalidlogin(String validUsername,String validPasword) throws InterruptedException
	{    
		Thread.sleep(2000);
		usn.sendKeys(validUsername);
		password.sendKeys(validPasword);
		loginbtn.click();


	}



	public void actitimeinvalidlogin(String invalidUsername,String invalidPasword) throws InterruptedException
	{
		usn.sendKeys(invalidUsername);
		password.sendKeys(invalidPasword);
		loginbtn.click();
		Thread.sleep(4000);
		usn.clear();
		password.clear();
		Thread.sleep(3000);


	}


}
